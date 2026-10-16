package Tema2;


public class Nulos {
    public static void main(String[] args){
        String n = null;
        //String nombre = "Israel";
        //String vacio = "";
        try{
            System.out.println(n.length());
        } catch (NullPointerException e) {
            System.out.println("No se puede ejecutar nulos");
        }
    }
}
