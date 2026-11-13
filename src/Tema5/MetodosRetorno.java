package Tema5;

import java.util.Scanner;

public class MetodosRetorno {
    static Scanner scanner = new Scanner(System.in);
    static void main(String[] args) {
        int op = 0;
        do {
            System.out.println("Selecciona una opcion \n 1) Cuadrado \n 2) Triangulo \n 3) Circulo \n 4) Rectangulo" +
                    "\n 5) Salir");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Area" + cuadrado());
                    break;
                case 2:
                    System.out.println("Area" + Triangulo());
                    break;
                case 3:
                    System.out.println("Area" + Circulo());
                    break;
                case 4:
                    System.out.println("Area" + Rectangulo());
                    break;
            }
        } while (op != 5);
        System.out.println("Adios");
    }
    public static double cuadrado (){
        double l = 0;
        System.out.println("Ingresa el valor de un lado");
        l = scanner.nextDouble();
        return (l*l);
    }
    public static double Triangulo () {
        double b = 0, a= 0;
        System.out.println("Ingresa el valor la altura");
        a = scanner.nextDouble();
        System.out.println("Ingresa el valor de la base");
        b = scanner.nextDouble();
        return (a *b);
    }
    public static double Circulo () {
        double r = 0;
        System.out.println("Ingresa el valor del radio");
        r = scanner.nextDouble();
        return ((Math.PI * (r*r)));
    }
    public static double Rectangulo () {
        double b = 0, a = 0;
        System.out.println("Ingresa el valor de la altura");
        a = scanner.nextDouble();
        System.out.println("Ingresa el valro de la base");
        b = scanner.nextDouble();
        return (a * b);
    }
}
