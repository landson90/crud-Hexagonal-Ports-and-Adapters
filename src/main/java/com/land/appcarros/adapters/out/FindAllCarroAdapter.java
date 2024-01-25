package com.land.appcarros.adapters.out;

import com.land.appcarros.adapters.out.mapper.CarroMapperAdapters;
import com.land.appcarros.adapters.out.repository.CarroRespository;
import com.land.appcarros.applicattion.core.domain.CarroDomain;
import com.land.appcarros.applicattion.ports.OutputPort.FindAllCarroDomainOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindAllCarroAdapter implements FindAllCarroDomainOutputPort {

    private CarroRespository respository;
    private CarroMapperAdapters mapperAdapters;
    @Autowired
    public FindAllCarroAdapter(CarroRespository respository, CarroMapperAdapters mapperAdapters) {
        this.respository = respository;
        this.mapperAdapters = mapperAdapters;
    }

    @Override
    public List<CarroDomain> findAll() {
        var carroEntityList = respository.findAll();
        return mapperAdapters.toListCarroDomain(carroEntityList);
    }
}
