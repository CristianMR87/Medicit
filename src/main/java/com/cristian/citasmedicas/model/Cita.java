package com.cristian.citasmedicas.model;


import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Cita {

    private Long id;
    private Usuario paciente;
    private Doctor doctor;
    private LocalDateTime fechaHora;
    private String estado; // "PENDIENTE", "CONFIRMADA", "CANCELADA"
}
