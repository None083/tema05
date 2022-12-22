/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author noelia
 */
public class Ordenadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        List<Ordenador> lista = new ArrayList<>();
        
        lista.add(new Ordenador());
        
        System.out.println("Lista original ---------------------------");
        lista.forEach(System.out::println);
        
        
        System.out.println("Ordenación por ID --------------------------");
        
        
    }
    
}
