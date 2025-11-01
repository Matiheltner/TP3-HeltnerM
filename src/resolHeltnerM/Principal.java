package resolHeltnerM;

import java.util.Scanner;

import resolHeltnerM.ejercicio1.Ejercicio1;
import resolHeltnerM.ejercicio2.Ejercicio2;
import resolHeltnerM.ejercicio3.Ejercicio3;
import resolHeltnerM.ejercicio4.Ejercicio4;
import resolHeltnerM.ejercicio5.Ejercicio5;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== TP3 - Selección de Ejercicio ====");
        System.out.println("1. Registro de Estudiantes");
        System.out.println("2. Registro de Vehículos");
        System.out.println("3. Cuenta Bancaria");
        System.out.println("4. Gestión de Empleados");
        System.out.println("5. Gestión de Préstamos Bancarios");
        System.out.print("Ingrese el número del ejercicio que desea ejecutar: ");

        int opcion = scanner.nextInt();
        System.out.println();

        switch (opcion) {
            case 1:
                Ejercicio1.ejecutar();
                break;
            case 2:
                Ejercicio2.ejecutar();
                break;
            case 3:
                Ejercicio3.ejecutar();
                break;
            case 4:
                Ejercicio4.ejecutar();
                break;
            case 5:
                Ejercicio5.ejecutar();
                break;
            default:
                System.out.println("Opción inválida. Debe elegir entre 1 y 5.");
        }

        scanner.close();
    }
}