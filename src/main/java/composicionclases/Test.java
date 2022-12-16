/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composicionclases;

/**
 *
 * @author noelia
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rueda di = new Rueda(225, "Michelín");
        Rueda dd = new Rueda(225, "Michelín");
        Rueda ti = new Rueda(225, "Michelín Low Cost");
        Rueda td = new Rueda(225, "Michelín Low Cost");
        
        Ventana ventanaPiloto = new Ventana(false);
        Ventana ventanaCopiloto = new Ventana(false);
        Puerta piloto = new Puerta(ventanaPiloto, false);
        Puerta copiloto = new Puerta(ventanaCopiloto, false);
        
        Motor motor = new Motor(95, false);
        
        Coche coche1 = new Coche(dd, di, 
                td, ti, motor, piloto, 
                copiloto, "1234yy");
        
        System.out.println("coche1");
        coche1.getPuertaPiloto().getVentana().abrir();
        
        Puerta p = coche1.getPuertaPiloto();
        Ventana v = coche1.getPuertaPiloto().getVentana();
    }
    
}
