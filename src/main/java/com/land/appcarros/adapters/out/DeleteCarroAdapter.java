package com.land.appcarros.adapters.out;

import com.land.appcarros.adapters.out.exception.ValidadorCarro;
import com.land.appcarros.adapters.out.repository.CarroRespository;
import com.land.appcarros.applicattion.ports.OutputPort.DeleteCarroDomainOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCarroAdapter implements DeleteCarroDomainOutputPort {

    private CarroRespository respository;
    private ValidadorCarro validadorCarro;

    @Autowired
    public DeleteCarroAdapter(CarroRespository respository, ValidadorCarro validadorCarro) {
        this.respository = respository;
        this.validadorCarro = validadorCarro;
    }

    @Override
    public void deleteCar(Long id) {
        var carro = validadorCarro.validarCarroPeloId(id);
        respository.deleteById(carro.getId());
    }

}
