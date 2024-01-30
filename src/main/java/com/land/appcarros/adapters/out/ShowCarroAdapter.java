package com.land.appcarros.adapters.out;

import com.land.appcarros.adapters.out.exception.ObjectNotFoundException;
import com.land.appcarros.adapters.out.mapper.CarroMapperAdapters;
import com.land.appcarros.adapters.out.repository.CarroRespository;
import com.land.appcarros.adapters.out.repository.entity.CarroEntity;
import com.land.appcarros.applicattion.core.domain.CarroDomain;
import com.land.appcarros.applicattion.ports.OutputPort.ShowCarroDomainOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class ShowCarroAdapter implements ShowCarroDomainOutputPort {

    private  CarroRespository respository;
    private  CarroMapperAdapters mapperAdapters;

    @Autowired
    public ShowCarroAdapter(CarroRespository respository, CarroMapperAdapters mapperAdapters) {
        this.respository = respository;
        this.mapperAdapters = mapperAdapters;
    }

    @Override
    public CarroDomain findById(Long id) {
        var carro = validarCarroPeloId(id);
        return mapperAdapters.toCarroDomain(carro);
    }

    private CarroEntity validarCarroPeloId(Long id) {
        Optional<CarroEntity> carroEntity = respository.findById(id);
        return carroEntity.orElseThrow(() -> new ObjectNotFoundException("Não foi possível localizar na nossa base de dados nenhum elemento com esse ID."+ id));
    }
}
