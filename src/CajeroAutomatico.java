import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int LIMITE_RETIRO = 5000;

        System.out.println("Bienvenido por favor ingrese la cantidad de saldo que tiene disponible");
        double SaldoDisponible = scanner.nextDouble();

        System.out.println("Por favor ingrese la cantidad de efectivo que desea retirar");
        double Efectivopararetirar = scanner.nextDouble();

        if (Efectivopararetirar <= 0) {
            System.out.println("Error");
            System.out.println("Por favor ingresa un valor mayor a 0");
        }
        else if (Efectivopararetirar > LIMITE_RETIRO) {
            System.out.println("Error");
            System.out.println("La cantidad supera el límite permitido de $" + LIMITE_RETIRO);
        }
        else if (Efectivopararetirar > SaldoDisponible) {
            System.out.println("Error");
            System.out.println("No cuentas con suficiente saldo disponible");
        }
        else {
            double nuevoSaldo = SaldoDisponible - Efectivopararetirar;
            System.out.println("Retiro valido ");
            System.out.println("Efectivo entregado: $" + Efectivopararetirar);
            System.out.println("Tu nuevo saldo es: $" + nuevoSaldo);

            if (nuevoSaldo < 500) {
                System.out.println("ADVERTENCIA: Tu saldo restante es menor a $500 pesos.");
            }
        }
    }
}