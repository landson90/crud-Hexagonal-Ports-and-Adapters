package com.land.appcarros.config;

import com.land.appcarros.applicattion.core.useCase.DeleteCarroDomainUseCase;
import com.land.appcarros.applicattion.ports.OutputPort.DeleteCarroDomainOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DeleteCarroConfig {



    @Bean
    public DeleteCarroDomainUseCase deleteCarroDomainUseCase(DeleteCarroDomainOutputPort outputPort) {
        return new DeleteCarroDomainUseCase(outputPort);
    }
}
