
package Tema3;

import java.util.Scanner;

public class SimuladorDeAhorro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double TASA_INTERES = 0.01;
        final int OPCION_SEIS = 1;
        final int OPCION_DOCE = 2;
        final int OPCION_VEINTICUATRO = 3;

        double capitalInicial = 0, metaAhorro = 0, ahorroMensual = 0, saldoActual = 0, interesesTotales = 0;

        int mesesSimulacion = 0, opcionPlazo = 0;

        System.out.println("Ola manito, vamos a simular tu ahorro");
        System.out.print("Ingresa tu dinero inicial: ");
        capitalInicial = scanner.nextDouble();

        if (capitalInicial <= 0) {
            System.out.print("Debe ser POSITIVO: ");
            capitalInicial = scanner.nextDouble();
        }

        System.out.print("Ingresa tu meta de ahorro: ");
        metaAhorro = scanner.nextDouble();

        if (metaAhorro <= 0) {
            System.out.print("La meta debe ser POSITIVA: ");
            metaAhorro = scanner.nextDouble();
        }

        System.out.print("Ingresa tu ahorro mensual fijo: ");
        ahorroMensual = scanner.nextDouble();

        if (ahorroMensual <= 0) {
            System.out.print("El ahorro mensual debe ser positivo: ");
            ahorroMensual = scanner.nextDouble();
        }

        System.out.println("Selecciona cuantos meses de simulacion:");
        System.out.println("1. 6 meses");
        System.out.println("2. 12 meses");
        System.out.println("3. 24 meses");
        System.out.print("Elige una opcion: ");
        opcionPlazo = scanner.nextInt();

        switch (opcionPlazo) {
            case OPCION_SEIS:
                mesesSimulacion = 6;
                break;
            case OPCION_DOCE:
                mesesSimulacion = 12;
                break;
            case OPCION_VEINTICUATRO:
                mesesSimulacion = 24;
                break;
            default:
                System.out.println("Opcion no valida.");
                scanner.close();
                return;
        }

        saldoActual = capitalInicial;
        interesesTotales = 0;
        int seAlcanzoMeta = 0;

        for (int i = 1; i <= mesesSimulacion; i++) {
            saldoActual = saldoActual + ahorroMensual;

            double interesMes = saldoActual * TASA_INTERES;
            interesesTotales = interesesTotales + interesMes;
            saldoActual = saldoActual + interesMes;
        }

        if (saldoActual >= metaAhorro) {
            seAlcanzoMeta = 1;
        }

        System.out.println("RESULTADOS");
        System.out.println("Saldo final: $" + saldoActual);
        System.out.println("Intereses generados: $" + interesesTotales);

        if (seAlcanzoMeta == 1) {
            System.out.println("Alcanzaste tu meta de ahorro manito");
        } else {
            System.out.println("No alcanzaste la meta en este plazo manito");
        }

        System.out.println("Adios causa");
    }
}