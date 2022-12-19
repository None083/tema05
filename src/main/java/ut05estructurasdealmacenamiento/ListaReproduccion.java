/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut05estructurasdealmacenamiento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author FX506
 */
public class ListaReproduccion {
    
    private List<Cancion> lista;
    
    public ListaReproduccion() {
        this.lista = new ArrayList<>();
    }
    
    public int numeroCanciones() {
        return this.lista.size();
    }
    
    public boolean estaVacia() {
        return this.lista.isEmpty();
    }
    
    public Cancion escucharCancion(int posicion) {
        return this.lista.get(posicion);
    }
    
    public void cambiarCancion(Cancion c, int posicion) {
        this.lista.set(posicion, c);
    }
    
    public void grabarCancion(Cancion c) {
        this.lista.add(c);
    }
    
    public void eliminaCancion(int posicion) {
        this.lista.remove(posicion);
    }
    
    public void eliminaCancion(Cancion c) {
        this.lista.remove(c);
    }
    
    public static void imprimirLista(ListaReproduccion tmp) {
        String aux = "";
        for (Cancion c : tmp.lista) {
            aux += c.toString() + "\n";
        }
        System.out.println(aux);
    }
    
    public int buscarCancion(Cancion c) {
        return this.lista.indexOf(c);
    }
    
    public void ordenarPorCantante() {
        Collections.sort(this.lista, (Cancion c1, Cancion c2)
                -> c1.getAutor().compareTo(c2.getAutor()));
    }
    
    public void odenarPorTitulo() {
        Collections.sort(this.lista, (Cancion c1, Cancion c2)
                -> c1.getNombre().compareTo(c2.getNombre()));
    }
    
    public int busquedaBinaria(Cancion c){
        ordenarPorCantante();
        return Collections.binarySearch(this.lista, c, (Cancion c1, Cancion c2)
                -> c1.getAutor().compareTo(c2.getAutor()));
    }
    
}
