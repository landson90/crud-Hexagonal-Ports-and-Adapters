package com.land.appcarros.applicattion.ports.inputPort;

import com.land.appcarros.applicattion.core.domain.CarroDomain;

import java.util.List;

public interface FindAllCarroDomainInputPort {

    List<CarroDomain> findAll();
}
