package com.land.appcarros.applicattion.ports.inputPort;

import com.land.appcarros.applicattion.core.domain.CarroDomain;

public interface EditCarroDomainInputPort {

    void edit(Long id, CarroDomain domain);
}
