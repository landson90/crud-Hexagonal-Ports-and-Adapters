package com.land.appcarros.config;


import com.land.appcarros.applicattion.core.useCase.InsertCarroDomainUseCase;
import com.land.appcarros.applicattion.ports.OutputPort.InsertCarroDomainOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCarroConfig {

    @Bean
    public InsertCarroDomainUseCase insertCarroDomainUseCase(
            InsertCarroDomainOutputPort insertCarroOutputPort
    ) {
        return new InsertCarroDomainUseCase(insertCarroOutputPort);
    }
}
