package com.land.appcarros.applicattion.ports.OutputPort;

import com.land.appcarros.applicattion.core.domain.CarroDomain;

public interface ShowCarroDomainOutputPort {

    CarroDomain findById(Long id);
}
