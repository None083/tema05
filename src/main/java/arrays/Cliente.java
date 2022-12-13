/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author noelia
 */
public class Cliente {

    private String nombre;
    private String NIF;
    private String apellido;

    public Cliente() {
    }
    
    

    public Cliente(String nombre, String apellido) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.NIF = RandomStringUtils.randomNumeric(8) + " "
                + RandomStringUtils.random(1, "T, R, W, A, G, M, Y, F, "
                        + "P, D, X, B, N, J, Z, S, Q, V, H, L, C, K, E");

    }

    public String getNombre() {
        return nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
    
    

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", NIF=" + NIF + ", apellido=" + apellido + '}';
    }
    
    

}
