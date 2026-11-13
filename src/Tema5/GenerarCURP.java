package Tema5;

import java.util.Scanner;
import java.util.Random;

public class GenerarCURP {
    static Scanner scanner = new Scanner(System.in);
    static String Nombre, ApPaterno, ApMaterno, Sexo, LugarNacimiento, FechaNacimiento, CURP;

    public static void main(String[] args) {
        System.out.println("-------Por favor ingrese los siguientes datos-------");
        System.out.println("Nombre o nombres: ");
        Nombre = scanner.nextLine();
        System.out.println("Apellido paterno:");
        ApPaterno = scanner.nextLine();
        System.out.println("Apellido materno:");
        ApMaterno = scanner.nextLine();
        System.out.println("Fecha de nacimiento (DD/MM/AAAA):");
        FechaNacimiento = scanner.nextLine();
        System.out.println("Sexo:");
        Sexo = scanner.nextLine();
        System.out.println("Entidad federativa de nacimiento:");
        LugarNacimiento = scanner.nextLine();

        CURP = generarCURP(Nombre, ApPaterno, ApMaterno, FechaNacimiento, Sexo, LugarNacimiento);

        System.out.println("CURP = " + CURP );
    }

    public static String obtenerPrimeraLetra(String palabra) {
        return palabra.substring(0, 1).toUpperCase();
    }

    public static String obtenerPrimeraVocal(String palabra) {
        String p = palabra.toLowerCase();
        for (int i = 1; i < p.length(); i++) {
            char letra = p.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' ||
                    letra == 'o' || letra == 'u') {
                return String.valueOf(letra).toUpperCase();
            }
        }
        return "X";
    }

    public static String obtenerPrimeraConsonante(String palabra) {
        String p = palabra.toLowerCase();
        for (int i = 1; i < p.length(); i++) {
            char letra = p.charAt(i);
            if (letra >= 'a' && letra <= 'z' &&
                    letra != 'a' && letra != 'e' && letra != 'i' &&
                    letra != 'o' && letra != 'u') {
                return String.valueOf(letra).toUpperCase();
            }
        }
        return "X";
    }

    public static String obtenerFecha(String fecha) {
        String anio = fecha.substring(8, 10);
        String mes = fecha.substring(3, 5);
        String dia = fecha.substring(0, 2);

        return anio + mes + dia;
    }

    public static String obtenerClaveEstado(String estado) {
        switch (estado) {
            case "Aguascalientes": return "AS";
            case "Baja California": return "BC";
            case "Baja California Sur": return "BS";
            case "Campeche": return "CC";
            case "Coahuila": return "CL";
            case "Colima": return "CM";
            case "Chiapas": return "CS";
            case "Chihuahua": return "CH";
            case "Ciudad de México": return "DF";
            case "Durango": return "DG";
            case "Guanajuato": return "GT";
            case "Guerrero": return "GR";
            case "Hidalgo": return "HG";
            case "Jalisco": return "JC";
            case "Estado de México": return "MC";
            case "Michoacán": return "MN";
            case "Morelos": return "MS";
            case "Nayarit": return "NT";
            case "Nuevo León": return "NL";
            case "Oaxaca": return "OC";
            case "Puebla": return "PL";
            case "Querétaro": return "QT";
            case "Quintana Roo": return "QR";
            case "San Luis Potosí": return "SP";
            case "Sinaloa": return "SL";
            case "Sonora": return "SR";
            case "Tabasco": return "TC";
            case "Tamaulipas": return "TS";
            case "Tlaxcala": return "TL";
            case "Veracruz": return "VZ";
            case "Yucatán": return "YN";
            case "Zacatecas": return "ZS";
            default: return "NE";
        }
    }

    public static String generarCURP(String nombre, String apellidopaterno, String apellidomaterno
            ,String fechanacimiento, String sexo, String lugarnacimiento) {
        String primernombre = nombre.split(" ")[0];

        String resultado = obtenerPrimeraLetra(apellidopaterno);
        resultado = resultado + obtenerPrimeraVocal(apellidopaterno);
        resultado = resultado + obtenerPrimeraLetra(apellidomaterno);
        resultado = resultado + obtenerPrimeraLetra(primernombre);

        resultado = resultado + obtenerFecha(fechanacimiento);
        resultado = resultado + sexo.toUpperCase();

        resultado = resultado + obtenerClaveEstado(lugarnacimiento);

        resultado = resultado + obtenerPrimeraConsonante(apellidopaterno);
        resultado = resultado + obtenerPrimeraConsonante(apellidomaterno);
        resultado = resultado + obtenerPrimeraConsonante(primernombre);

        Random r = new Random();
        resultado =resultado+ (char) (r.nextInt(26) + 65);
        resultado =resultado+ (char) (r.nextInt(10) + 48);

        return resultado.toUpperCase();
    }
}