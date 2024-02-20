package Endes_trabajo_4;

public class Main {
    /**
     * Programa principal
     * codigo principal que ejecuta todo el programa
     * @author Daniel Santamarta Reguera / Tunivers
     * @version 1.0,20/02/2024
     */
    public static void main(String[] args) {
        Auto auto1 = new Auto("Peugeot", "308");
        Auto auto2 = new Auto("Seat", "Leon");

        Concesionario concesionario1 = new Concesionario();

        concesionario1.agregarAuto(auto1);
        concesionario1.agregarAuto(auto2);

        concesionario1.imprimirAutos();
    }
}
