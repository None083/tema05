/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut05estructurasdealmacenamiento;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author FX506
 */
public class UT0523 {

    /**
     * Se desea manejar dos listas (ArrayList) de Integer. La cantidad de
     * elementos de la lista 1 debe ser un número aleatorio entre 5 y 15. La
     * cantidad de elementos de la lista 2 debe ser un número aleatorio entre 10
     * y 20. El rango de los números que serán agregados a la lista DEBE estar
     * entre 50 y 100. Se pide construir una aplicación en Java que permita
     * cumplir con la siguiente funcionalidad: 
     * 
     * Imprimir las listas que han sido generadas. Usa for-each. 
     * 
     * Crear una tercera lista que contenga los elementos que están en la lista 1 
     * y NO ESTÁN en la lista 2 
     * 
     * Imprimir la tercera lista. 
     * 
     * Crear una cuarta lista que contenga los elementos de la
     * lista 1 que son pares y los elementos de la lista 2 que son impares
     * 
     * Imprimir la cuarta lista. Usa una expresión lambda.
     *
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> lista1 = new ArrayList<>();
        Random aleatorio = new Random();
        int tamanio = aleatorio.nextInt(15-5+1)+5;
        for (int i = 0; i < tamanio; i++) {
            lista1.add(aleatorio.nextInt(100-50+1)+50);
        }
        ArrayList<Integer> lista2 = new ArrayList<>();
        tamanio = aleatorio.nextInt(20-10+1)+10;
        for (int i = 0; i < tamanio; i++) {
            lista2.add(aleatorio.nextInt(100-50+1)+50);
        }
        
        for (Integer num : lista1) {
            System.out.print(" - " + num);
        }
        System.out.println("");
        for (Integer num : lista2) {
            System.out.print(" - " + num);
        }
        
        ArrayList<Integer> lista3 = new ArrayList<>();
        for (int i = 0; i < lista1.size(); i++) {
            if(!lista2.contains(lista1.get(i))){
                lista3.add(lista1.get(i));
            }
        }
        System.out.println("");
        for (Integer num : lista3) {
            System.out.print(" - " + num);
        }
        
        ArrayList<Integer> lista4 = new ArrayList<>();
        for (int i = 0; i < lista1.size(); i++) {
            if(lista1.get(i) % 2 == 0){
                lista4.add(lista1.get(i));
            }
        }
        
        for (int i = 0; i < lista2.size(); i++) {
            if(lista2.get(i) % 2 == 1){
                lista4.add(lista2.get(i));
            }
        }
        System.out.println("");
        lista4.forEach(aux->System.out.print(" - " + aux));
    }

}
