package Tema5.DesafioBoveda;

public class Boveda {
    public String generarClave() {
        int r1 = 56;
        int r2 = 62;
        int r3 = 12;
        int r4 = 654;
        int r5 = 12;
        return "" + r1+r2 +r3 +r4 +r5;
    }
    public boolean verificarClave(String intento, String clave) {
        return intento.equals(clave);
    }
}