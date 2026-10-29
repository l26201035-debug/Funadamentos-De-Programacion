
package Tema3;

import java.util.Scanner;

public class SimuladorDeCompetencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TOTAL_RONDAS = 5;
        final int OPCION_TOTALES = 1;
        final int OPCION_CATEGORIAS = 2;
        final int OPCION_GANADOR = 3;

        int repetir = 1;

        do {
            int cantidadParticipantes = 0, participanteGanador = 1;
            int op = 0, rondasBajas = 0, rondasMedias = 0, rondasAltas = 0;

            double mayorDistanciaAcumulada = -1, distanciaTotalGeneral = 0, promedioGeneral = 0;

            System.out.println("Bienvenido al simulador de competencia");
            System.out.print("Ingresa la cantidad de participantes: ");
            cantidadParticipantes = scanner.nextInt();

            while (cantidadParticipantes <= 0) {
                System.out.print("Debe ser mayor a cero, ingresalo de nuevo: ");
                cantidadParticipantes = scanner.nextInt();
            }

            for (int i = 1; i <= cantidadParticipantes; i++) {
                System.out.println("Participante numero " + i);

                double distanciaParticipanteActual = 0;

                for (int r = 1; r <= TOTAL_RONDAS; r++) {
                    double distanciaRonda = -1;

                    while (distanciaRonda < 0) {
                        System.out.print("Ingresa la distancia recorrida en la ronda " + r + ": ");
                        distanciaRonda = scanner.nextDouble();

                        if (distanciaRonda < 0) {
                            System.out.println("La distancia no puede ser negativa");
                        }
                    }

                    distanciaParticipanteActual = distanciaParticipanteActual + distanciaRonda;

                    if (distanciaRonda < 2) {
                        System.out.println("Clasificacion: Bajo");
                        rondasBajas++;
                    } else if (distanciaRonda <= 4) {
                        System.out.println("Clasificacion: Medio");
                        rondasMedias++;
                    } else {
                        System.out.println("Clasificacion: Alto");
                        rondasAltas++;
                    }
                }

                distanciaTotalGeneral = distanciaTotalGeneral + distanciaParticipanteActual;

                double promedioParticipante = distanciaParticipanteActual / TOTAL_RONDAS;

                System.out.println("Distancia total del participante " + i + ": " + distanciaParticipanteActual);
                System.out.println("Promedio del participante " + i + ": " + promedioParticipante);

                if (distanciaParticipanteActual > mayorDistanciaAcumulada) {
                    mayorDistanciaAcumulada = distanciaParticipanteActual;
                    participanteGanador = i;
                }
            }

            promedioGeneral = distanciaTotalGeneral / cantidadParticipantes;

            System.out.println("Que quieres ver");
            System.out.println("1) Distancia total y promedio general de la competencia");
            System.out.println("2) Conteo de rondas por categoria");
            System.out.println("3) Participante con mayor distancia acumulada");
            System.out.print("Elige una opcion");
            op = scanner.nextInt();

            switch (op) {
                case OPCION_TOTALES:
                    System.out.println("resumen ");
                    System.out.println("Distancia total de todos los participantes: " + distanciaTotalGeneral);
                    System.out.println("Promedio general por participante: " + promedioGeneral);
                    break;

                case OPCION_CATEGORIAS:
                    System.out.println("estadisticas de clasificaciones ");
                    System.out.println("Total de rondas bajas: " + rondasBajas);
                    System.out.println("Total de rondas medias: " + rondasMedias);
                    System.out.println("Total de rondas altas: " + rondasAltas);
                    break;

                case OPCION_GANADOR:
                    System.out.println("El ganador el mas goat");
                    System.out.println("El ganador es el participante " + participanteGanador + " con " + mayorDistanciaAcumulada);
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println("Quieres registrar otra competencia?");
            System.out.println("1) Si");
            System.out.println("2) No");
            System.out.print("Elige una opcion: ");
            repetir = scanner.nextInt();

        } while (repetir == 1);

        System.out.println("Adios manito");
    }
}