package com.hotel.reservas.controller;

import com.hotel.reservas.entity.Huesped;
import com.hotel.reservas.service.HuespedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/huespeds")
public class HuespedController {
    @Autowired
    private HuespedService servicio;

    @GetMapping()
    public List<Huesped> getAll(){
        return servicio.getAll();
    }

    @PostMapping
    public Boolean create(@RequestBody Huesped huesped){
        servicio.create(huesped);
        return true;
    }

}
