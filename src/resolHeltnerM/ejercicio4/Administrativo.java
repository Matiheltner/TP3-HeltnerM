package resolHeltnerM.ejercicio4;

public class Administrativo extends Empleado {
    private boolean remoto;

    public Administrativo(String nombre, String dni, double sueldoBase, int antiguedad, boolean remoto) {
        super(nombre, dni, sueldoBase, antiguedad);
        this.remoto = remoto;
    }

    @Override
    public double calcularSalario() {
        double descuento = remoto ? 0.12 : 0.08;
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
        System.out.println("Administrativo: " + getNombre());
        System.out.println("DNI: " + getDni());
        System.out.println("Sueldo base: $" + getSueldoBase());
        System.out.println("Antigüedad: " + getAntiguedad() + " años");
        System.out.println("Modalidad: " + (remoto ? "Remoto" : "Presencial"));
        System.out.println("Sueldo neto: $" + calcularSalario());
        System.out.println("------------------------------");
    }
}