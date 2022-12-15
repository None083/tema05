/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.time.LocalDate;

/**
 *
 * @author noelia
 */
public class EjemplosEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empresa empresa1 = new Empresa();
        Cliente cliente1 = new Cliente("Noelia", "Pérez");
        //Alquiler alquiler1 = new Alquiler(cliente1, vehiculo, LocalDate.MIN, 0);
        empresa1.registrarCliente(cliente1);
        System.out.println(empresa1.mostrarAlquiler());
        System.out.println(empresa1.mostrarCliente());
        System.out.println(empresa1.mostrarVehiculo());
        
        
    }
    
}
