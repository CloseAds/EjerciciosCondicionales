import java.util.Scanner;

public class Condicional6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la duración de la llamada en minutos: ");
        int duracionLlamada = scanner.nextInt();

        System.out.println("Ingrese el día de la semana (1 para domingo, 2-7 para los demás días): ");
        int diaSemana = scanner.nextInt();

        System.out.println("Ingrese el turno (1 para mañana, 2 para tarde): ");
        int turno = scanner.nextInt();

        double costoLlamada = 0;


        if (duracionLlamada <= 5) {
            costoLlamada = duracionLlamada * 1.0;
        } else if (duracionLlamada <= 8) {
            costoLlamada = 5 * 1.0 + (duracionLlamada - 5) * 0.8;
        } else if (duracionLlamada <= 10) {
            costoLlamada = 5 * 1.0 + 3 * 0.8 + (duracionLlamada - 8) * 0.7;
        } else {
            costoLlamada = 5 * 1.0 + 3 * 0.8 + 2 * 0.7 + (duracionLlamada - 10) * 0.5;
        }


        if (diaSemana == 1) {  // Domingo
            costoLlamada += costoLlamada * 0.03;
        } else {
            if (turno == 1) {  // Mañana
                costoLlamada += costoLlamada * 0.15;
            } else if (turno == 2) {  // Tarde
                costoLlamada += costoLlamada * 0.10;
            }
        }

        System.out.println("El costo total de la llamada es: " + costoLlamada + " euros");
    }
}
