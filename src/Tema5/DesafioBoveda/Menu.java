
package Tema5.DesafioBoveda;

import java.util.Scanner;
public class Menu {
    public int mostrarMenu(Scanner scanner) {
        System.out.println("****Bienvenido al desafio de la Boveda****");
        System.out.println("Elige cual quieres hacer");
        System.out.println("1.- Secuencia Numerica");
        System.out.println("2.- El Numero Oculto");
        System.out.println("3.- Problema De Edades");
        System.out.println("4.- El Tablero Logico");
        System.out.println("5.- El Problema De Las Monedas");
        System.out.println("6.- Salir");
        System.out.println("Seleccione cual quieres hacer");
        return scanner.nextInt();
    }
}
