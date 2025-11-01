package resolHeltnerM.ejercicio2;

public class Vehiculo {
    private String marca;
    private int modelo;
    private double kilometros;

    public Vehiculo(String marca, int modelo, double kilometros) {
        setMarca(marca);
        setModelo(modelo);
        setKilometros(kilometros);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = (marca != null && !marca.isEmpty()) ? marca : "Desconocida";
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = (modelo > 1900) ? modelo : 2000;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = (kilometros >= 0) ? kilometros : 0;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Kilómetros: " + kilometros);
    }

    public void recorrer(int kms) {
        if (kms > 0) {
            kilometros += kms;
            System.out.println("Nuevo kilometraje: " + kilometros);
        } else {
            System.out.println("Debe ingresar una distancia válida.");
        }
    }

    public void proximoServicio() {
        int siguienteServicio = ((int)(kilometros / 10000) + 1) * 10000;
        System.out.println("Próximo servicio a los: " + siguienteServicio + " km");
    }
}