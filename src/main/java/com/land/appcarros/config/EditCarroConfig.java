package com.land.appcarros.config;

import com.land.appcarros.applicattion.core.useCase.EditCarroDomainUseCase;
import com.land.appcarros.applicattion.ports.OutputPort.EditCarroDomainOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EditCarroConfig {

    @Bean
    public EditCarroDomainUseCase editCarroDomainUseCase(EditCarroDomainOutputPort outputPort) {
        return new EditCarroDomainUseCase(outputPort);
    }
}
