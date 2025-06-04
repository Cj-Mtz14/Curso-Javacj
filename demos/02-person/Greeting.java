import java.util.Scanner;

public class Greeting {
    
   
    
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         System.out.println("Escribe tu nombre");
         String name = scanner.nextLine();
         System.out.println("Escribe tu edad");
         int age = scanner.nextInt();
         System.out.println("Hola " + name);
         System.out.println("Edad " + age);
         scanner.close();
         


    }
   
}
