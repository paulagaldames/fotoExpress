package Persona;

import java.time.LocalDate;

public class Cliente extends Persona{

    private LocalDate fechaFinPenalizacion;

    public Cliente(String nombre, String apellido, String rut, String telefono, String Correo, LocalDate fechaFinPenalizacion) {
        super(nombre, apellido, rut, telefono, Correo);
        this.fechaFinPenalizacion = fechaFinPenalizacion;
    }

    public LocalDate getFechaFinPenalizacion() {
        return fechaFinPenalizacion;
    }

    public void setFechaFinPenalizacion(LocalDate fechaFinPenalizacion) {
        this.fechaFinPenalizacion = fechaFinPenalizacion;
    }
}
