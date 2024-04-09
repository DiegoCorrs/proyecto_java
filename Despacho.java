import java.util.Scanner;

public class Despacho {
    public static void main(String[] args) {
// Solicitar datos al usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la marca del vehículo:");
        String marca = scanner.nextLine();

        System.out.println("Ingrese el modelo del vehículo:");
        String modelo = scanner.nextLine();

        System.out.println("Ingrese la cilindrada del vehículo:");
        int cilindrada = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de nextInt

        System.out.println("Ingrese el tipo de combustible del vehículo:");
        String tipoCombustible = scanner.nextLine();

        System.out.println("Ingrese la capacidad en pasajeros del vehículo:");
        int capacidadPasajeros = scanner.nextInt();

        System.out.println("Ingrese la distancia al destino en kilómetros:");
        double distanciaDestino = scanner.nextDouble();
	}
}