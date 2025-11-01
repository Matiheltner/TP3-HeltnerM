package resolHeltnerM.ejercicio5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public abstract class Cliente implements PrestamoCalculable {
    protected String nombre;
    protected String dni;
    protected LocalDate fechaPrestamo;
    protected double montoSolicitado;
    protected LocalDate fechaPagoPactada;
    protected LocalDate fechaPagoEfectiva;

    public Cliente(String nombre, String dni, String fechaPrestamoStr, double montoSolicitado, String fechaPagoPactadaStr) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaPrestamo = LocalDate.parse(fechaPrestamoStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.montoSolicitado = montoSolicitado;
        this.fechaPagoPactada = LocalDate.parse(fechaPagoPactadaStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public void setFechaPagoEfectiva(String fecha) {
        this.fechaPagoEfectiva = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public long calcularDiasAtraso() {
        if (fechaPagoEfectiva != null && fechaPagoEfectiva.isAfter(fechaPagoPactada)) {
            return ChronoUnit.DAYS.between(fechaPagoPactada, fechaPagoEfectiva);
        }
        return 0;
    }

    public double calcularPenalidad() {
        long diasAtraso = calcularDiasAtraso();
        return montoSolicitado * 0.02 * diasAtraso;
    }

    public void mostrarInformacion(double interesCalculado) {
        System.out.println("Cliente: " + nombre + " (DNI: " + dni + ")");
        System.out.println("Monto solicitado: $" + montoSolicitado);
        System.out.println("Fecha pactada de pago: " + fechaPagoPactada);
        System.out.println("Interés calculado: $" + interesCalculado);
        if (calcularDiasAtraso() > 0) {
            System.out.println("Días de atraso: " + calcularDiasAtraso());
            System.out.println("Penalidad por atraso: $" + calcularPenalidad());
        } else {
            System.out.println("El cliente pagó en término.");
        }
        System.out.println("Monto total a pagar: $" + (montoSolicitado + interesCalculado + calcularPenalidad()));
        System.out.println("--------------------------------------");
    }
}