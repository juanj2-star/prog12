package co.edu.umanizales.objetodereferencia.vehiculo;

public class DemoVehiculos {
    public static void main(String[] args) {
        // Crear un arreglo de vehículos
        Vehiculo[] vehiculos = new Vehiculo[3];
        
        // Inicializar los vehículos
        vehiculos[0] = new Moto("Yamaha", 2022, 250);
        vehiculos[1] = new Carro("Toyota", 2023, "Gasolina");
        vehiculos[2] = new Monopatin("Xiaomi", 2023, true);
        
        // Mostrar información de los vehículos
        System.out.println("=== LISTA DE VEHÍCULOS ===");
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("\nVehículo " + (i + 1) + ":");
            System.out.println(vehiculos[i]);
            System.out.print("Acción: ");
            vehiculos[i].acelerar();
        }
        
        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }
}
