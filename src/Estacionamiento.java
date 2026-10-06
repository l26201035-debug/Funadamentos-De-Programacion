import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double tarifamoto = 10;
        final double tarifaauto= 20;
        final double tarifacamioneta = 30;
        final double descuento5horas= 0.10;
        final double descuento10horas = 0.20;

        System.out.println("ESTACIONAMIENTO");
        System.out.println("Por favor ingrese el tipo de vehiculo que tiene");
        System.out.println("1. Motocicleta");
        System.out.println("2. Automovil");
        System.out.println("3. Camioneta");
        int tipodevehiculo = scanner.nextInt();
        System.out.println("Por favor ingrese la cantidad de horas que estuvo en el estacionamiento");
        int horas = scanner.nextInt();

        if (horas <= 0){
            System.out.println("ERROR. Cantidad de hroas invalidad por favor intente de nuevo");
        } else {
            double tarifaporhora = 0.0;
            String nombrevehiculo = "";

        if (tipodevehiculo == 1){
            tarifaporhora = tarifamoto;
            nombrevehiculo = "Motocicleta";
        } else if (tipodevehiculo == 2) {
            tarifaporhora = tarifaauto;
            nombrevehiculo = "Automovil";
        } else if (tipodevehiculo == 3) {
            tarifaporhora = tarifacamioneta;
            nombrevehiculo = "Camioneta";
        }
        double subtotal = horas * tarifaporhora;
        double porcentajecondescuento = 0.0;
        if (horas > 10){
            porcentajecondescuento = descuento10horas;
        } else if (horas > 5) {
            porcentajecondescuento = descuento5horas;
        }
        double montodescuento = subtotal * porcentajecondescuento;
        double totalapagar = subtotal - montodescuento;

            System.out.println("RESUMEN DE COBRO ");
            System.out.println("Tipo de vehiculo: " + nombrevehiculo);
            System.out.println("Horas estacionado: " + horas);
            System.out.println("Tarifa por hora: $" + tarifaporhora);
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: $" + montodescuento);
            System.out.println("Total a pagar: $" + totalapagar);
        }
    }
}
