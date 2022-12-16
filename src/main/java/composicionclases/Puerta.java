/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicionclases;

/**
 *
 * @author noelia
 */
public class Puerta {
    
    private Ventana ventana;
    private boolean estado;

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    public boolean isEstado() {
        return estado;
    }

    public void abrir(){
        this.estado = true;
        
    }
    
    public void cerrar(){
        this.estado = false;
    }

    public Puerta(Ventana ventana, boolean estado) {
        this.ventana = ventana;
        this.estado = estado;
    }
    
}
