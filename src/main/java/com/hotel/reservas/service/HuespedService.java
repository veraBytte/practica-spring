package com.hotel.reservas.service;

import com.hotel.reservas.HuespedImp;
import com.hotel.reservas.entity.Huesped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HuespedService {

    @Autowired
    HuespedImp implementacion;

    public List<Huesped> getAll() {
        return implementacion.getAll();
    }

    public Huesped create(Huesped huesped){
        return implementacion.save(huesped);
    }
}
