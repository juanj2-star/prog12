package co.edu.umanizales.objetodereferencia;

/**
 * Clase que representa un color con un código y descripción.
 */
public class Color {
    // Atributos públicos según lo solicitado
    public byte code;
    public String description;

    /**
     * Constructor de la clase Color
     * @param code Código numérico del color
     * @param description Descripción del color
     */
    public Color(byte code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Color {code: %d, description: '%s'}", 
                code, description);
    }
}
