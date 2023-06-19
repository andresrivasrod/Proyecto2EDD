/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author andresrivas
 */
public class Habitacion {
    
    private NodoHabitacion first;
    private NodoHabitacion last;
    private int tamaño;

    public Habitacion() {
        this.first = this.last = null;
        this.tamaño = 0;
    }
    
    public boolean estaVacio() {//Verificar si la lista está vacía
        return (first == null);
    }
    
    public void agregarAlInicio(NodoHabitacion habitacion) {//Método par insertar un elemento al inicio
        NodoHabitacion nuevo = new NodoHabitacion(habitacion.getNumero(), habitacion.getTipo(), habitacion.getPiso());
        if (estaVacio()) {
            first = nuevo;
            last = nuevo;
        } else {
            nuevo.setSiguiente(first);
            first = nuevo;
        }
        tamaño++;

    }

    public NodoHabitacion getFirst() {
        return first;
    }

    public void setFirst(NodoHabitacion first) {
        this.first = first;
    }

    public NodoHabitacion getLast() {
        return last;
    }

    public void setLast(NodoHabitacion last) {
        this.last = last;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    
    
}
