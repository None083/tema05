/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author noelia
 */
public class Arrays1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicialización con valores
        // numeros [0] = 1, numeros[1] = 2, numeros[2] = 3...
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        System.out.println("Elemento indice 5: " + numeros[5]);
        // Puedo recorrer cualquier elemento dentro del rango 0 y numeros.lenght -1
        //System.out.println("Elemento indice -1: " + numeros[12]);
        System.out.println("Tamaño del array numeros: " + numeros.length);

        // Imprimimos todos los elementos del array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" - " + numeros[i]);
        }
        System.out.println("\n------------------");
        //foreach (izquierda recibe el dato en cuestion, derecha estructura de datos)
        for(int aux:numeros){
            System.out.print(" - " + aux);
        }
        
        numeros[5] = 90;
        System.out.println(" ");
        // Imprimimos todos los elementos del array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" - " + numeros[i]);
        }

    }

}
