/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploExamen;

/**
 *
 * @author FX506
 * 
 * crea un teatro con unas dimesiones introducidas por teclado, 
 * por seguridad contra el covid las filas impares no se podran reservar 
 * y ademas las columnas impares tampoco, crea un programa en el que 
 * se pueda reservar y ver la disponibilidad de los asientos
 * 
 * para ver la disponibilidad de los asientos se mostrara con x las que 
 * no se pueden reservar, con L los asientos libres y V los asientos ya reservados
 * 
 */
public class ejemplo {
    
    public static void main(String[] args) {
        Teatro t = new Teatro(5,5);
        
        t.imprimirAsientos();
        
        t.reservarAsiento(0, 0);
        t.reservarAsiento(2, 0);
        
        System.out.println(t.reservarAsiento(4, 2));
        System.out.println(t.reservarAsiento(0, 0));
        
        t.imprimirAsientos();
        
        
    }

    
}
