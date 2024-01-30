package com.land.appcarros.adapters.out.exception;

import com.land.appcarros.adapters.out.repository.CarroRespository;
import com.land.appcarros.adapters.out.repository.entity.CarroEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ValidadorCarroImpl implements ValidadorCarro{

    private CarroRespository respository;

    @Autowired
    public ValidadorCarroImpl(CarroRespository respository) {
        this.respository = respository;
    }

    @Override
    public CarroEntity validarCarroPeloId(Long id) {
        Optional<CarroEntity> carroEntity = respository.findById(id);
        return carroEntity.orElseThrow(() -> new ObjectNotFoundException("Não foi possível localizar na nossa base de dados nenhum elemento com esse ID."+ id));
    }
}
