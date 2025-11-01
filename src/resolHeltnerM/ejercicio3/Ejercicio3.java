package resolHeltnerM.ejercicio3;

public class Ejercicio3 {
    public static void ejecutar() {
        Cuenta cuenta = new Cuenta("12345678", 5000, "Matias Heltner");

        cuenta.consultarSaldo();
        cuenta.depositar(1500);
        cuenta.consultarSaldo();
        cuenta.retirar(2000);
        cuenta.consultarSaldo();
        cuenta.retirar(6000);
    }
}