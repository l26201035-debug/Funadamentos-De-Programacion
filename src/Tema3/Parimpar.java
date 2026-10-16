package Tema3;
/*
* Instituto Tecnologico de Pachuca
* Fundamentos de programacion
* Israel Yuruel Barragan Sanchez
* 14/10/2026
* Programa queevalua una serie de numeros si es par o impar
*/

import java.util.Scanner;

public class Parimpar {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int respuesta;
        int n, contador = 1;
        do {
            System.out.println("Ingrese un numero");
        n = scanner.nextInt();
            while (contador <= n) {
                if (contador % 2 == 0) { // n dividido entre 2 tiene residuo 0?
                    System.out.println("El numero " + contador + " es pal");
                } else {
                    System.out.println("El numero " + contador + " es impal");
                }
                contador++;
            }
            System.out.println("Desea ingresar otro numero 1)Si 2)No)");
            respuesta = scanner.nextInt();
        }while (respuesta == 1);
    }
}