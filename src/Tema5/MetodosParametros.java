package Tema5;

import java.util.Scanner;

public class MetodosParametros {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 0, a, b;
        System.out.println("Ingresa una opcion \n 1) Suma \n 2) resta \n 3) Multiplicacion \n 4) Division");
        op = scanner.nextInt();
        System.out.println("Ingresa el valor para a");
        a = scanner.nextInt();
        System.out.println("Ingresa el valor para b");
        b = scanner.nextInt();
        switch (op) {
            case 1:
                suma(a, b);
                break;
            case 2:
                resta(a, b);
                break;
            case 3:
                multiplicacion(a, b);
                break;
            case 4:
                division(a, b);
                break;
            default:
                System.out.println("No valido"); // Se usa para que el metodo main se vea mas, limpio vaya, pura estetica
                break;
        }
    }

    public static void suma(int a, int b) {
        System.out.println("Suma" + (a + b));
    }

    public static void resta(int a, int b) {
        System.out.println("resta" + (a - b));
    }

    public static void multiplicacion(int a, int b) {
        System.out.println("Multiplicacion" + (a * b));
    }

    public static void division(int a, int b) {
        if (b == 0) {
            System.out.println("No se puede dividir");
        } else {
            System.out.println("divison" + (a / b));
        }
    }
}