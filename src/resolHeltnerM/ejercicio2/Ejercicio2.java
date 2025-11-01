package resolHeltnerM.ejercicio2;

public class Ejercicio2 {
    public static void ejecutar() {
        Vehiculo v1 = new Vehiculo("Toyota", 2025, 1000);
        Vehiculo v2 = new Vehiculo("Taos", 2023, 55346);

        v1.mostrarInformacion();
        v1.proximoServicio();
        v1.recorrer(500);
        v1.proximoServicio();
        System.out.println("---------------------------");

        v2.mostrarInformacion();
        v2.proximoServicio();
        v2.recorrer(88000);
        v2.proximoServicio();
    }
}