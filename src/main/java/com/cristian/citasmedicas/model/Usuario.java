package com.cristian.citasmedicas.model;

import com.cristian.citasmedicas.model.enums.Rol;
import lombok.Data;

@Data
public abstract class Usuario {

    private int id;
    private String email;
    private String password;
    private Rol rol;
}
