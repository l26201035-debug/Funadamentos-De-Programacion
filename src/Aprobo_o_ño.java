import java.util.Scanner;

public class Aprobo_o_ño {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        final int Calificacion = 70;
        int califiacion_final; // Ola

        System.out.println("Ingrese su nombre por favor");
        nombre = scanner.nextLine();
        System.out.println("Ingrese su calificacion final por favor");
        califiacion_final = scanner.nextInt();

        if (califiacion_final < Calificacion) {
            System.out.println(nombre + " Lo lamentamos su califiacion es de " + califiacion_final + " No aprobo");
        } else {
            System.out.println(nombre + " FELICIDADES, usted acredito la materia");
        }
    }
}