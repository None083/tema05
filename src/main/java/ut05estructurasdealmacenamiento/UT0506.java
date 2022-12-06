/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut05estructurasdealmacenamiento;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author noelia
 */
public class UT0506 {

    /**
     * Hacer un programa que determine si dos arrays son iguales. Probarlo con
     * los arrays [1,2,3] y [1,2,3], [1,2,3,4] y [1,2,3] , [1,2,3] y [1,2,2].
     * Este ejercicio hay que hacerlo de dos formas: la primera, usando la clase
     * Arrays; la segunda, creando un método que vaya comparando los valores de
     * los arrays y devuelva true si todos son iguales o false en caso
     * contrario.
     *
     */
    public static void main(String[] args) {

        int array1[] = {1, 2, 3};
        int copiaArray1[] = Arrays.copyOf(array1, 3);
        int array2[] = {1, 2, 3, 4};
        int array3[] = {1, 2, 2};

        System.out.println(Arrays.equals(array1, copiaArray1)
                ? "Son iguales" : "Son diferentes");
        System.out.println(Arrays.equals(array2, array1)
                ? "Son iguales" : "Son diferentes");
        System.out.println(Arrays.equals(array1, array3)
                ? "Son iguales" : "Son diferentes");
        
        System.out.println(miEquals(array1, copiaArray1)
                ? "Son iguales" : "Son diferentes");
        System.out.println(miEquals(array2, array1)
                ? "Son iguales" : "Son diferentes");
        System.out.println(miEquals(array1, array3)
                ? "Son iguales" : "Son diferentes");

    }

    private static boolean miEquals(int array1[], int array2[]) {

        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }

    }

}
