/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarlistas;

/**
 *
 * @author noelia
 */
public class CatalogoClienteHerencia extends Catalogo<Cliente>{
    
    public CatalogoClienteHerencia(int tamanio) {
        super(tamanio);
        for (int i = 0; i < tamanio; i++) {
            this.anadirElemento(new Cliente());
        }
    }
    
    public Cliente buscarCliente(String nif) {
        Cliente aux = new Cliente();
        aux.setNIF(nif);
        int posicion = this.buscarElemento(aux);
        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }
    
}
