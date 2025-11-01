package resolHeltnerM.ejercicio1;

public class Ejercicio1 {
    public static void ejecutar() {
        Estudiante est1 = new Estudiante("Sofia Dacunda", 23, 7.8);
        Estudiante est2 = new Estudiante("Matias Heltner", 27, 9.5);
        Estudiante est3 = new Estudiante("Eises Ale", 20, 3.3);

        est1.mostrarInformacion();
        est1.aprobo();

        est2.mostrarInformacion();
        est2.aprobo();

        est3.mostrarInformacion();
        est3.aprobo();
    }
}