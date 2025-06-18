
import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Opciones posibles
        String[] options = {"piedra", "papel", "tijera"};

        System.out.println("¡Bienvenido a Piedra, Papel o Tijera!");
        System.out.print("Elige una opción (piedra, papel o tijera): ");
        String electionUsuario = scanner.nextLine().toLowerCase();

        // Validar entrada
        if (!electionUsuario.equals("piedra") &&
            !electionUsuario.equals("papel") &&
            !electionUsuario.equals("tijera")) {
            System.out.println("Opción no válida.");
            return;
        }

        // Elección de la computadora
        String electionComputadora = options[random.nextInt(3)];
        System.out.println("La computadora eligió: " + electionComputadora);

        // Determinar el resultado
        if (electionUsuario.equals(electionComputadora)) {
            System.out.println("¡Empate!");
        } else if (
            (electionUsuario.equals("piedra") && electionComputadora.equals("tijera")) ||
            (electionUsuario.equals("tijera") && electionComputadora.equals("papel")) ||
            (electionUsuario.equals("papel") && electionComputadora.equals("piedra "))
        ) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Perdiste...");
        }

        scanner.close();
    }
}