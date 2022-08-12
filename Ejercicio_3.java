package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_3 {
    //Version Java JDK 18.0
    private static Scanner read = new Scanner(System.in);
    final private static String menu = "Elige el idioma al que deseas traducir\n\t1.- Alemán\n\t2.- Bulgaro";
    public static void main(String[] args) {
        System.out.println(menu(leerPalabra(), leerInt(menu, 1, 2)));
    }

    /**
     * Funcion para leer la palabra introducida por el usuario
     * (para asegurarme de que el algoritmo funciona correctamente, en caso de no ser necesario,
     * se comenta o en el return, se pone la palabra deseada)
     * @return la palabra introducida por el usuario
     */
    public static String leerPalabra(){
        System.out.println("Que palabra quieres traducir?");
        String aux = read.next();
        read.nextLine();
        return aux;
    }

    /**
     * Funcion para saber a que idioma desea traducir
     * @param menu texto del menu
     * @param min numero minimo en el menu
     * @param max numero maximo en el menu
     * @return numero introducido por el usuario
     */
    public static int leerInt(String menu, int min, int max){
        int opcion = 0;
        boolean esNum = false;
        while (!esNum){
            System.out.println(menu);
            esNum = read.hasNextInt();
            if (esNum){
                opcion = read.nextInt();
                if (opcion >= min && opcion <= max){
                    esNum = true;
                } else {
                    System.out.println("El numero no esta entre " + min + " i " + max);
                    esNum = false;
                }
            } else {
                System.out.println("Has de introducir un numero!!");
            }
            read.nextLine();
        }
        return opcion;
    }

    /**
     * Se usa para saber si el ultimo caracter el vocal o no
     * @param palabra palabra a traducir
     * @return si la palabra acaba en vocal o no
     */
    public static boolean isVocal (String palabra){
        ArrayList <String> vocales = new ArrayList<>();
        vocales.add("a");
        vocales.add("e");
        vocales.add("i");
        vocales.add("o");
        vocales.add("u");
        String aux = String.valueOf(palabra.charAt(palabra.length() - 1));
        for (int i = 0; i < vocales.size(); i++) {
            if (aux.equalsIgnoreCase(vocales.get(i))){
                return true;
            }
        }
        return false;
    }

    /**
     * Menu para las traducciones (te traduce la palabra)
     * @param palabra palabra introducida por el usuario
     * @param idioma idioma introducido por el usuario
     * @return la palabra traducida a el idioma deseado
     */
    public static String menu (String palabra, int idioma){
        String palabra_traducida = "";
        switch (idioma){
            case 1:
                if (isVocal(palabra)){
                    palabra_traducida = palabra.substring(0, palabra.length()-1);
                    palabra_traducida = palabra_traducida + "ujem";
                } else {
                    palabra_traducida = palabra.substring(0, palabra.length()-2);
                    palabra_traducida = palabra_traducida + "ujem";
                }
                break;
            case 2:
                if (isVocal(palabra)){
                    palabra_traducida = palabra + "kov";
                } else {
                    palabra_traducida = palabra.substring(0, palabra.length()-1);
                    palabra_traducida = palabra_traducida + "kov";
                }
        }
        return palabra_traducida;
    }
}
