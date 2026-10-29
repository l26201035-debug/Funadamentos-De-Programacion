package Tema3;

import java.util.Scanner;

public class OperacionesEnJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int OPCION_CUADRADO = 1;
        final int OPCION_CUBO = 2;
        final int OPCION_PAR_IMPAR = 3;
        final int OPCION_SUMA = 4;
        final int OPCION_SALIR = 5;

        int op = 0, num = 0, sumaTotal = 0, cuadrado = 0, cubo = 0;

        do {
            System.out.println("Menu de tu calculadora");
            System.out.println("1) Calcular el cuadrado de un numero");
            System.out.println("2) Calcular el cubo de un numero");
            System.out.println("3) Determinar si un numero es par o impar");
            System.out.println("4) Calcular la suma de los numeros desde 1 hasta un numero");
            System.out.println("5) Salir del programa");
            System.out.print("Elige una opcion: ");
            op = scanner.nextInt();

            switch (op) {
                case OPCION_CUADRADO:
                    System.out.print("Ingresa un numero entero positivo: ");
                    num = scanner.nextInt();
                    if (num > 0) {
                        cuadrado = num * num;
                        System.out.println("El cuadrado de tu numero es " + cuadrado);
                    } else {
                        System.out.println("Error: El numero debe ser mayor a 0");
                    }
                    break;

                case OPCION_CUBO:
                    System.out.print("Ingresa un numero entero positivo: ");
                    num = scanner.nextInt();
                    if (num > 0) {
                        cubo = num * num * num;
                        System.out.println("El cubo de tu numero es " + cubo);
                    } else {
                        System.out.println("Error: El numero debe ser mayor a 0");
                    }
                    break;

                case OPCION_PAR_IMPAR:
                    System.out.print("Ingresa un numero entero: ");
                    num = scanner.nextInt();
                    if (num % 2 == 0) {
                        System.out.println("Tu numero es par manito ");
                    } else {
                        System.out.println("Tu numero es impar ");
                    }
                    break;

                case OPCION_SUMA:
                    System.out.print("Ingresa un numero postivo: ");
                    num = scanner.nextInt();
                    if (num > 0) {
                        sumaTotal = 0;
                        for (int i = 1; i <= num; i++) {
                            sumaTotal = sumaTotal + i;
                        }
                        System.out.println("La suma desde 1 hasta tu numero es "+ sumaTotal);
                    } else {
                        System.out.println("El numero debe ser mayor a 0 pe");
                    }
                    break;

                case OPCION_SALIR:
                    System.out.println("Adios manito");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (op != OPCION_SALIR);
     }
}