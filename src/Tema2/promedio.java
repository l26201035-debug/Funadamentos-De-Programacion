package Tema2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double calificaion1;
        double calificaion2;
        double calificaion3;
        double media;
        try {
            System.out.println("Ingrese por favor su primera calificacion");
            calificaion1 = scanner.nextDouble();
            System.out.println("Ingrese pro favor su segunda calificaion");
            calificaion2 = scanner.nextDouble();
            System.out.println("Ingrese por favor su tercera calificaion");
            calificaion3 = scanner.nextDouble();
            media = (calificaion1 + calificaion2 + calificaion3)/ 3;
            System.out.println("Su Tema2.promedio es de " + media);
        } catch (InputMismatchException e) {
            System.out.println("Error");
            System.out.println("Porfavor ingrese un valor numerico");
        }
    }
}
