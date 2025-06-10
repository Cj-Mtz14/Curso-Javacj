import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        if (args.length == 0) {
System.out.println("Tienes que añadir un entero en la linea de comandos ");
        } else {
            int number = Integer.valueOf(args [0]);
            if ((number % 2) == 0) {

                System.out.printf("El numero %s es par", number);
            } else {
                System.out.printf("El numero %s es impar ");


            }


        }
    }


    }

