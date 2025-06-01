package com.cristian.citasmedicas.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data

public class Paciente extends Usuario {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;

}
