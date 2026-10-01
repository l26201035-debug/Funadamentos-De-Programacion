import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombre;
        final String SALUDO = "HOLA";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe tu nombre");
        nombre = scanner.nextLine();
        System.out.println(SALUDO + nombre);
    }

}