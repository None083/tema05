/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarlistas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author noelia
 */
public class CatalogoClientes {

    private List<Cliente> lista;

    public CatalogoClientes(int tamanio) {
        tamanio = Math.abs(tamanio);
        this.lista = new ArrayList<>(tamanio);
        for (int i = 0; i < tamanio; i++) {
            this.lista.add(new Cliente());
        }
    }

    public String toString() {
        String tmp = "";
        for (Cliente c : this.lista) {
            tmp += c.toString() + "\n";
        }
        return tmp;
    }

    public int getNumeroClientes() {
        return this.lista.size();
    }

    public boolean borrarCliente(Cliente c) {
        int pos = buscarCliente(c);
        if (pos >= 0) {
            this.lista.remove(pos);
            return true;
        }
        return false;
    }

    private int buscarCliente(Cliente c) {
            for (int i = 0; i < this.lista.size(); i++) {
                if (c.equals(this.lista.get(i))) {
                    return i;
                }
            }
        return -1;
    }

    public void anadirCliente(Cliente c) {
        this.lista.add(c);
    }

    public Cliente buscarCliente(String nif) {
        Cliente aux = new Cliente();
        aux.setNIF(nif);
        int posicion = buscarCliente(aux);
        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }
    
}
