package Tema3;

import java.util.Scanner;

public class OperacionesMatematicas {

    static void main(String[] args) {
        int op, a , b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Suma \n2) Resta \n3) Multiplicacion \n4) Division");
        op = scanner.nextInt();
        System.out.println("Ingresa el valor para A");
        a = scanner.nextInt();
        System.out.println("Ingresa el valor para B");
        b = scanner.nextInt();

        switch (op){
            case 1:
                System.out.println("Su resultado es = " + (a+b));
                break;
            case 2:
                System.out.println("Su resultado es = " + (a-b));
                break;
            case 3:
                System.out.println("Su resultado es = " + (a*b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Su resultado es = " + (a / b));
                } else {
                    System.out.println("No puedes dividir entre 0");
                }
            default:
                System.out.println("Selecciona algo valido por favor");
                break;
        }
    }
}
