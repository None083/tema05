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
public class AlquilerVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CatalogoVehiculos catV = new CatalogoVehiculos(5);
        CatalogoClientes catC = new CatalogoClientes(5);

        Cliente c = catC.buscarCliente("3");
        Vehiculo v = catV.buscarVehiculo("4");

        System.out.println(c);
        System.out.println(v);
        Alquiler a = new Alquiler(c, v, LocalDate.now(), 8);
        System.out.println(a);
        CatalogoAlquileres ca = new CatalogoAlquileres(10);
        ca.anadirAlquiler(a);
        System.out.println("Lista Alquileres");
        System.out.println(ca);

    }

}
