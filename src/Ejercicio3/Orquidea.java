package Ejercicio3;

public class Orquidea extends Planta {

    public Orquidea(String nombreCientifico) {
        super(nombreCientifico);
    }

    public void intentarAccesoPrivado() {
        // --- CASO 2: ERROR AL ACCEDER A ATRIBUTO PRIVATE CON SUPER ---
        // Descomenta la siguiente línea para observar el error de compilación:
        // Error: 'nombreCientifico' has private access in 'Ejercicio3.Planta'
        // System.out.println(super.nombreCientifico);

        // Forma correcta mediante el getter público heredado:
        System.out.println("Acceso correcto mediante getter heredado: " + super.getNombreCientifico());
    }
}