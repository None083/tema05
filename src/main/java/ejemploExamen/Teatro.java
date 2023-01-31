/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploExamen;

/**
 *
 * @author FX506
 */
public class Teatro {

    private char[][] asientos;

    public Teatro(int fila, int columna) {
        this.asientos = new char[fila][columna];
        this.rellenarTeatro();
    }

    public void rellenarTeatro() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (i % 2 == 1 || j % 2 == 1) {
                    asientos[i][j] = 'X';
                } else {
                    asientos[i][j] = 'L';
                }
            }
        }
    }
    
    public void imprimirAsientos(){
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j]);
            }
            System.out.println("");
        }
    }
    
    public String reservarAsiento(int fila, int columna){
        if (asientos[fila][columna] == 'L'){
            asientos[fila][columna] = 'V';
            return "Asiento reservado";
        } else{
            return "Asiento no disponible"; 
        }
        
    }
    
}
