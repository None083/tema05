/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * clase empresa cif nombre tiene catalogo vehiculos, catalogo clientes,
 * catalogo alquileres
 *
 * metodos---- registrar cliente, registrar vehiculos, buscar un cliente a
 * partir del nif buscar vehiculo a partir del bastidor
 *
 * to string tocho con cif, nombre y los catalogos
 *
 * @author noelia
 */
public class Empresa {

    private String nombre;
    private String cif;
    private static int contador = 0;
    private CatalogoVehiculos catalogoVehiculo;
    private CatalogoClientes catalogoCliente;
    private CatalogoAlquileres catalogoAlquiler;

    public Empresa() {
        this.nombre = RandomStringUtils.randomAlphabetic(6);
        contador++;
        this.cif = String.valueOf(contador);
        this.catalogoVehiculo = new CatalogoVehiculos(10);
        this.catalogoCliente = new CatalogoClientes(10);
        this.catalogoAlquiler = new CatalogoAlquileres(10);
    }

    public Empresa(String nombre) {
        this.nombre = nombre;
        contador++;
        this.cif = String.valueOf(contador);
        this.catalogoVehiculo = new CatalogoVehiculos(10);
        this.catalogoCliente = new CatalogoClientes(10);
        this.catalogoAlquiler = new CatalogoAlquileres(10);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Empresa.contador = contador;
    }

    public CatalogoVehiculos getCatalogoVehiculo() {
        return catalogoVehiculo;
    }

    public void setCatalogoVehiculo(CatalogoVehiculos catalogoVehiculo) {
        this.catalogoVehiculo = catalogoVehiculo;
    }

    public CatalogoClientes getCatalogoCliente() {
        return catalogoCliente;
    }

    public void setCatalogoCliente(CatalogoClientes catalogoCliente) {
        this.catalogoCliente = catalogoCliente;
    }

    public CatalogoAlquileres getCatalogoAlquiler() {
        return catalogoAlquiler;
    }

    public void setCatalogoAlquiler(CatalogoAlquileres catalogoAlquiler) {
        this.catalogoAlquiler = catalogoAlquiler;
    }

    public void registrarCliente(Cliente c) {
        this.catalogoCliente.anadirCliente(c);
    }

    public void registrarVehiculo(Vehiculo v) {
        this.catalogoVehiculo.anadirVehiculo(v);
    }

    public Cliente buscarCliente(String nif) {
        return this.catalogoCliente.buscarCliente(nif);
    }

    public Vehiculo buscarVehiculo(String bastidor){
        return this.catalogoVehiculo.buscarVehiculo(bastidor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa{");
        sb.append("nombre=").append(nombre);
        sb.append(", cif=").append(cif);
        sb.append(", catalogoVehiculo=").append(catalogoVehiculo);
        sb.append(", catalogoCliente=").append(catalogoCliente);
        sb.append(", catalogoAlquiler=").append(catalogoAlquiler);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.cif);
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
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.cif, other.cif);
    }
    
    
    
}
