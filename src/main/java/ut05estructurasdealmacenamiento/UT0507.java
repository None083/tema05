/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut05estructurasdealmacenamiento;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class UT0507 {

    /**
     * Escribir un programa que lea del teclado el tamaño de dos arrays de
     * enteros (el mismo tamaño para los dos arrays). El programa inicializará
     * los arrays con números aleatorios entre 1 y 100. Existirá un método
     * llamado multiplicar que recibirá los dos arrays e irá multiplicando los
     * elementos dos a dos, empezando por los elementos que ocupan la posición
     * cero, luego la uno, etc, guardando el resultado en otro array, que será
     * devuelto por el método. Además existirá un método para imprimir por
     * pantalla los valores de los arrays.
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tamaño de los arrays");
        int tamañoArray = teclado.nextInt();
        int[] array1 = new int[tamañoArray];
        int[] array2 = new int[tamañoArray];

        Random aleatorio = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = aleatorio.nextInt(100) + 1;
            array2[i] = aleatorio.nextInt(100) + 1;
        }
        
        int[] arrayMultiplicacion = multiplicar(array1, array2);
        
        imprimirArrays(array1, array2, arrayMultiplicacion);

    }

    private static int[] multiplicar(int[] array1, int[] array2) {

        int[] arrayMultiplicacion = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            arrayMultiplicacion[i] = array1[i] * array2[i];
        }
        return arrayMultiplicacion;
    }

    private static void imprimirArrays(int[] array1, int[] array2, int[] arrayMultiplicacion) {

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + " x " + array2[i] + " = " + arrayMultiplicacion[i]);
        }
        
    }

}
