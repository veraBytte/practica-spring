package com.hotel.reservas.repository;

import com.hotel.reservas.entity.Huesped;

import java.util.List;

public interface HuespedRepository {
    List<Huesped> getAll();
    Huesped getByCedula(int cedula);
    Huesped save(Huesped huesped);
}
