package resolHeltnerM.ejercicio5;

public class ClienteServiciosPublicos extends Cliente {
    public ClienteServiciosPublicos(String nombre, String dni, String fechaPrestamo, double monto, String fechaPagoPactada) {
        super(nombre, dni, fechaPrestamo, monto, fechaPagoPactada);
    }

    @Override
    public double calcularInteres(double monto, int meses) {
        return monto * 0.10 * meses;
    }
}