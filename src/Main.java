import SistemaAlquiler.Alquiler;
import SistemaAlquiler.Camara;
import SistemaAlquiler.Cliente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Se ingresan datos de prueba
        Cliente cliente = new Cliente("Mirella", "16.123.456-7", 123456789, "Calle 123");
        Camara camara = new Camara("Sony", "A6400", true);
        ServicioAlquiler servicio = new ServicioAlquiler();

        LocalDate hoy = LocalDate.now();
        boolean alquilada = servicio.alquilarCamara(cliente, camara, hoy);

        if (alquilada) {
            System.out.println("Alquiler realizado correctamente.");
        }

        // Simular devolución
        Alquiler alquiler = servicio.getAlquileres().getFirst();
        LocalDate fechaDevolucion = hoy.plusDays(8); // Se indica que al dia 8 esta al dia, si se cambia el numero de dia cambiara a retraso y aplica penalizacion.
        servicio.devolverCamara(alquiler, fechaDevolucion);
}

static class ServicioAlquiler {
    private List<Alquiler> alquileres = new ArrayList<>();

    public boolean alquilarCamara(Cliente cliente, Camara camara, LocalDate fechaInicio) {
        if (cliente.getFechaFinPenalizacion() != null &&
                cliente.getFechaFinPenalizacion().isAfter(LocalDate.now())) {
            System.out.println("Cliente penalizado hasta: " + cliente.getFechaFinPenalizacion());
            return false;
        }

        if (yaTieneAlquilerActivo(cliente)) {
            System.out.println("Cliente ya tiene una cámara alquilada.");
            return false;
        }

        Alquiler nuevoAlquiler = new Alquiler(cliente, camara, fechaInicio, fechaInicio.plusDays(8));
        alquileres.add(nuevoAlquiler);
        return true;
    }

    public void devolverCamara(Alquiler alquiler, LocalDate fechaDevolucion) {
        alquiler.setFechaDevolucion(fechaDevolucion);

        if (fechaDevolucion.isAfter(alquiler.getFechaFin())) {
            aplicarPenalizacion(alquiler.getCliente());
            System.out.println("La cámara fue devuelta con retraso.");
        } else {
            System.out.println("La cámara fue devuelta a tiempo.");
        }
    }

    private void aplicarPenalizacion(Cliente cliente) {
        LocalDate penalizadoHasta = LocalDate.now().plusMonths(3);
        cliente.setFechaFinPenalizacion(penalizadoHasta);
        System.out.println("Penalización aplicada hasta: " + penalizadoHasta);
    }

    private boolean yaTieneAlquilerActivo(Cliente cliente) {
        return alquileres.stream()
                .anyMatch(a -> a.getCliente().equals(cliente) && a.getEstado().equals("Activo"));
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }
  }
}
