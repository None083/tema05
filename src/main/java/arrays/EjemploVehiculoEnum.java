/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author noelia
 */
public class EjemploVehiculoEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CatalogoVehiculos catalogo = new CatalogoVehiculos(10);
        System.out.println("nº de vehiculos del catalogo " + catalogo.getNumeroVehiculos());
        System.out.println(catalogo);
        
//        Vehiculo[] array = catalogo.getListaVehiculos();
//        catalogo.borrarVehiculo(catalogo.getListaVehiculos()[3]);
        System.out.println("----------------Después de borrar el de la posicion 3----------------");
        System.out.println("nº de vehiculos del catalogo " + catalogo.getNumeroVehiculos());
        System.out.println(catalogo);
        
        Vehiculo aux = new Vehiculo();
        aux.setBastidor("12344321");
        catalogo.anadirVehiculo(aux);
        
        System.out.println("----------------Después de borrar el de la posicion 3----------------");
        System.out.println("nº de vehiculos del catalogo " + catalogo.getNumeroVehiculos());
        System.out.println(catalogo);
        
        aux.setBastidor("99999999999");
        catalogo.anadirVehiculo(aux);
        
        System.out.println("----------------Después de borrar el de la posicion 3----------------");
        System.out.println("nº de vehiculos del catalogo " + catalogo.getNumeroVehiculos());
        System.out.println(catalogo);
        
//        Modelo aleatorio = Modelo.getAleatorio();
//        System.out.println("El modelo aleatorio es: " + aleatorio.getModelo());
//        System.out.println("Color: " + Color.getAleatorio());
//        
//        
//        Vehiculo v = new Vehiculo();
//        System.out.println(v);
//        
//        CatalogoVehiculos catalogo = new CatalogoVehiculos(10);
//        catalogo.mostrarCatalogo();
////      Vehiculo[] array = catalogo.getListaVehiculos();
//        catalogo.getListaVehiculos()[3].setBastidor("123A");
//        System.out.println("----------------------------------");
//        catalogo.mostrarCatalogo();
//        Vehiculo v2 = new Vehiculo();
//        v.setBastidor("123A");
//        System.out.println(v);
//        int pos = catalogo.buscarVehiculo(v2);
//        System.out.println("posicion " + pos);
//        catalogo.borrarVehiculo(catalogo.getListaVehiculos()[4]);
//        System.out.println("-------------------------------------");
//        catalogo.mostrarCatalogo();
        
        
    }
    
}
