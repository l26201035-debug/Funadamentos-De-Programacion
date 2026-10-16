package Tema3;

import java.util.Scanner;

public class FastFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String op;

        System.out.println("Selecciona algo del menu irmao");
        System.out.println("A) Hamburguesa" + "\n B) Hot dog \n C) Pizza");
        op = scanner.nextLine();

        switch (op){
            case "A":
                System.out.println("Seleccionisita Hamburguesa");
                break;
            case "B":
                System.out.println("Seleccionaste hot dog");
                break;
            case "C":
                System.out.println("Seleccionaste Pizza");
                break;
            default:
                System.out.println("No esta dentro de la opciones");
                break;
        }
    }
}