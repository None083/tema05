/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut05estructurasdealmacenamiento;

/**
 *
 * @author FX506
 */
public class UT0515 {

    /**
     * Escribe una clase LanzarMoneda que tenga como único atributo un array de
     * booleanos de tamaño 1000. La clase tendrá los siguientes métodos: 
     * 
     * a. un método para rellenar el array, de forma que simule 1000 lanzamientos de
     * una moneda. El método debe almacenar el resultado de cada tirada en el array. 
     * 
     * b.un método para saber cuántas “caras” salieron después de los
     * lanzamientos.
     * 
     * c. un método para saber cuántas “cruces” salieron después
     * de los lanzamientos. 
     * 
     * d. un método para imprimir el resultado de los 1000
     * lanzamientos, de forma que aparezca el número de lanzamiento y el
     * resultado (cara o cruz)
     *
     */
    public static void main(String[] args) {
        
        LanzarMoneda lanzamiento = new LanzarMoneda();
        System.out.println("Numero de caras: " + lanzamiento.cuantasCaras());
        System.out.println("Numero de cruces: " + lanzamiento.cuantasCruces());
        lanzamiento.mostrarResultado();
        

    }

}
