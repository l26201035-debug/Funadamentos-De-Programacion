import java.util.Scanner;

public class Cajeroconcomisiónbancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int COMISION = 10;
        final int LIMITE_RETIRO = 5000;
        System.out.println("Cajero Automatico Con Comision");
        System.out.println("Ingresa por favor su saldo disponible");
        double saldodisponible = scanner.nextDouble();
        System.out.println("Ingresa la cantidad que deseas retirar");
        double cantidadretirar = scanner.nextDouble();
        if (cantidadretirar<=0){
            System.out.println("Error, por favor ingrese valores mayores a 0");
        } else if (cantidadretirar > LIMITE_RETIRO) {
            System.out.println("Error no puede retirar mas de 5000 pesos, por favor intente de nuevo");
        } else if (saldodisponible < (COMISION + cantidadretirar)) {
            System.out.println("Error, saldo insuficiente para poder retirar esa cantidad y la comision es de " + COMISION);
        } else {
            double totalDescontado = cantidadretirar + COMISION;
            double Saldofinal = saldodisponible - totalDescontado;

            System.out.println("RETIRO AUTORIZADO");
            System.out.println("Monto a retirar es de " + cantidadretirar);
            System.out.println("Comision cobrada de " + COMISION);
            System.out.println("Total descontado de la cuenta es de " + totalDescontado);
            System.out.println("Saldo final es de " + Saldofinal);
        }

    }
}
