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

// Verificar si la distancia está dentro del radio de 20 km
        if (distanciaDestino <= 20) {
            System.out.println("Ingrese el monto total de la compra:");
            double montoCompra = scanner.nextDouble();

            // Calcular costo de envío según las reglas de negocio
            double costoEnvio;
            if (montoCompra > 50000) {
                costoEnvio = 0; // Envío gratis
            } else if (montoCompra >= 25000 && montoCompra <= 49999) {
                costoEnvio = 150 * distanciaDestino; // $150 pesos por kilómetro recorrido
            } else {
                costoEnvio = 300 * distanciaDestino; // $300 pesos por kilómetro recorrido
            }

            // Mostrar los datos ingresados por el usuario y el costo de envío
            System.out.println("\nDatos de Salida:");
            System.out.println("La marca que ha ingresado es: " + marca);
            System.out.println("El modelo que ha ingresado es: " + modelo);
            System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
            System.out.println("El tipo de combustible es: " + tipoCombustible);
            System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");
            System.out.println("El costo de envío es: $" + costoEnvio + " pesos.");
        } else {
            System.out.println("Lo sentimos, el destino está fuera del área de cobertura.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}