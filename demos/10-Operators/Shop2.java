import java.util.Scanner;

public class Shop2 {

static final double PACKET_PRICE = 20;

static int  getDataByScanner() {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Vendemos paquetes de pantalones y camisas a %s EU ", PACKET_PRICE);
    System.out.println("Dime el numero de pantalones y camisas");
    int packets = scanner.nextInt();
    System.out.println("");
    scanner.close();
    return packets;
}

    public static void main(String[] args) {
        int numberPackets = getDataByScanner();
        System.out.println(numberPackets);
        double discount;
        int shippingByPackets;
        

        if (numberPackets < 5) {
            System.out.println("numero de paquetes insuficientes ");
            return;
            
        } else if (numberPackets < 10) {
            discount = 0.05;
            shippingByPackets = 10;
        } else if (numberPackets < 20) {
            discount = 0.1;
            shippingByPackets = 5;
        } else {
            discount = 0.15;
            shippingByPackets = 0;
        }

        double total = numberPackets * PACKET_PRICE;
        double finalDiscount = total * discount;
        double totalShipping = numberPackets + shippingByPackets;
        double finalPrice = total - finalDiscount + totalShipping;

        System.out.println("""
                Número de paquetes %s
                Precio total del producto %s EU
                Descuento aplicado %s EU
                Gastos de envío &s EU
                -------------------------
                Total %s EU
                """.formatted(numberPackets, total, finalDiscount, totalShipping, finalPrice));


        
    }
    
}
