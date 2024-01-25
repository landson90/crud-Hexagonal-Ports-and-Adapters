package com.land.appcarros.applicattion.ports.OutputPort;

import com.land.appcarros.applicattion.core.domain.CarroDomain;

import java.util.List;

public interface FindAllCarroDomainOutputPort {

    List<CarroDomain> findAll();
}
