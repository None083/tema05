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
 *
 *
 */
public class ordenacionBusquedaEstantería {

    public static void main(String[] args) {

        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("La vida es Dura", "Autodesayuda", "Desgraciado"));
        libros.add(new Libro("Pero más dura es la Verdura", "Cocina", "Arguiñano"));
        libros.add(new Libro("Cómo no comerse el pienso", "Filosofía", "Monty"));
        libros.add(new Libro("Aprobar Programación", "Fantasía", "Anónimo"));

        System.out.println("------------------Orden Natural-------------------");
        Collections.sort(libros);
        libros.forEach(System.out::println);
        
        System.out.println("------------------------------------------");
        Comparator<Libro> criterioCategoria = (l1,l2)->l1.getCategoría().compareToIgnoreCase(l2.getCategoría());
        Comparator<Libro> criterioAutor = (l1,l2)->l1.getAutor().compareToIgnoreCase(l2.getAutor());
        
        
    }
}
