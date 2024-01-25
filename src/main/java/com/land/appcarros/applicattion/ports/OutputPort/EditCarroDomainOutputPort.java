package com.land.appcarros.applicattion.ports.OutputPort;

import com.land.appcarros.applicattion.core.domain.CarroDomain;

public interface EditCarroDomainOutputPort {

    void edit(Long id, CarroDomain carroDomain);
}
