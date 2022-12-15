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
public class UT0513 {

    /**
     * Escribir un programa que lea números enteros entre 1 y 20 desde teclado.
     * Se debe generar un histograma con las frecuencias de cada entero en la
     * secuencia. Para representar las barras del histograma hay que utilizar
     * secuencias del carácter ‘*’. El programa finaliza al introducir un cero.
     * Por ejemplo, la secuencia: 1, 1, 20, 1, 2, 20, 3, 3, 3, 4, 4, 4, 5, 3
     * generaría la siguiente salida: 1: *** 2: * 3: **** 4: *** 5: 6: 7: …
     * 20:**
     *
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }

        int numero = 0;

        do {
            System.out.println("Introduce un número: ");
            numero = teclado.nextInt();
            if (numero > 0 && numero <= 20) {
                array[numero-1]++;
            }

        } while (numero != 0);

        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ":");
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
