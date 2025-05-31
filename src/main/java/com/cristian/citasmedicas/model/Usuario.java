package com.cristian.citasmedicas.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    @Column(unique = true)
    private String email;
    private String password;
    private String rol; // "PACIENTE", "DOCTOR", "ADMIN"
}
