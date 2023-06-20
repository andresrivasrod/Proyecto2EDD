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
    
    // Funcion para insertar un cliente en el arbol usando como parametro para ordenarlo sus fechas de llegada
    public void insertar(Cliente cliente, NodoArbol raiz) {
        NodoArbol node = new NodoArbol(cliente);
        if (estaVacio()) {
            setRaiz(node);
        } else {
            int dia = Integer.parseInt(cliente.getLlegada().substring(0, 2));  //Obtenemos los dia, mes y año de llegada del cliente a ingresar y de la raiz
            int mes = Integer.parseInt(cliente.getLlegada().substring(3, 5));
            int año = Integer.parseInt(cliente.getLlegada().substring(6, 10));
            int diaRaiz = Integer.parseInt(raiz.getCliente().getLlegada().substring(0, 2));
            int mesRaiz = Integer.parseInt(raiz.getCliente().getLlegada().substring(3, 5));
            int añoRaiz = Integer.parseInt(raiz.getCliente().getLlegada().substring(6, 10));
            if (año < añoRaiz
                    || (año == añoRaiz && mes < mesRaiz)
                    || (año == añoRaiz && mes == mesRaiz && dia < diaRaiz)) {
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

    public String inOrden(NodoArbol raiz) {
        return inOrdenRecursivo(raiz, "");
    }

    private String inOrdenRecursivo(NodoArbol raiz, String resultado) {
        if (raiz != null) {
            resultado = inOrdenRecursivo(raiz.getLeftSon(), resultado);
            resultado += raiz.getCliente().getCedula() + ", " + raiz.getCliente().getNombre() + ", " + raiz.getCliente().getApellido() + ", " + raiz.getCliente().getCorreo() + ", " + raiz.getCliente().getGenero() + ", " + raiz.getCliente().getLlegada() + "\n";
            resultado = inOrdenRecursivo(raiz.getRightSon(), resultado);
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
