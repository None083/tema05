/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacionbusqueda;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author noelia
 */
public class Libro implements Comparable<Libro>{
    
    private String nombre;
    private String ISBN;
    private String categoría;
    private String autor;
    private static int contador = 0;

    public Libro(String nombre, String categoría, String autor) {
        this.nombre = nombre;
        this.ISBN = String.valueOf(contador);
        this.categoría = categoría;
        this.autor = autor;
    }

    public Libro() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getCategoría() {
        return categoría;
    }

    public String getAutor() {
        return autor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", ISBN=" + ISBN + ", categor\u00eda=" + categoría + ", autor=" + autor + '}';
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.ISBN);
        hash = 59 * hash + Objects.hashCode(this.categoría);
        hash = 59 * hash + Objects.hashCode(this.autor);
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
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.ISBN, other.ISBN)) {
            return false;
        }
        if (!Objects.equals(this.categoría, other.categoría)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }


    @Override
    public int compareTo(Libro o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }
    
    

}