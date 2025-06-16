import java.util.Random;

public class BucleWhile {
    public static void main(String[] args) {
        
        boolean sentinel = true;

        while (sentinel) {
            Random randomCreator= new Random ();
            int number = randomCreator.nextInt(9);

            if (number %2 == 0) {
                continue;
            }



            System.out.println("Número " + number);
            if (number == 7) {
                sentinel = false;
            }
        }
    
         
    }
    
}
