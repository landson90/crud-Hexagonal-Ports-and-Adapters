package com.land.appcarros.applicattion.core.useCase;

import com.land.appcarros.applicattion.core.domain.CarroDomain;
import com.land.appcarros.applicattion.ports.OutputPort.EditCarroDomainOutputPort;
import com.land.appcarros.applicattion.ports.inputPort.EditCarroDomainInputPort;

public class EditCarroDomainUseCase implements EditCarroDomainInputPort {

    private final EditCarroDomainOutputPort outputPort;

    public EditCarroDomainUseCase(EditCarroDomainOutputPort outputPort) {
        this.outputPort = outputPort;
    }


    @Override
    public void edit(Long id, CarroDomain domain) {
        outputPort.edit(id, domain);
    }
}
