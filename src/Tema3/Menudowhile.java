package Tema3;

import java.util.Scanner;

public class Menudowhile {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 0, a = 0, b = 0;

        do {
            System.out.println("Que quieres hacer wei");
            System.out.println("1) suma \n 2) resta \n 3) Salte wei");
            op = scanner.nextInt();
            if (op !=4){
                System.out.println("dame el valor para a");
                a = scanner.nextInt();
                System.out.println("dame el valor para b");
                b = scanner.nextInt();
            }
            switch (op){
                case 1:
                    System.out.println("Su resultado es " + (a + b));
                    break;
                case 2:
                    System.out.println("su resultado es" + (a-b));
                    break;
            }
        }while (op != 3);
        System.out.println("Hasta luego manito");
    }
}

