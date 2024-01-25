package com.land.appcarros.applicattion.core.useCase;

import com.land.appcarros.applicattion.core.domain.CarroDomain;
import com.land.appcarros.applicattion.ports.OutputPort.FindAllCarroDomainOutputPort;
import com.land.appcarros.applicattion.ports.inputPort.FindAllCarroDomainInputPort;

import java.util.List;

public class FindAllCarroDomainUseCase implements FindAllCarroDomainInputPort {

    private final FindAllCarroDomainOutputPort findAllCarroDomainOutputPort;

    public FindAllCarroDomainUseCase(FindAllCarroDomainOutputPort findAllCarroDomainOutputPort) {
        this.findAllCarroDomainOutputPort = findAllCarroDomainOutputPort;
    }

    @Override
    public List<CarroDomain> findAll() {
        return findAllCarroDomainOutputPort.findAll();
    }
}
