/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploExamen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 *
 * @author FX506
 */
public class Trabajador implements Comparable <Trabajador>{

    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private CategoriaEmpleado categoria;
    private static int sueldoBase = 1707;

    public Trabajador(String nombre, String apellidos, LocalDate fechaNacimiento, CategoriaEmpleado categoria) {
        if (fechaNacimiento.plusYears(16).isBefore(LocalDate.now())) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.fechaNacimiento = fechaNacimiento;
            this.categoria = categoria;
        } else {
            throw new IllegalArgumentException("Edad no permitida");
        }
    }

    public Trabajador() {
    }
    
    public Trabajador(Trabajador t) {
        this.nombre = t.getNombre();
        this.apellidos = t.getApellidos();
        this.fechaNacimiento = t.getFechaNacimiento();
        this.categoria = t.getCategoria();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public CategoriaEmpleado getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEmpleado categoria) {
        this.categoria = categoria;
    }

    public double calcularSueldo() {
        return sueldoBase + this.categoria.getComplementoEuros();
    }

    public static LocalDate fechaJubilacion(Trabajador t) {
        return t.getFechaNacimiento().plusYears(66);
    }

    @Override
    public String toString() {
        return """
                    %s, %s      F.Nac: %s
               Categoría: %s
               FechaJuvilación: %s
               Sueldo actual: %s
               """.formatted(this.apellidos, this.nombre, this.fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/uuuu")),
                this.categoria.getNombreCategoria(), Trabajador.fechaJubilacion(this).format(DateTimeFormatter.ofPattern("EEEE dd 'de' MMMM 'de' uuuu")), this.calcularSueldo());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + Objects.hashCode(this.apellidos);
        hash = 17 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 17 * hash + Objects.hashCode(this.categoria);
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
        final Trabajador other = (Trabajador) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        return this.categoria == other.categoria;
    }

    @Override
    public int compareTo(Trabajador o) {
        return this.apellidos.compareToIgnoreCase(o.apellidos);
    }
    
    

}
