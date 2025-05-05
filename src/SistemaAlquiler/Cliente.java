package SistemaAlquiler;

import java.time.LocalDate;

public class Cliente{
    private String nombre;
    private String rut;
    private Integer telefono;
    private String direccion;
    private Integer diasPenalizacion;
    private LocalDate fechaFinPenalizacion;

    public Cliente(String nombre, String rut, Integer telefono, String direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.telefono = telefono;
        this.direccion = direccion;
        this.diasPenalizacion = diasPenalizacion;
        this.fechaFinPenalizacion = fechaFinPenalizacion;
    }

    public String getNombre() {
        return nombre;
    }
    public String getRut() {
        return rut;
    }
    public Integer getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public Integer getDiasPenalizacion() {
        return diasPenalizacion;
    }
    public LocalDate getFechaFinPenalizacion() {
        return fechaFinPenalizacion;
    }
    public void setFechaFinPenalizacion(LocalDate fechaFinPenalizacion) {
        this.fechaFinPenalizacion = fechaFinPenalizacion;
    }
}

