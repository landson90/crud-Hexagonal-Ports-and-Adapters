package com.land.appcarros.adapters.out.exception;

import com.land.appcarros.adapters.out.repository.entity.CarroEntity;

public interface ValidadorCarro {

    CarroEntity validarCarroPeloId(Long id);
}
