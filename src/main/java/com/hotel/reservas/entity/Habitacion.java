package com.hotel.reservas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "habitaciones")
@Getter
@Setter
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String tamaño;
    @Column(nullable = false)
    private String estado;
    @Column(nullable = false)
    private Double precio;

    @Column(name = "reserva_id")
    private Integer idReserva;

    //Relaciones
    @ManyToOne
    @JoinColumn(name = "idReserva", insertable = false, updatable = false)
    private Reserva reserva;
}
