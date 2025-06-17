

public class Matrix {

    
    public static void main(String[] args) {
        
        int[] vectorNumbers = {3, 4, 5, 23, 54};
        String[] vectorNames = new String [4];

        vectorNames[0] = "pepe";
        vectorNames [1] = "Luisa";
        vectorNames [3] = "Ramón";

        for (int i = 0; i < vectorNumbers.length; i++) {
            System.out.println(vectorNumbers);
            
        }

        for (String name : vectorNames) {
            System.out.println(name);

        }
    

     
    }
    
}
