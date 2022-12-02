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
public class UT0505 {

    /**
     *
     */
    public static void main(String[] args) {

        int[] numeros = new int[10];

        leerValores(numeros);
        System.out.println("Numeros positivos: " + numerosPositivos(numeros));
        System.out.println("Numeros negativos: " + numerosNegativos(numeros));
        System.out.println("Numeros cero: " + contarCero(numeros));
        mostrarArray(numeros);
        calcularMediaPositivos(numeros);
        calcularMediaNegativos(numeros);

    }

    private static void leerValores(int[] numeros) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el valor de " + i);
            numeros[i] = teclado.nextInt();
        }
    }

    private static int numerosPositivos(int[] numeros) {
        int positivos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos++;
            }
        }
        return positivos;
    }

    private static int numerosNegativos(int[] numeros) {
        int negativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                negativos++;
            }
        }
        return negativos;
    }

    private static int contarCero(int[] numeros) {
        int ceros = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                ceros++;
            }
        }
        return ceros;
    }

    private static void mostrarArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    private static void calcularMediaPositivos(int[] numeros) {
        int sumaPositivos = 0;
        int aux;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
            }
        }
        try {
            aux = sumaPositivos / numerosPositivos(numeros);
        } catch (ArithmeticException ae) {
            aux = 0;
        }

        System.out.println("La media de positivos es: " + aux);
    }

    private static void calcularMediaNegativos(int[] numeros) {
        int sumaNegativos = 0;
        int aux;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
            }
        }
        try {
            aux = sumaNegativos / numerosNegativos(numeros);
        } catch (ArithmeticException ae) {
            aux = 0;
        }

        System.out.println("La media de negativos es: " + aux);
    }

}
