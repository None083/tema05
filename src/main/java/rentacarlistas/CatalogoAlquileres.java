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
 *
 * @author noelia
 */
public class CatalogoAlquileres {

    private List<Alquiler> lista;

    public CatalogoAlquileres(int tamanio) {
        tamanio = Math.abs(tamanio);
        this.lista = new ArrayList<>(tamanio);
        for (int i = 0; i < tamanio; i++) {
            this.lista.add(new Alquiler());
        }
    }

    @Override
    public String toString() {
        String tmp = "";
        for (Alquiler v : this.lista) {
            tmp += v.toString() + "\n";
        }
        return tmp;
    }

    public int getNumeroAlquileres() {
        return this.lista.size();
    }

    public boolean borrarAlquiler(Alquiler a) {
        int pos = buscarAlquiler(a);
        if (pos >= 0) {
            this.lista.remove(pos);
            return true;
        }
        return false;
    }

    private int buscarAlquiler(Alquiler a) {
        if (a != null) {
            for (int i = 0; i < this.lista.size(); i++) {
                if (a.equals(this.lista.get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void anadirAlquiler(Alquiler a) {
        this.lista.add(a);
    }

    public Alquiler buscarAlquiler(int ID) {
        Alquiler aux = new Alquiler();
        aux.setAlquilerID(ID);
        int posicion = buscarAlquiler(aux);
        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }

}
