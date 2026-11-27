
package Tema5.DesafioBoveda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Desafios desafios = new Desafios();
        Validador validador = new Validador();
        Puntuacion puntuacion = new Puntuacion();
        Boveda boveda = new Boveda();
        int op;
        do {
            op = menu.mostrarMenu(sc);
            if (op >= 1 && op <= 5) {
                boolean correcta = false;
                while (!correcta) {
                    desafios.presentarDesafio(op);
                    System.out.println("Ingresa tu respuesta:");
                    correcta = validador.validarRespuesta(op, sc);
                    if (correcta) {
                        System.out.println("Respuesta correcta :)");
                        puntuacion.agregarPunto();
                    } else {
                        System.out.println("Respuesta incorrecta :(");
                    }
                }

            } else if (op != 0) {
                System.out.println("Opcion no valida, intenta de nuevo");
            }

        } while (op != 6);

        puntuacion.mostrarResultados();
        if (puntuacion.calcularPuntuacion() >= 5) {
            String clave = boveda.generarClave();
            System.out.println("Muy bien!, tienes los 5 puntos");
            System.out.println("Tu clave es " + clave);
            System.out.println("Ingrese tu clave");
            sc.nextLine();
            String intento = sc.nextLine();
            if (boveda.verificarClave(intento, clave)) {
                System.out.println("Bien hecho, la boveda ha sido abierta");
            } else {
                System.out.println("Clave incorrecta");
            }

        } else {
            System.out.println("No has conseguido los puntos necesarios :(");
            System.out.println("La boveda permanece cerrada...");
        }
    }
}