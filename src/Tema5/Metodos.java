package Tema5;

public class Metodos {
    static int CONSTANTE = 10;
    static int acumulador = 0; // Se pueden declarar variables mundiales, o sea desde arriba pe

    static void main(String[] args) {
        System.out.println("Hola mundo");
        float a = 5.0f; //flotantes es un numeros decimales
        float b = 10.5f;
        suma();
        float c = a + b;
        System.out.println("c = " + c);
        resta();
    }
    public static void suma(){ // se puede nombrar como queramos como suma o patito lo que sea
        float a = 6.0f;
        float b = 15.0f;
        System.out.println("Resultado " + (a+b+CONSTANTE));
        acumulador += (a+b+CONSTANTE);
    }
    public static void resta (){ // puedes hacer cuantas metodos se te antojen pero siempre declarala antes para que amarre
        float a = 6.0f;
        float b = 15.0f;
        System.out.println("Resultado " + (a-b+CONSTANTE));
        acumulador += (a-b+CONSTANTE);
    }
}
