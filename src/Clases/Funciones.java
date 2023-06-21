/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;
import javax.swing.JOptionPane;

/**
 *
 * @author andrespaz
 */
public class Funciones {
    /*
    public String leerHabitacionesCSV(){
        ManejoDeArchivos archivo = new ManejoDeArchivos();
        String habitaciones = archivo.leerCSV("//Users//andres//Desktop//Proyecto2EDD//habitaciones.csv");
        return habitaciones;
    }
    
    public String leerEstadoCSV(){
        ManejoDeArchivos archivo = new ManejoDeArchivos();
        String estado = archivo.leerCSV("//Users//andres//Desktop//Proyecto2EDD//estado.csv");
        
        return estado;
    }
    
    public String leerHistoricoCSV(){
        ManejoDeArchivos archivo = new ManejoDeArchivos();
        String historico = archivo.leerCSV("//Users//andres//Desktop//Proyecto2EDD//historico.csv");
        return historico;
    }
    
    public String leerReservasCSV(){
        ManejoDeArchivos archivo = new ManejoDeArchivos();
        String reservas = archivo.leerCSV("//Users//andres//Desktop//Proyecto2EDD//reservas.csv");
        return reservas;   
    }
    
    public void escribirEstado(String estado){
        File Old_File=new File("src//file//estado.csv");
        Old_File.delete();
        File New_File=new File("src//file//estado.csv");

        try {
            try (FileWriter b = new FileWriter(New_File, false)) {
                b.write(estado);
            }
        } catch (IOException e) {
        }
        
    }
    public void escribirHistorico(String historico){
        File Old_File=new File("src//file//historico.csv");
        Old_File.delete();
        File New_File=new File("src//file//historico.csv");

        try {
            try (FileWriter b = new FileWriter(New_File, false)) {
                b.write(historico);
            }
        } catch (IOException e) {
        }
        
    }
    public void escribirHabitaciones(String habitaciones){
        File Old_File=new File("src//file//habitaciones.csv");
        Old_File.delete();
        File New_File=new File("src//file//habitaciones.csv");

        try {
            try (FileWriter b = new FileWriter(New_File, false)) {
                b.write(habitaciones);
            }
        } catch (IOException e) {
        }
        
    }
    
    public void escribirReservas(String reservas){
        File Old_File=new File("src//file//reservas.csv");
        Old_File.delete();
        File New_File=new File("src//file//reservas.csv");

        try {
            try (FileWriter b = new FileWriter(New_File, false)) {
                b.write(reservas);
            }
        } catch (IOException e) {
        }
        
    }
    
    public void iniciar(){
        escribirReservas(leerReservasCSV());
        escribirHabitaciones(leerHabitacionesCSV());
        escribirEstado(leerEstadoCSV());
        escribirHistorico(leerHistoricoCSV());
    }
*/
    
    public String leer(String direccion){
        String text = "";

        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String a = "";
            String bfRead;
            int option = 0;
            while ((bfRead = bf.readLine()) != null) {
                
                if (bfRead.equalsIgnoreCase("")) {
                    option = 1;
                    a = a + bfRead+"\n";
                    
                }else if(option ==0){
                    a = a + bfRead + "\n";
                }else{
                    a = a + bfRead + "\n";
                }
            }
            text = a;
        } catch (IOException e) {
            text = "";
            JOptionPane.showMessageDialog(null, "Error al leer el archivo");

        }
        return text;
    }
    
    public Hashtable crearHashTableEstado(){
        String direccion = "src//file//estado.csv";
        String text = leer(direccion);
        String[] text1 = text.split("\n");
        Hashtable<String,String> hashTableEstado = new Hashtable<>();
        for (int i = 0; i < text1.length; i++) {
            String[] text2 = text1[i].split(";");
            hashTableEstado.put(text2[1] + " " + text2[2], text2[0]);
                
            }
            
        
        
        return hashTableEstado;
    }
    
    public void conseguirHabitacion(String nombre, String apellido){
        Hashtable hash = crearHashTableEstado();
        String a = nombre + " " + apellido;
        if (hash.get(a) == ""){
            JOptionPane.showMessageDialog(null, "La habitacion aun no ha sido entregada al usuario");
        }
        else if(hash.get(a)== null){
            JOptionPane.showMessageDialog(null, "El usuario no se encuentra registrado en el hotel");
        }
        else{
            JOptionPane.showMessageDialog(null, "La habitacion en donde se hospeda el huesped " + nombre + " " + apellido + " es la numero " + hash.get(a));
        }
    }
  
    public void buscarReservas(int cedula){
        String ci = String.valueOf(cedula);
        String direccion = "src//file//reservas.csv";
        String text = leer(direccion);
        String[] text1 = text.split("\n");
        
        for (int i = 1; i < text1.length; i++) {
            String[] text2 = text1[i].split(";");
            String texto = text2[0].replace(".", "");
            if(texto.contains(ci)){
                JOptionPane.showMessageDialog(null, "La reserva esta a nombre de " + text2[1] + " " + text2[2] + " titular de la cedula de identidad " + text2[0] + " y es una habitacion " + text2[5] + " e ingresara en la fecha " + text2[7] + " y su reserva terminara en la fecha " + text2[8]);
                break;
            }
            
        }
          
    }
    
    public void checkIn(int cedula){
        String ci = String.valueOf(cedula);
        String direccion = "src//file//reservas.csv";
        String text = leer(direccion);
        String[] text1 = text.split("\n");
        
        for (int i = 1; i < text1.length; i++) {
            String[] text2 = text1[i].split(";");
            String texto = text2[0].replace(".", "");
            if(texto.contains(ci)){
                String habitacion = asignarHabitacion(text2[5]);
                JOptionPane.showMessageDialog(null, "La reserva esta a nombre de " + text2[1] + " " + text2[2] + " titular de la cedula de identidad " + text2[0] + " y es una habitacion " + text2[5] + " e ingresara en la fecha " + text2[7] + " y su reserva terminara en la fecha " + text2[8]);
                break;
            }
                
            }
        
    }
    
    public String asignarHabitacion(String tipoHabitacion){
        String direccion = "src//file//estado.csv";
        String text = leer(direccion);
        String[] text1 = text.split("\n");
        String simple = "";
        String doble = "";
        String triple = "";
        String suite = "";
        for (int i = 1; i < 102; i++) {
            String[] text2= text1[i].split(";");
            if("".equals(text2[0])){
                String a = String.valueOf(i);
                simple += a + " ";
            }
            
        }
        for (int i = 102; i < 226; i++) {
            String[] text2= text1[i].split(";");
            if("".equals(text2[0])){
                String a = String.valueOf(i);
                doble += a + " ";
            }
            
        }
        
        for (int i = 226; i < 266; i++) {
            String[] text2= text1[i].split(";");
            if("".equals(text2[0])){
                String a = String.valueOf(i);
                triple += a + " ";
            }
            
        }
        for (int i = 266; i < 301; i++) {
            String[] text2= text1[i].split(";");
            if("".equals(text2[0])){
                String a = String.valueOf(i);
                suite += a + " ";
            }
   
        }
        System.out.println(simple);
        return text;
    }
    
    public void historicoHabitacion(int habitacion){
        String direccion = "src//file//historico.csv";
        String text = leer(direccion);
        String hab = String.valueOf(habitacion);
        String[] text1 = text.split("\n");
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        for (int i = 1; i < text1.length; i++){
            String[] text2 = text1[i].split(";");
            String texto = text2[6];
            if (texto.equals(hab)) {
                Cliente cliente = new Cliente(text2[0],text2[1],text2[2],text2[3],text2[4],text2[5],Integer.parseInt(text2[6]));
                arbol.insertar(cliente, arbol.getRaiz());
            }
        }
        String string = arbol.inOrden(arbol.getRaiz());
        JOptionPane.showMessageDialog(null,string);
    }
   
}
