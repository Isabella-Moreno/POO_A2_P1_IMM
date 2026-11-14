package Ejercicio1;

import java.util.Scanner;

public class EmpleadoPrueba {

    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        System.out.print("Nombre del empleado: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Departamento: ");
        String departamento = sc.nextLine();

        Empleado empleado = new Empleado(nombre, edad, departamento);
        System.out.println("\n--- DETALLES DEL EMPLEADO ---");
        empleado.mostrarDetalles();
    }
}