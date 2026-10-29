package Tema3;

import java.util.Scanner;

public class NumerosAmigos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int OPCION_SUMAS = 1;
        final int OPCION_COMPARACION = 2;
        int num1 = 0, sumaDivisores1 = 0, contadorDivisores1 = 0;
        int num2 = 0, sumaDivisores2 = 0, contadorDivisores2 = 0;
        int sonAmigos = 0, op;

        System.out.print("Ingresa el primer numero entero positivo");
        num1 = scanner.nextInt();
        if (num1 <= 0) {
            System.out.println("Debe ser mayor a 0");
        }

        System.out.print("Ingresa el segundo numero entero positivo");
        num2 = scanner.nextInt();
        if (num2 <= 0) {
            System.out.println("Debe ser mayor a 0");
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

        if (sumaDivisores1 == num2 && sumaDivisores2 == num1) {
            sonAmigos = 1;
        } else {
            sonAmigos = 0;
        }

        System.out.println("Que quieres ver");
        System.out.println("1. Mostrar la suma de los divisores de cada numero");
        System.out.println("2. Mostrar unicamente el resultado de la comparacion");
        System.out.print("Elige una opcion");
        op = scanner.nextInt();

        switch (op) {
            case OPCION_SUMAS:
                System.out.println("Suma de divisores?");
                System.out.println("Suma de divisores del numero 1 es: " + sumaDivisores1);
                System.out.println("Suma de divisores del numero 2 es " + sumaDivisores2);
                if (sonAmigos == 1) {
                    System.out.println("respuesta son numeros amigos");
                } else {
                    System.out.println("respuesta no son numeroa amigos");
                }
                break;
            case OPCION_COMPARACION:
                System.out.println("Resultados de comparacion");
                if (sonAmigos == 1) {
                    System.out.println("Los numeros " + num1 + " y " + num2 + " Si son numeros amigos");
                } else {
                    System.out.println("Los numeros " + num1 + " y " + num2 + " No son numeros amigos");
                }
                break;

            default:
                System.out.println("Opcion no valida");
                break;
        }
        System.out.println("Adio manito");
    }}