package com.land.appcarros.adapters.out;

import com.land.appcarros.adapters.out.exception.ObjectNotFoundException;
import com.land.appcarros.adapters.out.mapper.CarroMapperAdapters;
import com.land.appcarros.adapters.out.repository.CarroRespository;
import com.land.appcarros.adapters.out.repository.entity.CarroEntity;
import com.land.appcarros.applicattion.core.domain.CarroDomain;
import com.land.appcarros.applicattion.ports.OutputPort.EditCarroDomainOutputPort;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EditCarroAdapter implements EditCarroDomainOutputPort {

    private  CarroRespository respository;
    private  CarroMapperAdapters mapperAdapters;

    @Autowired
    public EditCarroAdapter(CarroRespository respository, CarroMapperAdapters mapperAdapters) {
        this.respository = respository;
        this.mapperAdapters = mapperAdapters;
    }

    @Override
    public void edit(Long id, CarroDomain carroDomain) {
        CarroEntity carro = validarCarroPeloId(id);
        var carroEditDomain = mapperAdapters.toCarroEntity(carroDomain);
        BeanUtils.copyProperties(carroEditDomain, carro, "id");
        respository.save(carro);
    }

    private CarroEntity validarCarroPeloId(Long id) {
        Optional<CarroEntity> carroEntity = respository.findById(id);
        return carroEntity.orElseThrow(() -> new ObjectNotFoundException("Não foi possível localizar na nossa base de dados nenhum elemento com esse ID."+ id));
    }
}
