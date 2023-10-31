package com.hotel.reservas.crud;

import com.hotel.reservas.entity.Huesped;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HuespedCrudRepository extends JpaRepository<Huesped,Integer> {
//    Huesped findByCedulaOrderByEdadAsc(String cedula);
}
