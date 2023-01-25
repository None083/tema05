/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

import java.util.ArrayList;
import java.util.List;
import static matrices.Diagonal.mostrar;

/**
 *
 * @author noelia
 */
public class Vecinas2 {

    public static void main(String[] args) {

        int[][] matriz = {
            {4, 6, 3, 2},
            {5, 9, 7, 6},
            {4, 4, 1, 1},
            {0, 3, 6, 8}
        };

        mostrar(matriz);
        List<Casilla> listaCasillas = casillasVecinas(1, 1, matriz);
        
        for (Casilla casilla: listaCasillas) {
            System.out.println(casilla);
        }
        

    }

    public static List<Casilla> casillasVecinas(int fila, int columna, int[][] m) {
        List<Casilla> lista = new ArrayList<>();

        // Comprobamos fila y columna para que sean válidas
        if (filaValida(fila, m) && columnaValida(columna, m)) {
            // recorremos fila anterior a la casilla hasta fila posterior
            for (int i = fila - 1; i <= fila + 1; i++) {
                if (filaValida(i, m)) { // si alguna fila no es válida, no la mira
                    // recorremos columna anterior a la casilla hasta columna posterior
                    for (int j = columna - 1; j <= columna + 1; j++) {
                        if (filaValida(i, m)) {
                            if (i == fila && j == columna) {
                                continue;
                            }

                            System.out.println("Casilla" + i + " " + j);
                            lista.add(new Casilla(i, j,m[i][j]));
                        }
                    }
                }

            }

        }

        return lista;
    }

    public static boolean filaValida(int fila, int[][] matriz) {
        return fila >= 0 && fila < matriz.length;
    }

    public static boolean columnaValida(int columna, int[][] matriz) {
        return columna >= 0 && columna < matriz.length;
    }

}
