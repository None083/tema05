/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploExamen;

/**
 *
 * @author FX506
 */
public class PruebaSopa {

    public static void main(String[] args) {
        
        SopaLetras sopa1 = new SopaLetras(5, 5);
        sopa1.imprimir();
        sopa1.colocarPalabraHorizontal(1, 1, "caca");
        sopa1.imprimir();
        System.out.println("");
        
    }
    
}
