package co.edu.umanizales.objetodereferencia.vehiculo;

public class Carro extends Vehiculo {
    private String tipoCombustible;

    public Carro(String marca, int anio, String tipoCombustible) {
        super("Carro", marca, anio);
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void acelerar() {
        System.out.println("El carro está acelerando... ¡BRUM BRUM!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Combustible: " + tipoCombustible;
    }
}
