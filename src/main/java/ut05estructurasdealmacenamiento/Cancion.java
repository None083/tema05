/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut05estructurasdealmacenamiento;

import java.util.Objects;

/**
 *
 * @author FX506
 */
public class Cancion {

    private double duracion;
    private String nombre;
    private String genero;
    private String autor;

    public Cancion() {
        this.duracion = 2.55;
        this.nombre = "Under the radar";
        this.genero = "Rock Indie";
        this.autor = "Foals";
    }

    public Cancion(double duracion, String nombre, String genero, String autor) {
        this.duracion = duracion;
        this.nombre = nombre;
        this.genero = genero;
        this.autor = autor;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Cancion{" + "duracion=" + duracion + ", nombre=" + nombre + ", genero=" + genero + ", autor=" + autor + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + Objects.hashCode(this.autor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cancion other = (Cancion) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }

    public int compareTo(String anotherString) {
        return nombre.compareTo(anotherString);
    }

    
    
}
