
package Tema3;

import java.util.Scanner;

public class EstadisticasSecNumerica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int DIVISOR_CUATRO = 4;
        final int MULTIPLO_TRES = 3;
        final int MULTIPLO_CINCO = 5;
        int numero, sumaDivisibles4 = 0, contadorMultiplos3 = 0;
        int contadorAmbos = 0, contadorPares = 0;
        int contadorImpares = 0, contadorMultiplos5 = 0;
        int repetir = 1, opcion;

        do {
            System.out.println("Ola manito");
            System.out.println("Ingresa un numero por favor:");
            numero = scanner.nextInt();

            while (numero <= 0) {
                System.out.println("Por favor ingresa un numero POSITIVO");
                numero = scanner.nextInt();
            }

            for (int i = 1; i <= numero; i++) {
                if (i % DIVISOR_CUATRO == 0 && i % MULTIPLO_TRES == 0) {
                    contadorAmbos++;
                }
                if (i % DIVISOR_CUATRO == 0) {
                    sumaDivisibles4 += i;
                }
                if (i % MULTIPLO_TRES == 0) {
                    contadorMultiplos3++;
                }
                if (i % 2 == 0) {
                    contadorPares++;
                } else {
                    contadorImpares++;
                }
                if (i % MULTIPLO_CINCO == 0) {
                    contadorMultiplos5++;
                }
            }

            System.out.println("Resumen del numero");
            System.out.println("Suma de numeros divisibles entre 4: " + sumaDivisibles4);
            System.out.println("Cantidad de numeros multiplos de 3: " + contadorMultiplos3);
            System.out.println("Cantidad de numeros divisibles entre 3 y 4: " + contadorAmbos);
            System.out.println("Quieres ver la cantidad de pares, impares y multiplos de 5?");
            System.out.println("1) Si  2) No");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Total de numeros pares: " + contadorPares);
                    System.out.println("Total de numeros impares: " + contadorImpares);
                    System.out.println("Total de multiplos de 5: " + contadorMultiplos5);
                    repetir = 2;
                    break;
                case 2:
                    System.out.println("Adios manito.");
                    repetir = 2;
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        } while (repetir == 1);
        System.out.println("Adios causa");
    }
}
