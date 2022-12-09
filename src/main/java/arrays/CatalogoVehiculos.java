/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author noelia
 */
public class CatalogoVehiculos {
    
    private int numeroVehiculos;
    private Vehiculo[] listaVehiculos;
    
    //el constructor recibe el tamaño del catalogo e
    //inicializa la estructura de datos con vehiculos aleatorios
    public CatalogoVehiculos(int tamanio){
        tamanio = Math.abs(tamanio);
        this.numeroVehiculos = tamanio;
        this.listaVehiculos = new Vehiculo[tamanio];
        //una vez creada la estructura de fdatos le doy
        //valor a cada elemento
        for (int i = 0; i < listaVehiculos.length; i++) {
            this.listaVehiculos[i] = new Vehiculo();
        }
    }
    
    public void mostrarCatalogo(){
        for(Vehiculo v : listaVehiculos){
            System.out.println(v);
        }
    }

    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }
    
    public void borrarVehiculo(Vehiculo v){
        int pos = buscarVehiculo(v);
        if (pos >= 0) {
            this.listaVehiculos[pos] = null;
        }
    }
    
    public int buscarVehiculo(Vehiculo v){
        for (int i = 0; i < this.listaVehiculos.length; i++) {
            if (v.equals(this.listaVehiculos[i])) {
                return i;
            }
        }
        return -1;
    }

    public Vehiculo[] getListaVehiculos() {
        return listaVehiculos;
    }
    
    
    
}
