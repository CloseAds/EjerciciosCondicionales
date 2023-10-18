import java.util.Scanner;
public class Condicional5 {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println(" Introduce el numero de alumnos ");
        double classmates = s.nextDouble();

        if (classmates >= 100) {
            double pagoTotal = classmates * 65 ;
            System.out.println(" El pago de cada alumno es de 65€ ");
            System.out.println(" El pago total por el servicio es de: "+pagoTotal+ "€");
        }
        else if ( classmates <= 99 && classmates >=50){
            double pagoTotal2 = classmates * 70;
            System.out.println(" El pago de cada alumno es de 70€ ");
            System.out.println(" El pago total por el servicio es de "+pagoTotal2+ "€");
        }
        else if ( classmates <50 && classmates >= 30) {
            double pagoTotal3 = classmates * 95;
            System.out.println(" El pago de cada alumno es de 95€ ");
            System.out.println(" El pago total por el servicio es de: "+pagoTotal3+ "€");
        }
        else {
            double pagoTotalClassmate = classmates / 4000;
            System.out.println(" El pago de cada alumno es de: "+pagoTotalClassmate+ "€");
            System.out.println(" El pago total por el servicio es de 4000€ ");


        }
    }

}
