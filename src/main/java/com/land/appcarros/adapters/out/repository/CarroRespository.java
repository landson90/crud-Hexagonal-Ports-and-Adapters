package com.land.appcarros.adapters.out.repository;

import com.land.appcarros.adapters.out.repository.entity.CarroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRespository extends JpaRepository<CarroEntity, Long> {
}
