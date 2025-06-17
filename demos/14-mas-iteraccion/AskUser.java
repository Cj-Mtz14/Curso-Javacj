import java.util.Scanner;

public class AskUser {

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true;

        while(wantContinue) {


        System.out.println("¿Quieres continuar (S/N)?");
        String answer = scanner.nextLine();
        if(answer.toLowerCase().equals("n")); {
            wantContinue = false;


        }

        }

        scanner.close();
        System.out.println("Gracias `por todo ");
    }
    
}
