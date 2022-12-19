/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarlistas;

import arrays.Vehiculo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author noelia
 */
public class CatalogoVehiculos {

    private List<Vehiculo> lista;

    public CatalogoVehiculos(int tamanio) {
        tamanio = Math.abs(tamanio);
        this.lista = new ArrayList<>(tamanio);
        for (int i = 0; i < tamanio; i++) {
            this.lista.add(new Vehiculo());
        }
    }

    @Override
    public String toString() {
        String tmp = "";
        for (Vehiculo v : this.lista) {
            tmp += v.toString() + "\n";
        }
        return tmp;
    }

    public int getNumeroVehiculos() {
        return this.lista.size();
    }

    public boolean borrarVehiculo(Vehiculo v) {
        int pos = buscarVehiculo(v);
        if (pos >= 0) {
            this.lista.remove(pos);
            return true;
        }
        return false;
    }

     public int buscarVehiculo(Vehiculo v) {
        for (int i = 0; i < this.lista.size(); i++) {
            if (v.equals(this.lista.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public void anadirVehiculo(Vehiculo v) {
        this.lista.add(v);
    }

    public Vehiculo buscarVehiculo(String bastidor) {
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor);
        int posicion = buscarVehiculo(aux);
        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }

}
