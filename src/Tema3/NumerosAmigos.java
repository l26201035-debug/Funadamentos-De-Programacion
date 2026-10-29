
package Tema3;

import java.util.Scanner;

public class NumerosAmigos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int OPCION_SUMAS = 1;
        final int OPCION_COMPARACION = 2;

        int repetir = 1;

        do {
            int num1 = 0, sumaDivisores1 = 0, contadorDivisores1 = 0;
            int num2 = 0, sumaDivisores2 = 0, contadorDivisores2 = 0;
            int sonAmigos = 0, op;

            System.out.print("Ingresa el primer numero entero positivo: ");
            num1 = scanner.nextInt();

            while (num1 <= 0) {
                System.out.print("Debe ser mayor a 0");
                num1 = scanner.nextInt();
            }

            System.out.print("Ingresa el segundo numero entero positivo: ");
            num2 = scanner.nextInt();

            while (num2 <= 0) {
                System.out.print("Debe ser mayor a 0");
                num2 = scanner.nextInt();
            }

            for (int i = 1; i < num1; i++) {
                if (num1 % i == 0) {
                    sumaDivisores1 = sumaDivisores1 + i;
                    contadorDivisores1++;
                }
            }

            for (int j = 1; j < num2; j++) {
                if (num2 % j == 0) {
                    sumaDivisores2 = sumaDivisores2 + j;
                    contadorDivisores2++;
                }
            }

            if (sumaDivisores1 == num2 && sumaDivisores2 == num1 && num1 != num2) {
                sonAmigos = 1;
            } else {
                sonAmigos = 0;
            }

            System.out.println("Que quieres ver?");
            System.out.println("1) Mostrar la suma de los divisores");
            System.out.println("2) Mostrar los resultado de la comparacion");
            System.out.print("Elige una opcion: ");
            op = scanner.nextInt();

            switch (op) {
                case OPCION_SUMAS:
                    System.out.println("Suma de divisores");
                    System.out.println("Suma de divisores del numero 1: " + sumaDivisores1);
                    System.out.println("Cantidad de divisores del numero 1: " + contadorDivisores1);
                    System.out.println("Suma de divisores del numero 2: " + sumaDivisores2);
                    System.out.println("Cantidad de divisores del numero 2: " + contadorDivisores2);
                    break;

                case OPCION_COMPARACION:
                    System.out.println("resultados de compracion");

                    if (sonAmigos == 1) {
                        System.out.println("Los numeros " + num1 + " y " + num2 + " SI son numeros amigos");
                    } else {
                        System.out.println("Los numeros " + num1 + " y " + num2 + " NO son numeros amigos");
                    }
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

            System.out.println("Quieres analizar otra pareja de numeros?");
            System.out.println("1. Si");
            System.out.println("2. No");
            System.out.print("Elige una opcion: ");
            repetir = scanner.nextInt();

        } while (repetir == 1);

        System.out.println("Adios manito");
    }}