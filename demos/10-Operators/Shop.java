import java.util.Scanner;

public class Shop {

    static void get() {
        System.out.println("Probando");
    }

    public static void main(String[] args) {
        

        Scanner keyboard = new Scanner(System.in);
        System.out.println("TIENDA DE ROPA CJM ");
        System.out.println("Ingresa la cantidad de paquetes ");
        int num = keyboard.nextInt();
        keyboard.close();
    

        if (num < 5) {
            System.out.println("Los siento, pedido insuficiente ");

        } else if (num < 10) {
            System.out.println("Se te aplicará un 10% y el precio por paquete es de 10$");
        } else if (num < 20) {
            System.out.println("al realizar tu compra se te aplicará un 15%. Costo del paquete 5 euros ");
        } else if (num >10 && num < 20){
        System.out.println("Por la compra de 10-20 paquetes te llevas un 10% de descuento ");
        } else if (num >=20) {
            System.out.println("Por esta compra te llevas un 15% de descuento");
        } else {
            System.out.println("Lo siento no hay descuento para la cantidad que solicitas");
        }


        

    }
}
