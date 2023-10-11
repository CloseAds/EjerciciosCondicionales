import java.util.Scanner;

public class Condicional12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println(" Introduce un año");
        int x = entrada.nextInt();


        if (x%4 == 0)
            System.out.println(" El año es bisiesto ");
        else
            System.out.println(" El año no es bisiesto ");





    }

}
