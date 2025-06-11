import java.util.Scanner;

public class Shop {

    static void get() {
        System.out.println("Probando");
    }

    public static void main(String[] args) {
        

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de paquetes que quieras y por cada se te aplicará un descuento ");
        int num = keyboard.nextInt();
        keyboard.close();
    

        if (num <= 5) {
            System.out.println("Los siento, no se puede realizar la venta ");

        } else if (num <= 10) {
            System.out.println("Se te aplicará un 10% y el precio por paquete es de 10$");
        } else if (num <= 20) {
            System.out.println("al realizar tu compra se te aplicará un 15%. Costo del paquete 5 euros ");
        } 

        

    }
}
