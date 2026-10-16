package Tema3;

import java.util.Scanner;

public class Estacionamineto2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 0;
        int autos = 0, camioneta = 0, motocicleta = 0;
        int horas, tarifa = 0, tipo;
        int totalvehi = 0;
        double totalfinal =0;
        double pago;
        String Tipodeauto = "";
        while (op != 3) {
            System.out.println("Que quieres hacer manito");
            System.out.println("1) Registrar vehiculo \n 2) Resumen del dia \n 3) salir");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Bienvenido");
                    System.out.println("Seleccione el tipo de vehiculo que tiene");
                    System.out.println("1) Automovil-- $20 \n 2) Camioneta-- $30 \n 3) Motocicleta-- #$10");
                    tipo = scanner.nextInt();
                    if (tipo >= 1 && tipo <= 3) {
                        System.out.println("Ingrese las hora que estuvo manito");
                        horas = scanner.nextInt();
                        if (horas <= 0) {
                            System.out.println("Ingrese un valor de horas valido manito");
                            break;
                        }
                        switch (tipo) {
                            case 1:
                                tarifa = 20;
                                Tipodeauto = "Automovil";
                                autos++;
                                break;
                            case 2:
                                tarifa = 30;
                                Tipodeauto = "Camioneta";
                                camioneta++;
                                break;
                            case 3:
                                tarifa = 10;
                                Tipodeauto = "Motocicleta";
                                motocicleta++;
                                break;
                        }
                        pago = horas * tarifa;
                        totalfinal = totalfinal + pago;
                        totalvehi++;
                        System.out.println("***Su ticket mano****");
                        System.out.println("Su tipo de vehiculo es " + Tipodeauto);
                        System.out.println("Horas en la que permanecio " + horas);
                        System.out.println("Su total sera de " + pago);
                    } else {
                        System.out.println("Tipo invalido");
                    }
                    break;
                case 2:
                    System.out.println("Resumen del dia");
                    System.out.println("Total de vehiculos atentidos " + totalvehi);
                    System.out.println("Total de automoviles atendidos " + autos);
                    System.out.println("Total de camionetas atendidas " + camioneta);
                    System.out.println("Total de motocicletas atendidas " + motocicleta);
                    System.out.println("Total recaudado " + totalfinal);
                    break;
                case 3:
                    System.out.println("adios manito");
                    break;
            }
        }
    }
}