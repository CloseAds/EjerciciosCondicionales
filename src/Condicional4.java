import java.util.Scanner;

public class Condicional4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println(" Introduce un numero ");
        double numero = entrada.nextDouble();

        System.out.println(" Introduce un exponente ");
        double exponente = entrada.nextDouble();

        if (exponente == 0)
            System.out.println(" El resultado de la potencia es 1 ");
        else if (exponente < 0) {
            double resultado = 1 / (Math.pow(numero, -exponente));
            System.out.println(" Resultado de la potencia es: " + resultado);
        }
        else {

            double resultado2 = Math.pow(numero, exponente);
            System.out.println(" El resultado de la potencia es:" + resultado2);
        }
    }
}
