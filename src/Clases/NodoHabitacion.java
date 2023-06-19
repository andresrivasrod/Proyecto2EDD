/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author andresrivas
 */
public class NodoHabitacion {
    private int numero;
    private String tipo;
    private int piso;
    private NodoHabitacion siguiente;

    public NodoHabitacion(int numero, String tipo, int piso) {
        this.numero = numero;
        this.tipo = tipo;
        this.piso = piso;
        this.siguiente = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public NodoHabitacion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoHabitacion siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
