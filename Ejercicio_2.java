package com.company;

import java.util.ArrayList;

public class Ejercicio_2 {
    //Version Java JDK 18.0
    public static void main(String[] args) {
        compobarPalindromo();
    }

    /**
     * Este metodo se usa para saber si una palabra es un polindromo o no
     */
    public static void compobarPalindromo(){
        /* Esta línea se ejecutaría la primera si tuviéramos la función LeerFichero en el archivo,
        como no la tenemos, la dejo comentada para poder comprobar el funcionamiento de los algoritmos correctamente
        char [] palabra = LeerPalabra("Archivo.txt");*/
        char [] palabra = {'R', 'A', 'D', 'A', 'R'};
        ArrayList <String> aux = new ArrayList<>();
        boolean EsPalidromo = true;
        for (int i = 0; i < palabra.length; i++) {
            aux.add(0, String.valueOf(palabra[i]));
        }
        for (int i = 0; i < palabra.length; i++) {
            if (aux.get(i).equalsIgnoreCase(String.valueOf(palabra[i]))){

            } else {
                EsPalidromo = false;
            }
        }
        if (EsPalidromo){
            System.out.println("La palabra del fichero es un Palindromo");
        } else {
            System.out.println("La palabra del fichero no es un Palindromo");
        }
    }
}
