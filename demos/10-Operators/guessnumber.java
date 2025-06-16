import java.util.Scanner;
import java.util.Random;

public class guessnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // número entre 1 y 100
        int intento = 0;
        int intentosRealizados = 0;

        System.out.println("¡Bienvenido! Estoy pensando en un número entre 1 y 100.");
        System.out.println("¿Puedes adivinar cuál es?");

        while (intento != numeroSecreto) {
            System.out.print("Introduce tu intento: ");
            intento = scanner.nextInt();
            intentosRealizados++;

            if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (intento > numeroSecreto) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentosRealizados + " intentos.");
            }
        }

        scanner.close();
    }
}