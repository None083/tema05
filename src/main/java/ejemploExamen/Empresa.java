/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploExamen;

import java.util.ArrayList;

/**
 *
 * @author FX506
 */
public class Empresa {

    private ArrayList<Trabajador> listaTrabajadores;
    private String nombre;
    private String cif;

    public Empresa(String nombre, String cif) {
        this.listaTrabajadores = new ArrayList<>();
        this.nombre = nombre;
        this.cif = cif;

    }

    public void imprimir() {
        System.out.println(this.nombre);
        System.out.println(this.cif);
        for (Trabajador t : listaTrabajadores) {
            System.out.println(t);
        }
    }

    public void contratar(Trabajador t) {
        this.listaTrabajadores.add(t);
    }

    public boolean despedir(Trabajador t) {
        for (int i = 0; i < listaTrabajadores.size(); i++) {
            if (listaTrabajadores.get(i).equals(t)) {
                this.listaTrabajadores.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Integer> buscarTodosNombre(String nombre) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < listaTrabajadores.size(); i++) {
            if (this.listaTrabajadores.get(i).getNombre().equalsIgnoreCase(nombre)) {
                array.add(i);
            }
        }
        if (array.isEmpty()) {
            return null;
        }
        return array;
    }

}
