/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author andresrivas
 */
public class NodoArbol {
    private Cliente cliente;
    private NodoArbol rightSon,leftSon;

    // Constructor del nodo arbol que recibe como parametro un cliente
    public NodoArbol(Cliente cliente) {
        this.cliente = cliente;
        this.rightSon = this.leftSon = null;
    }
    
    // Funcion para revisar si es una hoja
    public boolean isLeaf(){
        return getLeftSon() == null && getRightSon() == null;
    }
    
    // Funcion para revisar que solo tiene hijo derecho
    public boolean hasOnlyRightSon(){
        return getLeftSon() == null && getRightSon() != null;
    }
    
    // Funcion para revisar que solo tiene hijp izquierdo
    public boolean hasOnlyLeftSon(){
        return getLeftSon() != null && getRightSon() == null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setElement(Cliente cliente) {
        this.cliente = cliente;
    }

    public NodoArbol getRightSon() {
        return rightSon;
    }

    public void setRightSon(NodoArbol rightSon) {
        this.rightSon = rightSon;
    }

    public NodoArbol getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(NodoArbol leftSon) {
        this.leftSon = leftSon;
    }
}
