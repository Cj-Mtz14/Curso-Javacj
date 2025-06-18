
import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera2 {

    public static void jugar(String jugador) {
        String[] opciones = {"piedra", "papel", "tijera"};

        
        Random random = new Random();
        int indiceMaquina = random.nextInt(3);
        String maquina = opciones[indiceMaquina];

    
        System.out.println("Jugador eligió: " + jugador);
        System.out.println("Máquina eligió: " + maquina);

        
        int jugadorIndex = -1;
        for (int i = 0; i < opciones.length; i++) {
            if (opciones[i].equalsIgnoreCase(jugador)) {
                jugadorIndex = i;
                break;
            }
        }

        if (jugadorIndex == -1) {
            System.out.println("Opción no válida. Usa: piedra, papel o tijera.");
            return;
        }

        if (jugador.equalsIgnoreCase(maquina)) {
            System.out.println("¡Empate!");
        } else if (opciones[(jugadorIndex + 1) % 3].equals(maquina)) {
            System.out.println("¡Lo siento, has perdido. ¿quieres intentarlo nuevamente? ! 😞");
        } else {
            System.out.println("¡Perfecto, has ganado! 🎉");
           
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elige piedra, papel o tijera: ");
        String entrada = scanner.nextLine();
        jugar(entrada);

        
    }

    
}