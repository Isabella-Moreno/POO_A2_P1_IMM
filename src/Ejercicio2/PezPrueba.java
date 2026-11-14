package Ejercicio2;

import java.util.Scanner;

public class PezPrueba {

    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        System.out.print("Especie del pez: ");
        String especie = sc.nextLine();

        System.out.print("Tipo de agua (Dulce / Salada): ");
        String tipoDeAgua = sc.nextLine();

        Pez pez = new Pez(especie, tipoDeAgua);
        System.out.println("\n--- INFORMACIÓN DEL PEZ ---");
        pez.mostrarEspecie();
    }
}