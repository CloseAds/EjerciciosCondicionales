import java.util.Scanner;

public class Condicional11 {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println(" Introduce un numero ");
        int x = s.nextInt();

        if (x%2 == 0)
            System.out.println(" Es par! ");
        else
            System.out.println(" Es imapr! ");

        String salida = (x % 2 == 0) ? "Es Par" : " Es Impar";
        System.out.println(salida);


    }

}
