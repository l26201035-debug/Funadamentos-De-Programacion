import java.util.Scanner;

public class Tec {
    public static void main (String[] args) {
        final String ESCUELA = "TECNOLOGICO NACIONAL DE MEXICO";
        String nombre;
        String apellido;
        String carrera;
        String semestre;
        String promedio;
        String edad;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        nombre = scanner.nextLine();
        System.out.println("Escribe tu Apellido");
        apellido = scanner.nextLine();
        System.out.println("Escribe tu Carrera");
        carrera = scanner.nextLine();
        System.out.println("Escribe tu Semestre");
        semestre = scanner.nextLine();
        System.out.println("Escribe tu Promedio");
        promedio = scanner.nextLine();
        System.out.println("Escribe tu Edad");
        edad = scanner.nextLine();
        System.out.println(ESCUELA);
        System.out.println("HOLA" + nombre);
        System.out.println("Su apellido es" +apellido);
        System.out.println("Su carrear es" +carrera);
        System.out.println("Su semestre es \n"  +semestre);
        System.out.println("Su promedio es de \n" +promedio);
        System.out.println("Su edad es de \n"  +edad);
    }
}
