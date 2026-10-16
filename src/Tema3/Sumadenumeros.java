package Tema3;

import java.util.Scanner;

public class Sumadenumeros {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int acumulador = 0;
        int x = 0;
        int respuesta = 0;
        do {
            System.out.println("Ingrese su numero para sumar");
            x = scanner.nextInt();
            acumulador = acumulador + x;
            System.out.println("Desea ingresar otro numero \n 1) Si \n 2)No irmamao");
            respuesta = scanner.nextInt();
        }while (respuesta == 1);
        System.out.println("Respuesta =" + acumulador);
    }
}