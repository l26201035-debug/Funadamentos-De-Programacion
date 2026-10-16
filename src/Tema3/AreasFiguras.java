package Tema3;
import java.util.Scanner;
public class AreasFiguras {
    static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int op, a, b;
        System.out.println("Bienvenido usuario");
        System.out.println("Selecciona alguna de estas opciones");
        System.out.println("1)Cuadrado\n2)Rectangulo\n3)Triangulo\n4)Circulo");
        op = scanner.nextInt();
        switch (op) {
            case 1:
                System.out.println("Seleccionista Cuadrado");
                System.out.println("Ingresa la longitud de su lados por favor");
                a = scanner.nextInt();
                System.out.println("Resultado es " + (a * a));
                break;
            case 2:
                System.out.println("Seleccioninaste Rectangulo");
                System.out.println("Ingresa el valor de la base");
                b = scanner.nextInt();
                System.out.println("Ingresa el valor de la altura");
                a= scanner.nextInt();
                System.out.println("El area de su figura es " + (a *b));
                break;
            case 3:
                System.out.println("Seleccioanste Triangulo");
                System.out.println("Ingresa el valor de la base");
                b = scanner.nextInt();
                System.out.println("Ingresa el valor de la altura");
                a= scanner.nextInt();
                System.out.println("El area de su figura es "+ (a * b)/2);
                break;
            case 4:
                System.out.println("Seleccionaste Circulo");
                System.out.println("Ingresa por favor el valor de su radio");
                a = scanner.nextInt();
                System.out.println("Su resultado es de " + (Math.PI * (a * a)));
                break;
            default:
                System.out.println("Ingrese un valor valido por favor");
        }
    }
}
