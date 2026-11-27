package Tema5.DesafioBoveda;

public class Puntuacion {
    int puntos = 0;
    public void agregarPunto() {
        puntos++;
    }

    public int calcularPuntuacion() {
        return puntos;
    }

    public void mostrarResultados() {
        System.out.println("-----RESULTADOS-----");
        System.out.println("Puntos obtenidos: " + calcularPuntuacion() + "/5");
    }
}