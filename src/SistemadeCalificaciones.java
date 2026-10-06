import java.util.Scanner;
public class SistemadeCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MINIMO_APROBATORIO = 70;
        final int MINIMO_UNIDAD = 60;
        System.out.println("Bienvenido usuario, por favor ingrese sus 3 calificaciones");
        System.out.println("Ingrese su primera calificacion");
        double primeracalificacion = scanner.nextDouble();
        System.out.println("Ingrese su segunda calificacion");
        double segundacalificacion = scanner.nextDouble();
        System.out.println("Ingrese su tercera calificacion");
        double terceracalificacion = scanner.nextDouble();
        double promedio = (primeracalificacion + segundacalificacion + terceracalificacion)/3;
        System.out.println("----------RESULTADOS----------");
        System.out.println("Su primera calificacion fue de " + primeracalificacion);
        System.out.println("Su segunda calificacion fue de " + segundacalificacion);
        System.out.println("Su tercera calificacion fue de " + terceracalificacion);
        System.out.println("Su promedio total es de " +  promedio);
        if (promedio >= MINIMO_APROBATORIO) {
            System.out.println("FELICIDADES ALUMNO");
            System.out.println("Usted aprobo");
        } else {
            System.out.println("Lo lamentamos alumno");
            System.out.println("Usted reprobo");
        }
            if (primeracalificacion < MINIMO_UNIDAD) {
                System.out.println("Su calificacion es reprobatoria. Debe presentar recuperacion de la Unidad 1");
            }
            if (segundacalificacion < MINIMO_UNIDAD) {
                System.out.println("Su calificacion es reprobatoria. Debe presentar recuperacion de la Unidad 2");
            }
            if (terceracalificacion < MINIMO_UNIDAD) {
                System.out.println("Su calificacion es reprobatoria. Debe presentar recuperacion de la Unidad 3");
            }

    }
}
