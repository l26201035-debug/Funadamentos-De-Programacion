package Tema5.DesafioBoveda;

public class Desafios {
    public void presentarDesafio(int op){
        switch (op){
            case 1:
            System.out.println("Encontrar el siguiente número: 2, 6, 12, 20, 30, 42, ___");
            break;
            case 2:
                System.out.println("Encontrar un número entero que cumpla las siguientes condiciones:");
                System.out.println("Es mayor que 20 y menor que 100");
                System.out.println("Es divisible entre 2");
                System.out.println("Al dividirlo entre 5 deja residuo 2");
                System.out.println("La suma de sus dígitos es 8");
                break;
            case 3:
                System.out.println("Un padre tiene actualmente el triple de la edad de su hijo. Dentro de 12 años, el padre tendrá el doble de la edad de\n" +
                        "su hijo. ¿Cuáles son las edades actuales de ambos?");
                break;
            case 4:
                System.out.println("Encontrar un número de tres cifras que cumpla las siguientes condiciones:");
                System.out.println("La cifra de las centenas es el doble de la cifra de las unidades");
                System.out.println("La cifra de las decenas es 3 unidades mayor que la cifra de las unidades");
                System.out.println("La suma de las tres cifras es 15");
                break;
            case 5:
                System.out.println("Una persona tiene 20 monedas, algunas de $5 y otras de $10. En total tiene $140. ¿Cuántas monedas tiene de\n" +
                        "cada denominación?");
                break;

        }
    }
}
