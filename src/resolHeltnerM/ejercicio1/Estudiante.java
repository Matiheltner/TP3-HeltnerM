package resolHeltnerM.ejercicio1;

public class Estudiante {
    private String nombre;
    private int edad;
    private double notaFinal;

    public Estudiante(String nombre, int edad, double notaFinal) {
        setNombre(nombre);
        setEdad(edad);
        setNotaFinal(notaFinal);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre != null && !nombre.isEmpty()) ? nombre : "Nombre desconocido";
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = (edad >= 0) ? edad : 0;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = (notaFinal >= 0 && notaFinal <= 10) ? notaFinal : 0;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota Final: " + notaFinal);
    }

    public void aprobo() {
        if (notaFinal < 6) {
            System.out.println("Estado: Desaprobado");
        } else if (notaFinal <= 8) {
            System.out.println("Estado: Regularizó");
        } else {
            System.out.println("Estado: Promocionó");
        }
        System.out.println("----------------------------");
    }
}