package resolHeltnerM.ejercicio5;

public class Jubilado extends Cliente {
    public Jubilado(String nombre, String dni, String fechaPrestamo, double monto, String fechaPagoPactada) {
        super(nombre, dni, fechaPrestamo, monto, fechaPagoPactada);
    }

    @Override
    public double calcularInteres(double monto, int meses) {
        return monto * 0.08 * meses;
    }
}