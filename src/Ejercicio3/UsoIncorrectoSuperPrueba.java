package Ejercicio3;

public class UsoIncorrectoSuperPrueba {

    public void iniciar() {
        // --- CASO 1: USAR SUPER FUERA DE UNA CLASE DERIVADA ---
        // Esta clase no hereda de Planta (hereda implícitamente de Object).
        // Si intentas referenciar un miembro de Planta con super, no compila:
        // Error: cannot find symbol - variable nombreCientifico
        // super.nombreCientifico = "Cattleya";

        Orquidea orquidea = new Orquidea("Cattleya trianae");
        orquidea.intentarAccesoPrivado();

        System.out.println("\n--- DISCUSIÓN EJERCICIO 3 ---");
        System.out.println("1. Fuera de una subclase: 'super' apunta únicamente a la superclase directa de la clase actual. "
                + "Usarlo en una clase no relacionada con Planta genera error porque no existe vínculo de herencia.");
        System.out.println("2. Con atributos private: Aunque exista herencia (Orquidea extends Planta), el modificador "
                + "'private' oculta el atributo incluso a las subclases; 'super' no rompe el encapsulamiento.");
    }
}