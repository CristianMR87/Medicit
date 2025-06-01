package com.cristian.citasmedicas.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Admin extends Usuario {
    private String nombreUsuario;
}
