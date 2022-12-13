/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Arrays;

/**
 * crear metodo copiar privado, supongo que en el de los vehiculos
 *
 * @author noelia
 */
public class CatalogoClientes {

    private int numeroClientes;
    private Cliente[] listaClientes;

    private CatalogoClientes(int tamanio) {
        
        tamanio = Math.abs(tamanio);
        this.numeroClientes = tamanio;
        this.listaClientes = new Cliente[tamanio];

        for (int i = 0; i < listaClientes.length; i++) {
            this.listaClientes[i] = new Cliente();
        }

    }
    
    public void mostrarCatalogo(){
        for(Cliente c : listaClientes){
            System.out.println(c);
        }
    }
    
    public String toString(){
      String tmp = "";
        for (int i = 0; i < listaClientes.length; i++) {
            tmp+= listaClientes[i].toString() + "\n";
        }
        return tmp;
    }

    public int getNumeroClientes() {
        return numeroClientes;
    }
    
    public boolean borrarCliente(Cliente c){
        int pos = buscarCliente(c);
        if (pos >= 0) {
            this.listaClientes[pos] = null;
            this.numeroClientes--;
            return true;
        }
        return false;
    }
    
    public Cliente copiarCliente(Cliente c){
        Cliente copia = new Cliente();
        copia.setNombre(c.getNombre());
        copia.setApellido(c.getApellido());
        copia.setNIF(c.getNIF());
        return copia;
    }
    
     public int buscarCliente(Cliente c){
        for (int i = 0; i < this.listaClientes.length; i++) {
            if (c.equals(this.listaClientes[i])) {
                return i;
            }
        }
        return -1;
    }
     
     public void anadirCliente(Cliente c){
        if (this.numeroClientes < this.listaClientes.length){
            for (int i = 0; i < this.listaClientes.length; i++) {
                if(this.listaClientes[i] == null){
                    this.listaClientes[i] = c;
                    this.numeroClientes++;
                    System.out.println("Guardando cliente en posición " + i);
                    break;
                }
            }
        } else{
            this.listaClientes = Arrays.copyOf(listaClientes, ++this.numeroClientes);
            this.listaClientes[this.numeroClientes-1] = c;
        }
    }
    
}
