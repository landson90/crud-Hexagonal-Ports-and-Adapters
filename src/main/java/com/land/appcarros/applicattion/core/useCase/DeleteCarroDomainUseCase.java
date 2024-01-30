package com.land.appcarros.applicattion.core.useCase;

import com.land.appcarros.applicattion.ports.OutputPort.DeleteCarroDomainOutputPort;
import com.land.appcarros.applicattion.ports.inputPort.DeleteCarroDomainInputPort;

public class DeleteCarroDomainUseCase implements DeleteCarroDomainInputPort {

    private final DeleteCarroDomainOutputPort outputPort;

    public DeleteCarroDomainUseCase(DeleteCarroDomainOutputPort outputPort) {
        this.outputPort = outputPort;
    }

    @Override
    public void deleteCar(Long id) {
        outputPort.deleteCar(id);
    }
}
