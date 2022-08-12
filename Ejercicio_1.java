package com.company;

public class Ejercicio_1 {
    //Version Java JDK 18.0
    public static void main(String[] args) {
        /* Esta línea se ejecutaría la primera si tuviéramos la función LeerFichero en el archivo,
        como no la tenemos, la dejo comentada para poder comprobar el funcionamiento de los algoritmos correctamente
        int [] numeros = LeerFichero("Archivo.txt");*/
        int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 15, 18, 150, 170, 192, 190, 192, 150, 180};
        int numMaximo = maxValue(numeros);
        System.out.print("MAX: " + numMaximo + ",    ");
        System.out.print("MIN: " + minValue(numeros) + ",    ");
        System.out.print("MEDIA: " + avg(numeros) + ", ");
        System.out.print("Nª VECES MAX: " + countMax(numMaximo, numeros));
    }

    /**
     * Esta función se usa para saber cual es el número más pequeño del array introducido
     * @param numeros Array de números del fichero que se da de entrada
     * @return el número menor del array
     */
    public static int minValue(int [] numeros){
        int MinValue = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]< MinValue){
                MinValue = numeros[i];
            }
        }
        return MinValue;
    }

    /**
     * Esta función se usa para saber cuál es el número más grande del array introducido
     * @param numeros Array de números del fichero que se da de entrada
     * @return el número mayor del array
     */
    public static int maxValue(int [] numeros){
        int MaxValue = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > MaxValue){
                MaxValue = numeros[i];
            }
        }
        return MaxValue;
    }

    /**
     * Esta función se usa para saber cuál es la mediana de los números del array introducido
     * @param numeros Array de números del fichero que se da de entrada
     * @return mediana aritmética de los números del array
     */
    public static float avg(int [] numeros){
        float suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        float avg = suma / numeros.length;
        return avg;
    }

    /**
     * Esta función se usa para saber cuantas veces aparece el número mayor en el array
     * @param maxValue Numero mayor del array (Se podría mirar en el mismo método, pero aprovechando que
     *                 tenemos el método maxValue, se pone como valor de entrada)
     * @param numeros Array de números del fichero que se da de entrada
     * @return el número de veces que está el número mayor en el array
     */
    public static int countMax(int maxValue, int [] numeros){
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (maxValue == numeros[i]){
                contador++;
            }
        }
        return contador;
    }

}
