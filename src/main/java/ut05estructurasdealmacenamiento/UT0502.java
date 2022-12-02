/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut05estructurasdealmacenamiento;

import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class UT0502 {

    /**
     *
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numeroPersonas = 0;
        while (numeroPersonas <= 0) {
            System.out.println("Introduce un número de personas");
            numeroPersonas = teclado.nextInt();
        }

        int[] alturas = new int[numeroPersonas];
        int sumaAlturas = 0;
        for (int i = 0; i < alturas.length; i++) {
            System.out.println("Introduce la altura de la persona " + (i + 1));
            alturas[i] = Math.abs(teclado.nextInt());
            sumaAlturas += alturas[i];
        }

        int media = sumaAlturas / alturas.length;
        System.out.println("La media es: " + media);

        int menorMedia = 0;
        int mayorMedia = 0;
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] < media) {
                menorMedia++;
            } else {
                mayorMedia++;
            }

        }

        System.out.println("Personas por debajo de la media: " + menorMedia);
        System.out.println("Personas por encima de la media: " + mayorMedia);
    }

    //metodo que devuelve los qu están por encima
    //public static int estaPorEncimaDeLaMedia (int[] aux, int media){
    //int contador = 0;
    //if(int i = 0; i< aux.lenght; i++){
    //  if(aux[i]>media){
    //    contador++;
    //  }
    // }
    //return contador;
    //}
    //metodo que devuelve los qu están por debajo
    //public static int estaPorDebajoDeLaMedia (int[] aux, int media){
    //int contador = 0;
    //for (int altura : aux){
    //  if(altura < media){
    //    contador++;
    //  }
    // }
    //return contador;
    //}
    //public satatic int[] media (int[] origen, int media){
    // int[] aux = new int[2];
    // aux[0] = estaPorEncimaDeLaMedia(origen, media);
    // aux[1] = estaPorDebajoDeLaMedia(origen, media);
    // return aux;
    //} hay otra manera más eficiente
}
