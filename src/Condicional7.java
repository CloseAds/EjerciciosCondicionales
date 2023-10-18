import java.util.Scanner;

public class Condicional7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso del paquete en kilogramos: ");
        double pesoPaquete = scanner.nextDouble();

        System.out.println("Ingrese la zona de destino (1: América del Norte, 2: América Central, 3: América del Sur, 4: Europa, 5: Asia): ");
        int zonaDestino = scanner.nextInt();

        double costoPorKilogramo = 0;


        switch (zonaDestino) {
            case 1:
                costoPorKilogramo = 24.00;
                break;
            case 2:
                costoPorKilogramo = 20.00;
                break;
            case 3:
                costoPorKilogramo = 21.00;
                break;
            case 4:
                costoPorKilogramo = 10.00;
                break;
            case 5:
                costoPorKilogramo = 18.00;
                break;
            default:
                System.out.println("Zona de destino no válida. Entrega rechazada.");
                return;
        }


        if (pesoPaquete > 5.0) {
            System.out.println("El paquete pesa más de 5kg. Entrega rechazada por razones de logística y seguridad.");
        } else {
            double costoEntrega = pesoPaquete * costoPorKilogramo;
            System.out.println("El costo de entrega del paquete es: " + costoEntrega + " euros");
        }
    }
}







