/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicionclases;

/**
 *
 * @author noelia
 */
public class Ventana {
    
    private boolean estado; //abierta o cerrada

    public Ventana(boolean estado) {
        this.estado = estado;
    }

    public boolean getEstado() {
        return estado;
    }

    public void abrir(){
        this.estado = true;
        
    }
    
    public void cerrar(){
        this.estado = false;
    }

    @Override
    public String toString() {
        return "Ventana{" + "estado=" + estado + '}';
    }
    
    
    
}
