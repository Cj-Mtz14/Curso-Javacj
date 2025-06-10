import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero entero");
        int num1 = scanner.nextInt();
        System.out.println("Dime otro numero entero");
        int num2 = scanner.nextInt();
        scanner.close();

        //Los argumentos son los valores que llegarán a los parámetros
        System.out.println("Operaciones con %s y %s\n", num1, num2);
        showResult("suma", add(num1, num2));
        showResult ("resta", subtract(num1, num2));
        showResult ("Producto", intDivide(num1, num2));
    
    }
    
}
