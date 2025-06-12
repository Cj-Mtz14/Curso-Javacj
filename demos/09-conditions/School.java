import java.util.Scanner;

public class School {
    static int getAgeByScanner() {

      
        Scanner scanner = new Scanner (System.in);
        System.out.println("Dime la edad del alumno");
        int edad = scanner.nextInt();
        scanner.close();
        return edad;

    }

    public static void main(String[] args) {
      
        
    }
}
        
     

