import java.util.Scanner;

public class Cálculo_Sala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        final int HORASBASE = 40;
        int hrs_trabajada;
        int pag_hora = 100;
        int horas;

        System.out.println("Por favor ingrese su nombre");
        nombre = scanner.nextLine();
        System.out.println("Ingrese las horas que trabajo");
        horas = scanner.nextInt();
        System.out.println("Ingrese su pago por hora");
        pag_hora = scanner.nextInt();

        if (horas <= HORASBASE) {
            int pagoFinal = pag_hora * horas;
            System.out.println("--- Resumen de Pago ---");
            System.out.println("Nombre: " + nombre);
            System.out.println("Horas trabajadas: " + horas);
            System.out.println("Horas normales: " + horas);
            System.out.println("Pago por hora: $" + pag_hora);
            System.out.println("Horas extra: 0");
            System.out.println("Pago final: $" + pagoFinal);
        } else {
            int horasextra = horas - HORASBASE;
            int pagoFinal = ((pag_hora * HORASBASE) + (horasextra * pag_hora * 2));
            System.out.println("--- Resumen de Pago ---");
            System.out.println("Nombre: " + nombre);
            System.out.println("Horas trabajadas: " + horas);
            System.out.println("Horas normales: " + HORASBASE);
            System.out.println("Pago por hora: $" + pag_hora);
            System.out.println("Horas extra: " + horasextra);
            System.out.println("Pago final: $" + pagoFinal);
        }
    }
}