package com.land.appcarros.config;


import com.land.appcarros.applicattion.core.useCase.ShowCarroDomainUseCase;
import com.land.appcarros.applicattion.ports.OutputPort.ShowCarroDomainOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ShowCarroConfig {

    @Bean
    public ShowCarroDomainUseCase showCarroDomainUseCase(ShowCarroDomainOutputPort outputPort) {
        return new ShowCarroDomainUseCase(outputPort);
    }
}
