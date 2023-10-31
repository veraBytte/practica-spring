package com.hotel.reservas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "huespedes")
@Getter
@Setter
public class Huesped {
    @Id
    private Integer cedula;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String telefono;
    private String correo;
    private Integer edad;

    @OneToMany(mappedBy = "huesped")
    private List<Reserva> reservas;
}
