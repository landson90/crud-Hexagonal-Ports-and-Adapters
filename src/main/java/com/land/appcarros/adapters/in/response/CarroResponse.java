package com.land.appcarros.adapters.in.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarroResponse {
    private Long id;
    private String modelo;
    private String marca;
}
