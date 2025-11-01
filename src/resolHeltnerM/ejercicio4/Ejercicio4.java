package resolHeltnerM.ejercicio4;

public class Ejercicio4 {
    public static void ejecutar() {
        Empleado admin1 = new Administrativo("Matias Heltner", "41109929", 850000, 12, true);
        Empleado prod1 = new Produccion("Sofia Dacunda", "44288357", 600000, 7, "nocturno");

        admin1.mostrarInformacion();
        prod1.mostrarInformacion();

        System.out.println("Total de empleados registrados: " + Empleado.getTotalEmpleados());
    }
}