package Tema5.DesafioBoveda;

import java.util.Scanner;

public class Validador {
    public boolean validarRespuesta(int op, Scanner scanner) {

        switch (op) {

            case 1:
                int numerica = scanner.nextInt();
                return numerica == 56;
            case 2:
                int numero = scanner.nextInt();
                return numero == 62;
            case 3:
                int hijo = scanner.nextInt();
                return hijo == 12;
            case 4:
                int tablero = scanner.nextInt();
                return tablero == 654;
            case 5:
                int monedas5 = scanner.nextInt();
                return monedas5 == 12;
        }

        return false;
    }
}