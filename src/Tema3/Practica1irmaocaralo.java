package Tema3;

import java.util.Scanner;

public class Practica1irmaocaralo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int niño = 0, adolescente = 0, adulto = 0, adultomayor = 0;
        int totalpacientes = 0;
        int totaldescuentos = 0;
        double montouniversal = 0;
        double totaldescuentodinero = 0;
        final double DESCUENTOMAYOR = 0.15;
        double costoconsulta;
        int op = 0;

        System.out.println("Ola manito, bienvenido al central medico");
        while (op != 3) {
            System.out.println("Elige que deseas hacer");
            System.out.println("1) Registrar paciente");
            System.out.println("2) Ver el resumen del dia");
            System.out.println("3) Salir");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Ingresa la edad del paciente manito: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingresa cuanto cuesta su consulta: ");
                    costoconsulta = scanner.nextDouble();
                    double costofinal = costoconsulta;

                    if (edad < 12) {
                        niño++;
                        System.out.println("Categoria del paciente: Niño");
                    } else if (edad >= 12 && edad <= 17) {
                        adolescente++;
                        System.out.println("Categoria del paciente: Adolescente");
                    } else if (edad >= 18 && edad <= 59) {
                        adulto++;
                        System.out.println("Categoria del paciente: Adulto");
                    } else {
                        adultomayor++;
                        totaldescuentos++;
                        double descuento = costoconsulta * DESCUENTOMAYOR;
                        totaldescuentodinero = totaldescuentodinero + descuento;
                        costofinal = costoconsulta - descuento;
                        System.out.println("Categoria del paciente: Adulto Mayor");
                        System.out.println("Descuento aplicado: $" + descuento);
                    }
                    totalpacientes++;
                    montouniversal = montouniversal + costofinal;

                    System.out.println("Total a pagar por este paciente " + costofinal);
                    break;

                case 2:
                    System.out.println("Resumen del dia manito");
                    System.out.println("Total de pacientes atendidos: " + totalpacientes);
                    System.out.println("Total de niños: " + niño);
                    System.out.println("Total de adolescentes: " + adolescente);
                    System.out.println("Total de adultos: " + adulto);
                    System.out.println("Total de adultos mayores: " + adultomayor);
                    System.out.println("Total de descuentos aplicados: " + totaldescuentos);
                    System.out.println("Dinero total descontado: " + totaldescuentodinero);
                    System.out.println("Dinero total recaudado: " + montouniversal);

                    if (totalpacientes > 0) {
                        double promedio = montouniversal / totalpacientes;
                        System.out.println("el promedio pagado es de " + promedio);
                    }
                    break;

                case 3:
                    System.out.println("Adios manito");
                    break;

                default:
                    System.out.println("Opcion no valida manito, intenta de nuevo.");
                    break;
            }
        }
    }
}