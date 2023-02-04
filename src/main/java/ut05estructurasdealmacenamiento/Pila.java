/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut05estructurasdealmacenamiento;

import java.util.ArrayList;

/**
 *
 * @author FX506
 */
public class Pila {

    private ArrayList<Object> pila;
    private int tamanio = 5;

    public Pila() {
        this.pila = new ArrayList<>();
    }

    private void apilar(Object o) {
        if(this.pila.size() < this.tamanio){
            this.pila.add(o);
        }
    }
    
    private void desapilar(){
        this.pila.remove(this.pila.size() - 1);
    }
    
    private boolean estaVacia(){
        return this.pila.isEmpty();
    }
    
    private boolean estaLlena(){
        return this.pila.size() >= this.tamanio;
    }
    
    private int numeroElementos(){
        return this.pila.size();
    }
    
    private void mostrarElementos(){
        for (int i = this.pila.size() - 1; i >= 0; i--) {
            System.out.println(this.pila.get(i));
        }
    }
    
    private void rellenar(Object[] array){
        for (int i = 0; i < array.length; i++) {
            this.pila.add(array[i]);
            this.tamanio = this.pila.size();
        }
    }

}
