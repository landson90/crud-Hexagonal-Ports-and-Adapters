package com.land.appcarros.adapters.out;

import com.land.appcarros.adapters.out.mapper.CarroMapperAdapters;
import com.land.appcarros.adapters.out.repository.CarroRespository;
import com.land.appcarros.adapters.out.repository.entity.CarroEntity;
import com.land.appcarros.applicattion.core.domain.CarroDomain;
import com.land.appcarros.applicattion.ports.OutputPort.InsertCarroDomainOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class InsertCarroAdapter implements InsertCarroDomainOutputPort {

    @Autowired
    private CarroRespository carroRespository;
    @Autowired
    private CarroMapperAdapters mapper;
    @Override
    public CarroDomain insert(CarroDomain domain) {
        CarroEntity carroEntity = mapper.toCarroEntity(domain);
        return mapper.toCarroDomain(carroRespository.save(carroEntity));
    }
}
