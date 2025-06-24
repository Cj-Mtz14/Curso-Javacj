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
        System.out.println("Casting y coerción de valores primitivos");

        int num1 = 23;
        byte num2 = 20;
        byte result = (byte) (num1 + num2);
        System.out.println(result);
        String text = "Result";
        System.out.println(text + num1 + num2);


    }

    public static void compareString() {
        System.out.println("String and equality");
        String str1 =  "Hola mundo";
        String str2 = new String("Hola mundo ");
        String str3 = "hola mundo";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str3);
        String str4 = str3;
        System.out.println(str2 == str4);

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }

        for (char item : str1.toCharArray()) {
            System.out.println(item);
        }

        System.out.println("--------");
        System.out.println(str1.charAt(5));
        //str1 [5] = "M";
        System.out.println(str1.codePointAt(5));
        

        
    }

public static void compareObjects() {
    System.out.println("Objects and equality");

    Square sq1 = new Square(10);
    Square sq2 = new Square(10);
    Square sq3 = sq1;

    System.out.println(sq1 == sq2); // false
    System.out.println(sq1.toString()); // true
    System.out.println(sq2);
    System.out.println(sq3);
    System.out.println(sq1.equals(sq2)); // true



}



 public static void main(String[] args) {
    System.out.println("Aprendiendo acerca de la igualdad en java ");
    primitives();
    System.out.println("----------------------");
    wrappers();
    System.out.println("----------------------");
    Casting();
    System.out.println("-----------------------");
    compareString();

    
   






 }
}
