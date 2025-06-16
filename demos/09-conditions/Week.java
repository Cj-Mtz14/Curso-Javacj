import java.util.Scanner;

public class Week {
    
static int getAgeByScanner() {

    
        Scanner scanner = new Scanner (System.in);
        System.out.println("Dime la edad del alumno");
        int edad = scanner.nextInt();
        scanner.close();
        return edad;

    }

    public static void main(String[] args) {
         int day = 4;
        switch (day) {
            case 1:
            System.out.println("Lunes");
            case 2:
            System.out.println("martes");
            case 3:
            System.out.println("miércoles");
            case 4:
            System.out.println("Jueves");
            case 5:
            System.out.println("viernes");
            case 6:
            case 7:
            System.out.println("Fin de semana ");

                
                break;
                
        
            default:
            System.out.println("número no valido ");
                break;
        }
        

        
    } 
}
