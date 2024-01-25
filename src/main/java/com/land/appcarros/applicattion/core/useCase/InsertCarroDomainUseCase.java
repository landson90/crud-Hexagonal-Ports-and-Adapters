package com.land.appcarros.applicattion.core.useCase;

import com.land.appcarros.applicattion.core.domain.CarroDomain;
import com.land.appcarros.applicattion.ports.OutputPort.InsertCarroDomainOutputPort;
import com.land.appcarros.applicattion.ports.inputPort.InsertCarroDomainInputPort;

public class InsertCarroDomainUseCase implements InsertCarroDomainInputPort {

    private final InsertCarroDomainOutputPort insertCarroOutputPort;

    public InsertCarroDomainUseCase(InsertCarroDomainOutputPort insertCarroOutputPort) {
        this.insertCarroOutputPort = insertCarroOutputPort;
    }

    @Override
    public CarroDomain insert(CarroDomain carroDomain) {
        return insertCarroOutputPort.insert(carroDomain);
    }
}
