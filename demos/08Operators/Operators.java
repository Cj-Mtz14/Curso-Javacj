

public class Operators {

    // Operadores - expresiones 
    // Asignación 

    // = 
    // Aritmética
    // +
    // -
    // *
    // %

    // Comparación operadores - siempre evalúan la expresión de forma booleana.
    // ==
    //!=
    // > >=
    // < <=


    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 == num2);   // igual - false
        System.out.println(num1 != num2); // no igual - distinto
        System.out.println(num1 > num2); // mayor que  -> false
        System.out.println(num1 < num2); // menor que  -> true

        String s1 = "pepe";
        String s2 = "Juan";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    
}
