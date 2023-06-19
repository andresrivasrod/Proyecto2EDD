/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author andresrivas
 */
public class Cliente {
    private int cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String genero;
    private String tipoHabitacion;
    private String celular;
    private String llegada;
    private String salida;
    private int numeroHabitacion;
    private boolean reservacion;
    private boolean estado;
    private boolean historico;
    private Cliente siguiente;
    
    //Constructor para un cliente de la hoja de reservacion
    public Cliente(int cedula, String nombre, String apellido, String correo, String genero, String tipoHabitacion, String celular, String llegada, String salida) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.genero = genero;
        this.tipoHabitacion = tipoHabitacion;
        this.celular = celular;
        this.llegada = llegada;
        this.salida = salida;    
        this.reservacion = true;
        this.estado = false;
        this.historico = false;
        this.siguiente = null;
    }
    //Constructor para un cliente de la hoja de estado
    public Cliente(int numeroHabitacion, String nombre, String apellido, String correo, String genero, String celular, String llegada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.genero = genero;
        this.celular = celular;
        this.llegada = llegada;
        this.numeroHabitacion = numeroHabitacion;
        this.reservacion = false;
        this.estado = true;
        this.historico = false;
        this.siguiente = null;
    }
    //Constructor para un cliente de la hoja de historico
    public Cliente(int cedula, String nombre, String apellido, String correo, String genero, String llegada, int numeroHabitacion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.genero = genero;
        this.llegada = llegada;
        this.numeroHabitacion = numeroHabitacion;
        this.reservacion = false;
        this.estado = false;
        this.historico = true;
        this.siguiente = null;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public boolean isReservacion() {
        return reservacion;
    }

    public void setReservacion(boolean reservacion) {
        this.reservacion = reservacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isHistorico() {
        return historico;
    }

    public void setHistorico(boolean historico) {
        this.historico = historico;
    }

    public Cliente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Cliente siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
