import java.util.Scanner;

public class tienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constantes obligatorias
        final double PORCENTAJEDESCUENTO = 0.10;
        final double MONTOMINDESCUENTO = 1000.0;
        final double MONTOMINENVIOGRATIS = 1500.0;
        final double COSTOENVIOESTANDAR = 80.0;

        System.out.println("Ingrese el costo de su producto:");
        double costoprodcut = scanner.nextDouble();
        System.out.println("Ingrese la cantidad que desea comprar:");
        int cantproducto = scanner.nextInt();

        double subtotal = costoprodcut * cantproducto;
        double descuento = 0.0;

        if (subtotal >= MONTOMINDESCUENTO) {
            descuento = subtotal * PORCENTAJEDESCUENTO;
        } else {
            descuento = 0.0;
        }
        double totalConDescuento = subtotal - descuento;
        double costoEnvio = 0.0;

        if (subtotal >= MONTOMINENVIOGRATIS) {
            costoEnvio = 0.0;
        } else {
            costoEnvio = COSTOENVIOESTANDAR;
        }

        double totalFinal = totalConDescuento + costoEnvio;

        System.out.println("\n--- Resumen de Compra ---");
        System.out.println("Precio del producto: $" + costoprodcut);
        System.out.println("Cantidad: " + cantproducto);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total con descuento: $" + totalConDescuento);
        System.out.println("Envío: $" + costoEnvio);
        System.out.println("Total final: $" + totalFinal);
    }
}