package com.cristian.citasmedicas.model;

import com.cristian.citasmedicas.model.enums.Rol;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Doctor extends Usuario{
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Especialidad especialidad;
    private String horario; 

    @Override
    public Rol getRol() {
        return Rol.DOCTOR;
    }
}