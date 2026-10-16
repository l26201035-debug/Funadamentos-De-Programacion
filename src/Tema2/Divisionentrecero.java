package Tema2;

import java.util.Scanner;
public class Divisionentrecero {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int a, b, c; //C =a/b
            System.out.println("Ingrese un valor de a");
            a = scanner.nextInt();
            System.out.println("Ingrese un valor de b");
            b = scanner.nextInt();
            c = a / b;
            System.out.println("c = " + c);
        } catch(ArithmeticException ae) {
            System.out.println("No se puede divir entre cero");
        }finally {
            System.out.println("Ola mi gente e so doraimon");
        }
    }
}
//
