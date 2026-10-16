package Tema2;

import java.util.Scanner;

public class Sistemadeequipaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int PESO_OPTIMO = 15;
        final int PESO_MAXIMO = 30;
        final int CARGO_LIGERO = 150;
        final int CARGO_MEDIO = 300;
        final int CARGO_PESADO = 500;
        int pesoequipaje;
        String nombre;

        System.out.println("Bienvenido a este aeropuerto");
        System.out.println("Por favor ingresa tu nombre");
        nombre = scanner.nextLine();
        System.out.println("Por favor ingresa el peso de su equipaje");
        pesoequipaje = scanner.nextInt();

        if (pesoequipaje > PESO_MAXIMO) {
            System.out.println("ADVERTENCIA");
            System.out.println("Su equipaje alcanzo el peso maximo");
            System.out.println("Se le agregara un cargo de $" + CARGO_PESADO);
        } else if (pesoequipaje > 20 && pesoequipaje <= PESO_MAXIMO) {
            System.out.println("Hola pasajero " + nombre);
            System.out.println("El peso total de su mochila es de " + pesoequipaje);
            System.out.println("Su peso es medio");
            System.out.println("Se le agregara un cargo de $ " + CARGO_MEDIO);
        } else if (pesoequipaje > PESO_OPTIMO && pesoequipaje <= 20) {
            System.out.println("Hola pasajero " + nombre);
            System.out.println("El peso total de su mochila es de " + pesoequipaje);
            System.out.println("Su peso ligero, aceptable");
            System.out.println("Se le agregara un cargo de $ " + CARGO_LIGERO);
        } else {
            System.out.println("Hola pasajero " + nombre);
            System.out.println("El peso total de su mochila es de " + pesoequipaje);
            System.out.println("Su equipaje es muy ligero, felicidades");
            System.out.println("No se le agregara ningun cargo adicional");
        }
    }
}