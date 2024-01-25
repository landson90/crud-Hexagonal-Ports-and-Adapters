package com.land.appcarros.adapters.out.mapper;

import com.land.appcarros.adapters.out.repository.entity.CarroEntity;
import com.land.appcarros.applicattion.core.domain.CarroDomain;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarroMapperAdapters {

    CarroDomain toCarroDomain(CarroEntity carroEntity);

    CarroEntity toCarroEntity(CarroDomain carroDomain);

    List<CarroDomain> toListCarroDomain(List<CarroEntity> carroEntityList);
}
