import java.util.Scanner;

public class Tiendacondescuentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double DESCUENTO_FRECUENTE = 0.10;
        final double DESCUENTO_VIP = 0.20;
        final double DESCUENTO_ADICIONAL = 0.05;
        final double MONTO_FULL = 2000.0;

        System.out.println("Bienvenido cliente");
        System.out.println("Por favor ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Por favor cliente ingrese el monto de su compra:");
        double montoDeCompra = scanner.nextDouble();

        System.out.println("Ingrese que tipo de cliente es por favor:");
        System.out.println("1. Cliente normal");
        System.out.println("2. Cliente frecuente");
        System.out.println("3. Cliente VIP");
        int tipoDeCliente = scanner.nextInt();
        double porcentajeTipo = 0.0;
        if (tipoDeCliente == 2) {
            porcentajeTipo = DESCUENTO_FRECUENTE;
        } else if (tipoDeCliente == 3) {
            porcentajeTipo = DESCUENTO_VIP;
        }
        double descuentoTipo = montoDeCompra * porcentajeTipo;
        double montoDescuentoAdicional = 0.0;
        if (montoDeCompra > MONTO_FULL) {
            montoDescuentoAdicional = montoDeCompra * DESCUENTO_ADICIONAL;
        }
        double totalDescuento = descuentoTipo + montoDescuentoAdicional;
        double totalPagar = montoDeCompra - totalDescuento;
        System.out.println("---------- RESUMEN DE COMPRA ----------");
        System.out.println("Cliente " + nombre);
        System.out.println("Monto original $" + montoDeCompra);
        System.out.println("Descuento por tipo de cliente: $" + descuentoTipo);
        System.out.println("Descuento adicional: $" + montoDescuentoAdicional);
        System.out.println("Total de descuentos: $" + totalDescuento);
        System.out.println("Total a pagar: $" + totalPagar);
    }
}