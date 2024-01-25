package com.land.appcarros.adapters.in.controller;

import com.land.appcarros.adapters.in.mapper.CarroMapperController;
import com.land.appcarros.adapters.in.request.CarroRequest;
import com.land.appcarros.adapters.in.response.CarroResponse;
import com.land.appcarros.applicattion.core.domain.CarroDomain;
import com.land.appcarros.applicattion.ports.inputPort.FindAllCarroDomainInputPort;
import com.land.appcarros.applicattion.ports.inputPort.InsertCarroDomainInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/carros")
@RestController
public class CarroController {

    private InsertCarroDomainInputPort insertCarroDomainInputPort;
    private FindAllCarroDomainInputPort findAllCarroDomainInputPort;

    private CarroMapperController mapper;
    @Autowired
    public CarroController(InsertCarroDomainInputPort insertCarroDomainInputPort,
                           FindAllCarroDomainInputPort findAllCarroDomainInputPort,
                           CarroMapperController mapper) {
        this.insertCarroDomainInputPort = insertCarroDomainInputPort;
        this.findAllCarroDomainInputPort = findAllCarroDomainInputPort;
        this.mapper = mapper;
    }

    @GetMapping
    public ResponseEntity<List<CarroResponse>> index() {
        List<CarroDomain> list = findAllCarroDomainInputPort.findAll();
        List<CarroResponse>  response = mapper.toCarroResponseList(list);
        return ResponseEntity.ok().body(response);
    }
    @PostMapping
    public ResponseEntity<CarroResponse> save(@RequestBody CarroRequest request) {
        CarroDomain carroDomain = mapper.toCarroDomain(request);
        var response = insertCarroDomainInputPort.insert(carroDomain);
        return ResponseEntity.status(HttpStatus.CREATED).body(mapper.toCarroResponse(response));

    }



}
