/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploExamen;

/**
 *
 * @author FX506
 * 
 * 
 * 
 */
public class Teatro2 {
    
    private char[][] matriz;

    public Teatro2(int fila, int columna) {
        this.matriz = new char[fila][columna];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i % 2 == 1 || j % 2 == 1){
                    this.matriz[i][j] = 'X';
                }else{
                    this.matriz[i][j] = 'L';
                }
            }
        }
    }
    
    public void reservar(int fila, int columna){
        
    }
    
}
