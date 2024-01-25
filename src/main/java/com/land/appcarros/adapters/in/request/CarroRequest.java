package com.land.appcarros.adapters.in.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarroRequest {

    private String modelo;
    private String marca;
}
