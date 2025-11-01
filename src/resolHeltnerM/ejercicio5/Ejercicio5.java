package resolHeltnerM.ejercicio5;

public class Ejercicio5 {
    public static void ejecutar() {
        Jubilado cliente1 = new Jubilado("Matias Heltner", "41109292", "2020-04-05", 50000, "2023-04-05");
        cliente1.setFechaPagoEfectiva("2023-04-05");
        double interes1 = cliente1.calcularInteres(cliente1.montoSolicitado, 6);
        cliente1.mostrarInformacion(interes1);

        ClienteServiciosPublicos cliente2 = new ClienteServiciosPublicos("Sofia Dacunda", "44288357", "2023-02-01", 70000, "2025-02-01");
        cliente2.setFechaPagoEfectiva("2025-02-01");
        double interes2 = cliente2.calcularInteres(cliente2.montoSolicitado, 5);
        cliente2.mostrarInformacion(interes2);

        ClienteGeneral cliente3 = new ClienteGeneral("Yamila Hadad", "36000793", "2021-03-01", 60000, "2024-03-01");
        cliente3.setFechaPagoEfectiva("2024-03-01");
        double interes3 = cliente3.calcularInteres(cliente3.montoSolicitado, 5);
        cliente3.mostrarInformacion(interes3);
    }
}