/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author andresrivas
 */
public class ListaClientes {
    private Cliente first;
    private Cliente last;
    private int tamaño;

    public ListaClientes() {
        this.first = this.last = null;
        this.tamaño = 0;
    }
    
    public boolean estaVacio() {//Verificar si la lista está vacía
        return (first == null);
    }
    
    // Ingresa un cliente que pertenece a Reservacion
    public void insertarReservacion(Cliente cliente) {//Método par insertar un elemento al inicio
        Cliente nuevo = new Cliente(cliente.getCedula(), cliente.getNombre(), cliente.getApellido(), cliente.getCorreo(), cliente.getGenero(), cliente.getTipoHabitacion(), cliente.getCelular(), cliente.getLlegada(), cliente.getSalida());
        if (estaVacio()) {
            first = nuevo;
            last = nuevo;
        } else {
            nuevo.setSiguiente(first);
            first = nuevo;
        }
        tamaño++;
    }
    
    // Ingresa un cliente que pertenece a Estado
    public void insertarEstado(Cliente cliente) {//Método par insertar un elemento al inicio
        Cliente nuevo = new Cliente(cliente.getNumeroHabitacion(), cliente.getNombre(), cliente.getApellido(), cliente.getCorreo(), cliente.getGenero(),  cliente.getCelular(), cliente.getLlegada());
        if (estaVacio()) {
            first = nuevo;
            last = nuevo;
        } else {
            nuevo.setSiguiente(first);
            first = nuevo;
        }
        tamaño++;
    }
    
    // Ingresa un cliente que pertenece a Historico
    public void insertarHistorico(Cliente cliente) {//Método par insertar un elemento al inicio
        Cliente nuevo = new Cliente(cliente.getCedula(), cliente.getNombre(), cliente.getApellido(), cliente.getCorreo(), cliente.getGenero(), cliente.getLlegada(), cliente.getNumeroHabitacion());
        if (estaVacio()) {
            first = nuevo;
            last = nuevo;
        } else {
            nuevo.setSiguiente(first);
            first = nuevo;
        }
        tamaño++;
    }

    public Cliente getFirst() {
        return first;
    }

    public void setFirst(Cliente first) {
        this.first = first;
    }

    public Cliente getLast() {
        return last;
    }

    public void setLast(Cliente last) {
        this.last = last;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    
}
