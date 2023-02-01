/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploExamen;

import java.time.LocalDate;

/**
 *
 * @author FX506
 */
public class PruebaTrabajador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Trabajador t = new Trabajador("Noelia", "P", LocalDate.of(1992, 9, 8), CategoriaEmpleado.MEDIA);
        
        System.out.println(t);
        
    }
    
}
