/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author noelia
 */
public class Vecinas {

    /**
     * matriz nxn coordenada - fila, col
     */
    public static void main(String[] args) {

        Random random = new Random();
        int[][] matriz1 = new int[3][3];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = random.nextInt(21);
            }
        }
        
         for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
             System.out.println("");
        }
        ArrayList<Integer> array1 = buscarVecinos(matriz1, 0, 0);
        for (int i = 0; i < array1.size(); i++) {
            System.out.println(array1.get(i));
        }
    }

    private static ArrayList<Integer> buscarVecinos(int[][] matriz, int fila, int columna) {
        ArrayList<Integer> array1 = new ArrayList<>();
        if (fila - 1 >= 0 && columna - 1 >= 0) {
            array1.add(matriz[fila - 1][columna - 1]);
        }
        if (fila - 1 >= 0) {
            array1.add(matriz[fila - 1][columna]);
        }
        if (fila - 1 >= 0 && columna + 1 < matriz[fila].length) {
            array1.add(matriz[fila - 1][columna + 1]);
        }
        if (columna - 1 >= 0) {
            array1.add(matriz[fila][columna - 1]);
        }
        if (columna + 1 < matriz[fila].length) {
            array1.add(matriz[fila][columna + 1]);
        }
        if (fila + 1 < matriz.length && columna - 1 >= 0) {
            array1.add(matriz[fila + 1][columna - 1]);
        }
        if (fila + 1 < matriz.length) {
            array1.add(matriz[fila + 1][columna]);
        }
        if (fila + 1 < matriz.length && columna + 1 < matriz[fila].length) {
            array1.add(matriz[fila + 1][columna + 1]);
        }
        return array1;
    }

}
