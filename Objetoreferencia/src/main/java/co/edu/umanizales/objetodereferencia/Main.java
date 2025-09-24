package co.edu.umanizales.objetodereferencia;

/**
 * Clase principal de la aplicación Objeto de Referencia.
 * Demuestra el uso de la clase Color.
 */
public class Main {
    /**
     * Punto de entrada principal de la aplicación.
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Crear un color rojo
        Color rojo = new Color((byte)1, "Rojo intenso", 255, 0, 0, "Rojo");
        System.out.println("Color 1: " + rojo);
        
        // Crear un color azul
        Color azul = new Color((byte)2, "Azul marino", 0, 0, 255, "Azul");
        System.out.println("Color 2: " + azul);
        
        // Modificar un componente del color
        rojo.setVerde(150);
        rojo.description = "Rojo anaranjado";
        System.out.println("\nColor 1 modificado: " + rojo);
        
        // Acceder a los atributos públicos
        System.out.println("\nInformación del color 1:");
        System.out.println("Código: " + rojo.code);
        System.out.println("Descripción: " + rojo.description);
        System.out.println("Hexadecimal: " + rojo.aHexadecimal());
    }
}
