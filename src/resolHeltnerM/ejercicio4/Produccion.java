package resolHeltnerM.ejercicio4;

public class Produccion extends Empleado {
    private String turno; // "diurno" o "nocturno"

    public Produccion(String nombre, String dni, double sueldoBase, int antiguedad, String turno) {
        super(nombre, dni, sueldoBase, antiguedad);
        this.turno = turno.toLowerCase();
    }

    @Override
    public double calcularSalario() {
        double descuento = turno.equals("nocturno") ? 0.06 : 0.08;
        double neto = getSueldoBase() * (1 - descuento);

        if (getAntiguedad() > 15) {
            neto *= 1.20;
        } else if (getAntiguedad() > 10) {
            neto *= 1.15;
        } else if (getAntiguedad() > 5) {
            neto *= 1.10;
        }

        return neto;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Operario de Producción: " + getNombre());
        System.out.println("DNI: " + getDni());
        System.out.println("Sueldo base: $" + getSueldoBase());
        System.out.println("Antigüedad: " + getAntiguedad() + " años");
        System.out.println("Turno: " + turno);
        System.out.println("Sueldo neto: $" + calcularSalario());
        System.out.println("------------------------------");
    }
}