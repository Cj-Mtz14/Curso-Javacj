

public class Functions {
    
    static void add(int num1, int num2){
        int result = num1 + num2;
        return result;
        
    }

    static void subtraction (int num1, int num2) {
        int result = num1 - num2;
        return result;



    }

    public static void main(String[] args) {
        //Los argumentos son los valores que llegaran a los parámetros
        int fistResult = add (4, 4);
        System.out.println("El resultado es " + fistResult);
        int secondResult = add(345, fistResult);
        add(345, fistResult);

        //int resultSubtraction = subtraction (23, 56);
    }
}
