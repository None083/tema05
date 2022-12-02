/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut05estructurasdealmacenamiento;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author FX506
 */
public class UT0503 {

    /**
     *
     */
    public static void main(String[] args) {

        double[] numeros = new double[20];
        Arrays.fill(numeros, 7.5);
        double[] copia1 = Arrays.copyOf(numeros, 20);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Array numeros: " + numeros[i]);
        }

        for (int i = 0; i < copia1.length; i++) {
            System.out.println("Array copia1: " + copia1[i]);
        }
        
        System.out.println(Arrays.equals(numeros, copia1) 
                ? "Son iguales" : "Son diferentes");
        
        Random aleatorio = new Random();
        int posicionAleatoria = aleatorio.nextInt(20);
        numeros[posicionAleatoria] = 6.3;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Array numeros: " + numeros[i]);
        }

        for (int i = 0; i < copia1.length; i++) {
            System.out.println("Array copia1: " + copia1[i]);
        }
        
        System.out.println(Arrays.equals(numeros, copia1) 
                ? "Son iguales" : "Son diferentes");

    }

}
