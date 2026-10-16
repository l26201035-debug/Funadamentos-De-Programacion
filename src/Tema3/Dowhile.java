package Tema3;
public class Dowhile {
    static void main(String[] args) {
        int contador = 0;

        do{ //Inicio de do-while
            System.out.println("contador = " + contador);
            contador = contador + 1;
        }while (contador <= 5);// Fin de do-while
        System.out.println("Sigan viendo");
    }
}