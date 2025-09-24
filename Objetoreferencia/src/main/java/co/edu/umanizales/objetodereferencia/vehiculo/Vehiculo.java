package co.edu.umanizales.objetodereferencia.vehiculo;

public abstract class Vehiculo {
    private String tipo;
    private String marca;
    private int anio;

    public Vehiculo(String tipo, String marca, int anio) {
        this.tipo = tipo;
        this.marca = marca;
        this.anio = anio;
    }

    public abstract void acelerar();
    
    @Override
    public String toString() {
        return "Vehículo: " + tipo + ", Marca: " + marca + ", Año: " + anio;
    }
}
