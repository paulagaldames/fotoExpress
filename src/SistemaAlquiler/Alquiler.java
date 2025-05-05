package SistemaAlquiler;

import java.time.LocalDate;

public class Alquiler {
    private Cliente cliente;
    private Camara camara;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private LocalDate fechaDevolucion;
    private String estado; // Devuelto, En Alquiler

    public Alquiler(Cliente cliente, Camara camara, LocalDate fechaInicio, LocalDate fechaFin) {
        this.cliente = cliente;
        this.camara = camara;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = "En Alquiler";
    }


    public Cliente getCliente() {
        return cliente;
    }
    public Camara getCamara() {
        return camara;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
