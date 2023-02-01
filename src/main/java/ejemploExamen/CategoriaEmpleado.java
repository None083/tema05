/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejemploExamen;

/**
 *
 * @author FX506
 */
public enum CategoriaEmpleado {
    
    INICIAL("Categoría Básica", 50), 
    MEDIA("Categoría Media", 70), 
    AVANZADA("Categoría AProfesional", 100);
    
    private String nombreCategoria;
    private Integer complementoEuros;

    private CategoriaEmpleado(String nombreCategoria, Integer complementoEuros) {
        this.nombreCategoria = nombreCategoria;
        this.complementoEuros = complementoEuros;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public Integer getComplementoEuros() {
        return complementoEuros;
    }

    
}
