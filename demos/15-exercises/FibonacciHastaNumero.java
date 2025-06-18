import java.util.Scanner;

public class FibonacciHastaNumero {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preguntar al usuario por el número
        System.out.print("Introduce un número para generar la serie de Fibonacci hasta ese valor: ");
        int limite = scanner.nextInt();

        // Imprimir la serie de Fibonacci hasta el número dado
        imprimirSerieFibonacci(limite);
        
        scanner.close();
    }

    public static void imprimirSerieFibonacci(int limite) {
        int a = 0, b = 1;

        System.out.println("Serie de Fibonacci hasta " + limite + ":");

        // Mientras el valor actual no sobrepase el límite
        while (a <= limite) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("¿Quieres continuar? "); 
    }
}
