/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut05estructurasdealmacenamiento;

import java.util.Random;

/**
 *
 * @author FX506
 */
public class LanzarMoneda {

    private boolean[] arrayBooleanos = new boolean[1000];

    public LanzarMoneda() {
        Random aleatorio = new Random();
        for (int i = 0; i < arrayBooleanos.length; i++) {
            arrayBooleanos[i] = aleatorio.nextBoolean();
        }
    }
    //True será cara, false será cruz

    public int cuantasCaras() {
        int numero = 0;
        for (int i = 0; i < arrayBooleanos.length; i++) {
            if (arrayBooleanos[i] == true) {
                numero++;
            }
        }
        return numero;
    }

    public int cuantasCruces() {
        int numero = 0;
        for (int i = 0; i < arrayBooleanos.length; i++) {
            if (arrayBooleanos[i] == false) {
                numero++;
            }
        }
        return numero;
    }

    public void mostrarResultado() {
        for (int i = 0; i < arrayBooleanos.length; i++) {
            if (arrayBooleanos[i] == true) {
                System.out.println("Lanzamiento nº " + (i + 1) + " : cara" );
            } else{
                System.out.println("Lanzamiento nº " + (i + 1) + " : cruz" );
            }

        }

    }

}
