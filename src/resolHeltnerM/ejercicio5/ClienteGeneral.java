package resolHeltnerM.ejercicio5;

public class ClienteGeneral extends Cliente {
    public ClienteGeneral(String nombre, String dni, String fechaPrestamo, double monto, String fechaPagoPactada) {
        super(nombre, dni, fechaPrestamo, monto, fechaPagoPactada);
    }

    @Override
    public double calcularInteres(double monto, int meses) {
        return monto * 0.15 * meses;
    }
}