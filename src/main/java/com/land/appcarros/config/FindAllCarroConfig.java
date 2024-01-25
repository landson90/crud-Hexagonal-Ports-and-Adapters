package com.land.appcarros.config;

import com.land.appcarros.applicattion.core.useCase.FindAllCarroDomainUseCase;
import com.land.appcarros.applicattion.ports.OutputPort.FindAllCarroDomainOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FindAllCarroConfig {

    @Bean
    public FindAllCarroDomainUseCase findAllCarroDomainUseCase(
            FindAllCarroDomainOutputPort findAllCarroDomainOutputPort
    ) {
        return new FindAllCarroDomainUseCase(findAllCarroDomainOutputPort);
    }
}
