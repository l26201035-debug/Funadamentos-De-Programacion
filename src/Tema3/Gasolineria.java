package Tema3;

import java.util.Scanner;

public class Gasolineria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalLitros = 0;
        double importeTotalSinDescuento = 0;
        double totalCobrado = 0;
        int totalCargas = 0;
        int cargasConDescuento = 0;
        final double DESCUENTO = 0.05;
        int op = 1;

        System.out.println("Bienvenido a la gasolinera");
        while (op == 1) {
            double litros = 0;
            double precioPorLitro = 0;

            while (litros <= 0) {
                System.out.print("Ingresa los litros cargados");
                litros = scanner.nextDouble();
                if (litros <= 0) {
                    System.out.println("Error no pueden ser menores o iguales a 0 ");
                }
            }
            while (precioPorLitro <= 0) {
                System.out.print("Ingresa el precio por litro");
                precioPorLitro = scanner.nextDouble();
                if (precioPorLitro <= 0) {
                    System.out.println("Error no puede ser menor o igual a 0");
                }
            }

            double importeSinDescuento = litros * precioPorLitro;
            double importeFinal = importeSinDescuento;

            if (litros >= 40) {
                cargasConDescuento = cargasConDescuento + 1;
                double descuentoDinero = importeSinDescuento * DESCUENTO;
                importeFinal = importeSinDescuento - descuentoDinero;
                System.out.println("Se te hizo un descuento del 5% " + descuentoDinero);
            }

            totalCargas = totalCargas + 1;
            totalLitros = totalLitros + litros;
            importeTotalSinDescuento = importeTotalSinDescuento + importeSinDescuento;
            totalCobrado = totalCobrado + importeFinal;

            System.out.println("Importe final a pagar por esta carga: $" + importeFinal);

            System.out.println("Deseas registrar otra carga manito");
            System.out.println("1) Sí");
            System.out.println("2) No (Ver resumen y salir)");
            op = scanner.nextInt();
        }

        System.out.println("Resumen del dia");
        System.out.println("Total de cargas registradas: " + totalCargas);
        System.out.println("Total de litros vendidos: " + totalLitros);
        System.out.println("Importe total sin descuentos: $" + importeTotalSinDescuento);
        System.out.println("Total cobrado (con descuentos): $" + totalCobrado);
        System.out.println("Cargas que recibieron descuento: " + cargasConDescuento);

        if (totalCargas > 0) {
            double promedioPorCarga = totalCobrado / totalCargas;
            System.out.println("El promedio de paga fue de" + promedioPorCarga);
        }
    }
}