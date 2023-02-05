/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut05estructurasdealmacenamiento;

import java.util.ArrayList;

/**
 *
 * @author FX506
 * 
 * Implementa una Pila (Stack, en inglés) usando clases genéricas. 
 * Una pila es un almacén de datos en el que se sigue una política específica 
 * a la hora de introducir y sacar los elementos. Una pila sigue una política LIFO 
 * (Last In First Out), es decir, el último elemento en entrar (apilar) es 
 * el primero en salir (desapilar). La pila tiene un tamaño máximo, de forma que 
 * no se pueden guardar más elementos que los indicados en ese tamaño. 
 *
 * En este ejercicio se pide implementar una clase que modele el comportamiento 
 * de una pila, para cualquier tipo de objetos, mediante un ArrayList, 
 * ofreciendo la siguiente funcionalidad:
 *
 * 1.La pila siempre se creará vacía.
 * 
 * 2.apilar elemento (en inglés push), lo inserta donde proceda.
 * 
 * 3.desapilar (en inglés pop), que saca el elemento que toque.
 * 
 * 4.Saber si la pila está vacía.
 * 
 * 5.Saber si la pila está llena.
 * 
 * 6.Saber el número de elementos que contiene la pila.
 * 
 * 7.Mostrar por consola los elementos de la pila, según el orden en el que saldrían 
 * los elementos de la pila. Esta operación no debe alterar la estructura de datos.
 * 
 * 8.rellenar (T[] array), almacena en la pila los objetos que hay en el array. 
 * La pila se ajusta su tamaño según el número de elementos que tenga el array.
 * 
 * 9.T[] sacarElementos(), saca los elementos de la pila y los devuelve en un array de T. 
 * La pila, después de llamar a este método, queda vacía.
 *
 * 
 */
public class UT0526Pila {

    private ArrayList<Object> pila;
    private int tamanio = 5;

    public UT0526Pila() {
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
