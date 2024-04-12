package com.land.appcarros.adapters.in.mapper;


import com.land.appcarros.adapters.in.request.CarroRequest;
import com.land.appcarros.adapters.in.response.CarroResponse;
import com.land.appcarros.applicattion.core.domain.CarroDomain;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarroMapperController {

    CarroResponse toCarroResponse(CarroDomain carroDomain);

    CarroDomain toCarroDomain(CarroRequest request);

    List<CarroResponse> toCarroResponseList(List<CarroDomain> carroDomainList);

}
