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
    
    public String preOrden(NodoArbol raiz) {
        return preordenRecursivo(raiz, "");
    }
    
    private String preordenRecursivo(NodoArbol raiz, String resultado) {
        if (raiz != null) {
            resultado += raiz.getCliente().getCedula() +", "+ raiz.getCliente().getNombre() +", "+ raiz.getCliente().getApellido()+", "+ raiz.getCliente().getCorreo()+", "+ raiz.getCliente().getGenero()+", "+ raiz.getCliente().getLlegada() + "\n";
            resultado = preordenRecursivo(raiz.getLeftSon(), resultado);
            resultado = preordenRecursivo(raiz.getRightSon(), resultado);
        }
        return resultado;
    }

    public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }

    
}
