package resolHeltnerM.ejercicio3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cuenta {
    private String nroCuenta;
    private double saldo;
    private String titular;

    public Cuenta(String nroCuenta, double saldoInicial, String titular) {
        setNroCuenta(nroCuenta);
        setSaldo(saldoInicial);
        setTitular(titular);
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = (nroCuenta != null && !nroCuenta.isEmpty()) ? nroCuenta : "0000";
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = (saldo >= 0) ? saldo : 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = (titular != null && !titular.isEmpty()) ? titular : "Titular desconocido";
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            registrarTransaccion("Depósito", cantidad);
        } else {
            System.out.println("Cantidad inválida para depositar.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo && cantidad > 0) {
            saldo -= cantidad;
            registrarTransaccion("Retiro", cantidad);
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }

    public void registrarTransaccion(String tipo, double monto) {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fecha = ahora.format(formato);
        System.out.println("[" + fecha + "] " + tipo + " de $" + monto);
    }
}