package co.edu.umanizales.objetodereferencia.vehiculo;

public class Moto extends Vehiculo {
    private int cilindraje;

    public Moto(String marca, int anio, int cilindraje) {
        super("Moto", marca, anio);
        this.cilindraje = cilindraje;
    }

    @Override
    public void acelerar() {
        System.out.println("La moto está acelerando... ¡VROOM VROOM!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindraje: " + cilindraje + "cc";
    }
}
