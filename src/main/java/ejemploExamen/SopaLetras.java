/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploExamen;

/**
 *
 * @author FX506
 * 
 * Crea una sopa de letras de dimensiones dadas por parametro, incialmente 
 * todas las casillas estan rellenas de "*".  modifica el metodo tostring 
 * para que muestre la sopa de letras. 
 * Crea un metodo colocarPalabraHorizontal(int fila, int columna,String palabra) 
 * donde la fila y la columna indica el incio de la palabra en la sopa de letras 
 * que devolvera false si la palabra no cave o ya hay una letra introducida 
 * en alguna de las casillas que vayas a utilizar. 
 * Crea un metodo colocarPalabraVertical(int fila, int columna,String palabra) 
 * que haga lo mismo pero en vertical.
 * 
 * Crea un  main para probar los metodos.
 * 
 */
public class SopaLetras {
    
    private char[][] matriz;

    //rellenamos la matriz con *
    public SopaLetras(int fila, int columna) {
        this.matriz = new char[fila][columna];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = '*';
            }
        }
    }
    
    public void imprimir(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(this.matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
    public boolean colocarPalabraHorizontal(int fila, int columna, String palabra){
        if(columna + palabra.length() - 1 >= this.matriz[fila].length){
            return false;
        }
        for (int i = columna; i < columna + palabra.length(); i++) {
            if(this.matriz[fila][i] != '*'){
                return false;
            }
        }
        for (int i = columna; i < columna + palabra.length(); i++) {
            this.matriz[fila][i] = palabra.charAt(i - columna);
        }
        return true;
    }
    
}
