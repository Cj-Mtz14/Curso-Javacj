public class Equality {

    public static void primitives() {
        System.out.println("Valore primitivos ");
         primitives();
    byte num1 = 5;
    byte num2 = 5;
    System.out.println(num1 == num2);
    short num3 = 5;
    System.out.println(num1 == num3);
    int num4 = 5;
    System.out.println(num1 == num4);
    char char1 = 'a';
    char char2 = 'b';
    byte valueA = 97;
    System.out.println(char1 == char2);
    System.out.println(char1 == valueA);
    boolean bool1 = true;

    }

    public static void wrappers() {
        System.out.println("Wrappers de valores primitivos ");
        Integer  num1 = new Integer("5");
        Integer num2 = new Integer("5");
        System.out.println(num1 == num2);
        System.out.println(num1);
        System.out.println(num1.toString());

       

    }

    public static void Casting() {
        System.out.println("Casting y coersión de valores primitivos");

        int num1 = 23;
        byte num2 = 20;
        byte result = (byte) (num1 + num2);
        System.out.println(result);


    }








 public static void main(String[] args) {
    System.out.println("Aprendiendo acerca de la igualdadd en java ");
    primitives();
    System.out.println("----------------------");
    wrappers();
    System.out.println("----------------------");
    Casting();

    
   






 }
}
