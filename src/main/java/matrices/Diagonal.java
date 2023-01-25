/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author noelia
 */
public class Diagonal {

    /**
     * matriz nxn recorrer diagonal principal recorrer diagonal secundaria
     */
    public static void main(String[] args) {

        //diagonal desde esquina superior izquierda
        //for(int i = 0; i< m.lenght; i++){
        //a = m[i][i];
        //sout (a)
        //}
        //diagonal desde esquina superior derecha
        //for(int i = 0; i< m.lenght; i++){
        //a = [i][m.lenght - 1 - i]
        //sout (a)
        //}
        int[][] matriz = {
            {4, 6, 3, 2},
            {5, 9, 7, 6},
            {4, 4, 1, 1},
            {0, 3, 6, 8}
        };

        mostrar(matriz);
        List<Integer> diagonal = elementosDiagonalPrincipal(matriz);
        diagonal.forEach(System.out::println);
        
        System.out.println(Arrays.toString(elementosDiagonalSecundaria(matriz)));

    }
    
    public static int[] elementosDiagonalSecundaria(int[][] m){
        int[] array = new int[m.length];
        
         for (int i = 0; i < m.length; i++) {
            array[i] = m[i][m.length - 1 - i];
        }
         return array;
    }

    //lista de elemento que estan en la diagonal principal
    public static List<Integer> elementosDiagonalPrincipal(int[][] m) {
        List<Integer> lista = new ArrayList<>();
        
        for (int i = 0; i < m.length; i++) {
            lista.add(m[i][i]);
        }
        
        return lista;
    }

    // a la izquierda de los : se pone el tipo de lo que va a devolver
    public static void mostrar(int[][] m) {
        for (int[] fila : m) { // por cada fila de la matriz m
            for (int valor : fila) { // por cada elemento que hay en la fila
                System.out.print(valor + " ");
            }
            System.out.println("");
        }
    }

}
