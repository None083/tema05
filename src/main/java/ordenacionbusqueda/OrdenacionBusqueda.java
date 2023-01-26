/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacionbusqueda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author noelia
 */
public class OrdenacionBusqueda {
    
    public static void main(String[] args) {
        List<Pais> paises = new ArrayList<>();
        paises.add(new Pais("España", 46, 505_400, "Euro"));
        paises.add(new Pais("Portugal", 23, 25_400, "Euro"));
        paises.add(new Pais("EEUU", 146, 1_505_400, "Dolar Americano"));
        paises.add(new Pais("Vietnam", 46, 505_400, "Euro"));
        
        paises.forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        
        // Oredenar por moneda, usando orden natural, requiere que Pais implemente Comparable
        Collections.sort(paises);
        paises.forEach(System.out::println);
        
        //ordenacion usando comparator (proporcionamos el criterio 
        //mediante una lamda)
        Comparator<Pais> criterioSuperficie = (p1,p2)->Long.compare(p1.getSuperficie(), p2.getSuperficie());
        Comparator<Pais> criterioPoblacion = (p1,p2)->Long.compare(p1.getPoblacion(), p2.getPoblacion());
        Comparator<Pais> criterioNombre = (p1,p2)-> p1.getNombre().compareToIgnoreCase(p2.getNombre());
        
        Collections.sort(paises, criterioSuperficie.thenComparing(criterioNombre));
        System.out.println("--------------------------------------------------");
        paises.forEach(System.out::println);
        
        // busqueda por orden natural (por nombre)
        //la lista donde buscar la información debe estar ordenada previamente 
        //segun el criterio de orden natural (nombre) --> Comparable en Pais
        Collections.sort(paises);
        System.out.println("---------------------Busqueda binaria--------------------");
        System.out.println("Lista ordenada según orden natural (nombre)--------------");
        paises.forEach(System.out::println);
        Pais objetoBuscar = new Pais();
        objetoBuscar.setNombre("Portugal"); //Lista ordenada por nombre, busqueda por nombre, key es nombre
        int posicion = Collections.binarySearch(paises, objetoBuscar);
        System.out.println("Portugal está en la posición " + posicion);
        
        //si intento buscar en la lista con un valor que no es nombre se puede obtener
        //una posición erronea
        //si ordeno la lista por un criterio y busco por otro, el resultado es inesperado
        posicion = Collections.binarySearch(paises, objetoBuscar, criterioPoblacion);
        System.out.println(posicion);
        
        System.out.println("--------Ordenación y busqueda por población--------------");
        //antes de usar binarySearch por poblacion hay que ordenar la lista por poblacion
        Collections.sort(paises, criterioPoblacion);
        paises.forEach(System.out::println);
        objetoBuscar = new Pais();
        objetoBuscar.setPoblacion(146);
        posicion = Collections.binarySearch(paises, objetoBuscar, criterioPoblacion);
        
        System.out.println("El pais que tiene 146 millones de habitantes es " + paises.get(posicion));
        
        
        
    }
    
}
