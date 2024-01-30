package com.land.appcarros.applicattion.core.useCase;

import com.land.appcarros.applicattion.core.domain.CarroDomain;
import com.land.appcarros.applicattion.ports.OutputPort.ShowCarroDomainOutputPort;
import com.land.appcarros.applicattion.ports.inputPort.ShowCarroDomainInputPort;

public class ShowCarroDomainUseCase implements ShowCarroDomainInputPort {

    private final ShowCarroDomainOutputPort outputPort;

    public ShowCarroDomainUseCase(ShowCarroDomainOutputPort outputPort) {
        this.outputPort = outputPort;
    }

    @Override
    public CarroDomain findById(Long id) {
        return outputPort.findById(id);
    }
}
