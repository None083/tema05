/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploExamen;

import java.time.LocalDate;

/**
 *
 * @author FX506
 */
public class Prueba {

    public static void main(String[] args) {

        Empresa empresaA = new Empresa("Olivitas", "0000000001UWU");
        Empresa empresaB = new Empresa("TulipArt", "0000000002UWU");

        Trabajador t1 = new Trabajador("None", "Kawa", LocalDate.of(1992, 9, 8), CategoriaEmpleado.INICIAL);
        Trabajador t2 = new Trabajador("Galletín", "Galleto", LocalDate.of(2000, 10, 5), CategoriaEmpleado.INICIAL);
        Trabajador t3 = new Trabajador("Obi-wan", "Kenobi", LocalDate.of(57, 1, 1), CategoriaEmpleado.INICIAL);
        Trabajador t4 = new Trabajador("Monty", "Monty", LocalDate.of(2002, 4, 8), CategoriaEmpleado.INICIAL);
        Trabajador t5 = new Trabajador("Canela", "A.C.", LocalDate.of(2004, 12, 20), CategoriaEmpleado.INICIAL);

        Trabajador t6 = new Trabajador(t3);

        empresaA.contratar(t1);
        empresaA.contratar(t2);
        empresaA.contratar(t3);
        empresaB.contratar(t4);
        empresaB.contratar(t5);
        empresaB.contratar(t6);

        System.out.println("-------------Empresa A-------------");
        empresaA.imprimir();
        System.out.println("-------------Empresa B-------------");
        empresaB.imprimir();

        empresaB.despedir(t5);
        empresaA.contratar(t5);

        empresaA.ordenarNombre();
        empresaB.ordenarNombre();

        System.out.println("-------------Empresa A ordenada-------------");
        empresaA.imprimir();
        System.out.println("-------------Empresa B ordenada-------------");
        empresaB.imprimir();
        
        System.out.println(empresaA.buscarNombre(t3));

    }

}
