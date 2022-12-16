/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut05estructurasdealmacenamiento;

import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class UT0508 {

    /**
     * Realizar un programa que lea de la entrada un número y utilice ese número
     * para crear un array de enteros de ese tamaño. A continuación, el programa
     * inicializa el array con los valores que el usuario introduzca por
     * teclado. Finalmente, se deberá recorrer el array e imprimir tantos
     * caracteres ‘*’ como indique el valor de cada elemento del array. Ejemplo:
     * los valores 5,4,3,2 producirán la siguiente salida: ***** **** *** **
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array");
        int numero = teclado.nextInt();
        int[] array = new int[numero];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce un número para la posición " + i);
            array[i] = teclado.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
