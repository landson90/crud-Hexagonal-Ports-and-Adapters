package com.land.appcarros.applicattion.ports.inputPort;

import com.land.appcarros.applicattion.core.domain.CarroDomain;

public interface InsertCarroDomainInputPort {

    CarroDomain insert(CarroDomain carroDomain);
}
