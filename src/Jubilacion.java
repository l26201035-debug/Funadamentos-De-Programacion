import java.util.Scanner;

public class Jubilacion { //turip ip ip

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int EDAD_JUBILACION = 65;
        String nombre;
        int edad = 0;

        System.out.println("Escribe tu nombre");
        nombre = scanner.nextLine();
        System.out.println("Escribe tu edad");
        edad = scanner.nextInt();

        if (edad >= EDAD_JUBILACION) {
            System.out.println(nombre + " Tiene " + edad + " años y esta listo para jubilarse");
        } // FinSi
        else { //sino
            System.out.println(nombre + " Tiene " + edad + " años y aún no se puede jubilar");
            System.out.println(EDAD_JUBILACION - edad);
        }
    }
}