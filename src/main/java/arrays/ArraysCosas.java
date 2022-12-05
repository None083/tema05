/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Arrays;

/**
 *
 * @author noelia
 */
public class ArraysCosas {

    /**
     * por aqui estan las respuestas del ut0504
     */
    public static void main(String[] args) {
        int numeros[] = {6, 5, 3, 1, 2};
        System.out.println(Arrays.toString(numeros));
        
        int posicion = Arrays.binarySearch(numeros, 6);
        System.out.println(posicion);
        
        Arrays.sort(numeros);
        System.out.println(numeros);
        
        posicion = Arrays.binarySearch(numeros, 6);
        System.out.println(posicion);
        
        int pos = busquedaSecuencial(numeros, 10);
        System.out.println("El 10 está en la posición" + pos);
        pos = busquedaSecuencial(numeros, 3);
        System.out.println("El 3 está en la posición" + pos);
        if(pos >= 0){
        System.out.println("El elemento de la posición" + pos + " es " + numeros[pos]);    
        }
        
    } 
    
    //posicion en el array donde se encuentra el elemento
    //si hay varios, devuelve la primera
    //si no existe devuelve -1
    public static int busquedaSecuencial(int[] array, int numeroBuscar){
        
        int indice = -1;
        //recorremos el array completo
        for (int i = 0; i < array.length; i++) {
            if(numeroBuscar == array[i]){ //lo he encontrado
                indice = i; //guarda la posición para devolverla
                break;
            }
        }
        
        return indice;
    }
            
            
    
    //to esta mierda es lo mismo que Arrays.sort(numeros);
            //ordenar
    public static void ordenarBurbuja(int[] numeros) {

        int tmp;
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j])  {
                    tmp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = tmp;
                }
            }
        }

    }

    
}
