package co.edu.umanizales.objetodereferencia.vehiculo;

public class Monopatin extends Vehiculo {
    private boolean electrico;

    public Monopatin(String marca, int anio, boolean electrico) {
        super("Monopatín", marca, anio);
        this.electrico = electrico;
    }

    @Override
    public void acelerar() {
        System.out.println("El monopatín está acelerando... ¡DESLIZÁNDOSE SUAVEMENTE!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: " + (electrico ? "Eléctrico" : "Mecánico");
    }
}
