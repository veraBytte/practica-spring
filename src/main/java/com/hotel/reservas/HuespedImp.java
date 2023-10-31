package com.hotel.reservas;

import com.hotel.reservas.crud.HuespedCrudRepository;
import com.hotel.reservas.entity.Huesped;
import com.hotel.reservas.repository.HuespedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class HuespedImp implements HuespedRepository {

    @Autowired
    private HuespedCrudRepository crud;

    @Override
    public List<Huesped> getAll() {
        return crud.findAll();
    }

    @Override
    public Huesped getByCedula(int cedula) {
        return null;
    }

    @Override
    public Huesped save(Huesped huesped) {
        return crud.save(huesped);
    }
}
