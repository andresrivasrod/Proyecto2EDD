/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author andresrivas
 */
public class ArbolBinarioBusqueda {
    
    private NodoArbol raiz;

    public ArbolBinarioBusqueda() {
        this.raiz = null;
    }
    
    public boolean estaVacio() {
        return getRaiz() == null;
    }
    
    public void insertar(Cliente cliente, NodoArbol raiz) {
        NodoArbol node = new NodoArbol(cliente);
        if (estaVacio()) {
            setRaiz(node);
        } else {
            if (cliente.getCedula() < raiz.getCliente().getCedula()) {
                if (raiz.getLeftSon() == null) {
                    raiz.setLeftSon(node);
                } else {
                    insertar(cliente, raiz.getLeftSon());
                }
            } else {
                if (raiz.getRightSon() == null) {
                    raiz.setRightSon(node);
                } else {
                    insertar(cliente, raiz.getRightSon());
                }
            }
        }
    }
    
    public void preOrden(NodoArbol raiz) {
        if (raiz != null) {
            System.out.println(raiz.getCliente().getCedula() +", "+ raiz.getCliente().getNombre() +", "+ raiz.getCliente().getApellido()+", "+ raiz.getCliente().getCorreo()+", "+ raiz.getCliente().getGenero()+", "+ raiz.getCliente().getLlegada()+", "+ raiz.getCliente().getNumeroHabitacion());
            preOrden(raiz.getLeftSon());
            preOrden(raiz.getRightSon());
        }
    }

    public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }

    
}
