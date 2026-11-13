package Tema5;

import java.util.Scanner;

public class CajeroAutomatico {

    static Scanner scanner = new Scanner(System.in);
    static String nombre;
    static int saldodisponible, cantidadretirar = 0;

    static void main(String[] args) {
        System.out.println("Bienvenido, por favor ingrese su nombre:");
        nombre = scanner.nextLine();
        System.out.println("Su saldo disponible:");
        saldodisponible = scanner.nextInt();

        System.out.println("La cantidad que desea retirar:");
        cantidadretirar = scanner.nextInt();

        if(verificar()){
            comprobante();
        }


    }

    public static boolean verificar() {
        if (cantidadretirar <= 0) {
            System.out.println("Retiro rechazado");
            return false;
        } else if (cantidadretirar > saldodisponible) {
            System.out.println("Retiro rechazado");
            return false;
        } else if (cantidadretirar % 50 != 0) {
            System.out.println("Retiro rechazado");
            return false;
        }
        System.out.println("Retiro aprobado");
        return true;
    }

    public static int actualizado() {
        return saldodisponible - cantidadretirar;
    }

    public static void comprobante() {

        System.out.println("COMPROBANTE");
        System.out.println("Nombre" + nombre);
        System.out.println("Cantidad a retirar" + cantidadretirar);
        System.out.println("Saldo disponible" + saldodisponible);
        System.out.println("Saldo restante" + actualizado());
    }
}