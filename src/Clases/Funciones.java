/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Interfaces.ErrorWindow;
import Interfaces.ReservaInfo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author andrespaz
 */
public class Funciones {
    /*
    
    metodos comentados para la primera lectura del Excel 
    
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
    */
    
    // Metodos para escribir en los respectivos archivos de .csv
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
/*
    Iniciaba la lectura del excel 
    
    public void iniciar(){
        escribirReservas(leerReservasCSV());
        escribirHabitaciones(leerHabitacionesCSV());
        escribirEstado(leerEstadoCSV());
        escribirHistorico(leerHistoricoCSV());
    }
    */
 
    
    // Metodo para leer los archivos csv
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
    
    // metodo para crear y llenar con datos el hashTable
    public HashTable crearHashTableEstado(){
        String direccion = "src//file//estado.csv";
        String text = leer(direccion);
        String[] text1 = text.split("\n");
        HashTable hasht = new HashTable(500);
         for (int i = 0; i < text1.length; i++) {
            String[] text2 = text1[i].split(";");
            hasht.put(text2[1] + " " + text2[2],text2[0]);    
            }
        return hasht;
    }
                 
    // Metodo para conseguir el numero de habitacion mediante un Key en el hashTable 
    public String conseguirHabitacion(String nombre, String apellido){
        HashTable hash = crearHashTableEstado();
        String a = nombre + " " + apellido;
        ErrorWindow Error=new ErrorWindow();
        
        if ("".equals(hash.get(a))){
            Error.setVisible(true);
            Error.setError_name("Habitacion sin entregar aún");
        }
        else if(hash.get(a)== null){
            Error.setVisible(true);
            Error.setError_name("Usuario no registrado");
        }
        else{
            return hash.get(a);
            //JOptionPane.showMessageDialog(null, "La habitacion en donde se hospeda el huesped " + nombre + " " + apellido + " es la numero "+ hash.get(a)); //+ hash.get(a));
        }
        return null;
    }
    
    
    // metodo para buscar una reserva mediante la cedula 
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
    
    //Metodo para mostrar todas las reservas como una lista en la interfaz
    public void ReservasUI(javax.swing.JList<String> Lista){
        String direccion = "src//file//reservas.csv";
        String text = leer(direccion);
        String[] text1 = text.split("\n");
        
        for (int i = 1; i < text1.length; i++) {
            String[] text2 = text1[i].split(";");
            String texto = text2[0].replace(".", "");
            DefaultListModel<String> modelo = new DefaultListModel<String>();
            Lista.setModel(modelo);
            modelo.addElement(" C.I: " + text2[0] + " Tipo: " + text2[5] + " Fecha de entrada: " + text2[7] + " Fecha programada de salida:  " + text2[8]);  
        } 
    }
    public void buscarReservasUI2(int cedula){
        String ci = String.valueOf(cedula);
        String direccion = "src//file//reservas.csv";
        String text = leer(direccion);
        String[] text1 = text.split("\n");
        for (int i = 1; i < text1.length; i++) {
            String[] text2 = text1[i].split(";");
            String texto = text2[0].replace(".", "");
            if(texto.contains(ci)){
                ReservaInfo Info=new ReservaInfo();
                Info.setNombre(text2[1]);
                Info.setApellido(text2[2]);
                Info.setCedula("C.I: "+text2[0]);
                Info.setFechaEntr("Fecha de entrada: "+text2[7]);
                Info.setFechaSal("Fecha de salida: "+text2[8]);
                Info.setVisible(true);
                //JOptionPane.showMessageDialog(null, "La reserva esta a nombre de " + text2[1] + " " + text2[2] + " titular de la cedula de identidad " + text2[0] + " y es una habitacion " + text2[5] + " e ingresara en la fecha " + text2[7] + " y su reserva terminara en la fecha " + text2[8]);
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
                //String habitacion = asignarHabitacion(text2[5]);
                JOptionPane.showMessageDialog(null, "La reserva esta a nombre de " + text2[1] + " " + text2[2] + " titular de la cedula de identidad " + text2[0] + " y es una habitacion " + text2[5] + " e ingresara en la fecha " + text2[7] + " y su reserva terminara en la fecha " + text2[8]);
                break;
            }
                
            }
        
    }
    
  /*  
    public String arreglarCSVinicial(String tipoHabitacion){
        String direccion = "src//file//estado.csv";
        String text = leer(direccion);
        String[] text1 = text.split("\n");
        String simple = "";
        String doble = "";
        String triple = "";
        String suite = "";
        String h = tipoHabitacion;
        String estado = "num_hab;primer_nombre;apellido;email;genero;celular;llegada \n";
        for (int i = 1; i < 102; i++) {
            String[] text2= text1[i].split(";");
            if("".equals(text2[0])){
                String a = String.valueOf(i);
                simple += a + " ";
            }else{
                estado += text1[i] + "\n";
            }
        }
        String simple1 = simple.trim();
        for (int i = 102; i < 226; i++) {
            String[] text2= text1[i].split(";");
            if("".equals(text2[0])){
                String a = String.valueOf(i);
                doble += a + " ";
            }else{
                estado += text1[i] + "\n";
            }
            
        }
        String doble1 = doble.trim();
        
        for (int i = 226; i < 266; i++) {
            String[] text2= text1[i].split(";");
            if("".equals(text2[0])){
                String a = String.valueOf(i);
                triple += a + " ";
            }else{
                estado += text1[i] + "\n";
            }
            
        }
        
        String triple1 = triple.trim();
        for (int i = 266; i < 301; i++) {
            String[] text2= text1[i].split(";");
            if("".equals(text2[0])){
                String a = String.valueOf(i);
                suite += a + " ";
            }else{
                estado += text1[i] + "\n";
            }
        }
        
        String suite1 = suite.trim();
        escribirEstado(estado);
        
        
        if(h.equalsIgnoreCase("simple")){
            return simple1;
        }else if(h.equalsIgnoreCase("doble")){
            return doble1;
        }else if(h.equalsIgnoreCase("triple")){
            return triple1;
        }else if(h.equalsIgnoreCase("suite")){
            return suite1;
        }
        return null;
    }
*/
    
    //Metodo para obtener los numeros de habitaciones libres, es retornado como un String el numero

    
   public String habitacionLibres(){
        String direccion = "src//file//estado.csv";
        String text = leer(direccion);
        String[] text1 = text.split("\n");
        String habitaciones = "";
        
        for (int i = 1; i < text1.length; i++) {
            String [] text2 = text1[i].split(";");
            habitaciones += text2[0] + " ";
        }
        String disponibles = "";
        String hab1 = habitaciones.trim();
        String []hab = hab1.split(" ");
        String direccion1 = "src//file//habitaciones.csv";
        String text3 = leer(direccion1);
        String[] text4 = text3.split("\n");
        int cont = 0;
        //System.out.println("cont = " + text4.length);
        for (int i = 1; i < text4.length; i++) {
            cont =0;
            String j = String.valueOf(i);
            for (int k = 0; k < hab.length; k++) {
                if(!hab[k].equals(j)){
                    cont ++;    
                }    
            }
            if(cont == hab.length){
                disponibles += j + " " ;
            }
        }
        //System.out.println("cont = " + disponibles);
        String finald = disponibles.trim();
        return finald ;
    }
   
   // metodo para retornar las habitaciones disponibles segun el tipo de reserva
    
    
    public String entregarHabitacion(String b){
        String direccion = "src//file//habitaciones.csv";
        String text = leer(direccion);
        String[] text1 = text.split("\n");
        String hab = habitacionLibres();
        String [] hab1 = hab.split(" ");
        String habitacionF ="";
        String g = "";
        int habitacion;
        
        for (int i = 0; i < hab1.length; i++) {
                habitacion = Integer.valueOf(hab1[i]);
            if(b.equalsIgnoreCase("simple") && habitacion<101){
                habitacionF = String.valueOf(habitacion);
                
            }else if(b.equalsIgnoreCase("doble") && habitacion<225 && habitacion>100){
                habitacionF = String.valueOf(habitacion);
            }else if(b.equalsIgnoreCase("triple") && habitacion >224 && habitacion <266){
                habitacionF = String.valueOf(habitacion);
            }else if(b.equalsIgnoreCase("suite") && habitacion >266 ){
                habitacionF = String.valueOf(habitacion);   
            }    
        }
        if("".equals(habitacionF)){
            JOptionPane.showMessageDialog(null, "No hay habitaciones disponibles, disculpe la molestia");
        }
        for (int i = 0; i < text1.length; i++) {
            String[] p = text1[i].split(";");
            if(p[0].contains(habitacionF)){
                g = p[0] + " " + p[1] + " " + p[2];
                break;  
            }
            
        }
        return g;
        
        
        
        
    }
    
    // Metodo para hacer el check In en el hotel
    
    public boolean asignarHabitacion(int cedula,String correo){
        String ci = String.valueOf(cedula);
        String direccion = "src//file//reservas.csv";
        String text = leer(direccion);
        String[] text1 = text.split("\n");
        String a ="";
        String c = "";
        boolean b = false;
        String direccion1 = "src//file//estado.csv";
        String text3 = leer(direccion1);
        String[] text6 = text3.split("\n");
        String text4 = "";
        String direccion2 = "src//file//historico.csv";
        String text9 =leer(direccion2);
        String text10 ="";
        for (int i = 0; i < text6.length; i++) {
            String[] text8 = text6[i].split(";");
            //String texto7 = text6[0].replace(".", "");
            if(text8[3].contains(correo)){
                JOptionPane.showMessageDialog(null, "El cliente " + text8[1] + " " + text8[2] + " ya se encuentra registrado");
                return false;
                
            }
        }
        
        for (int i = 0; i < text1.length; i++) {
            String[] text2 = text1[i].split(";");
            String texto = text2[0].replace(".", "");
            if(texto.contains(ci) && ci.length()==8){
                String hab = entregarHabitacion(text2[5]);   
                String[] estado = hab.split(" ");
                JOptionPane.showMessageDialog(null, "El usuario " + text2[1] + " " + text2[2] + " se le asigno la habitacion " + estado[0] + " que se encuentra en el piso " + estado[2]);
                text4 += text3  + estado[0] + ";" + text2[1] + ";" + text2[2] +";"+ text2[3] + ";" + text2[4] + ";" + text2[6] + ";" + text2[7];
                text10 += text9 + text2[0] + ";" + text2[1] + ";" + text2[2]+";"+ text2[3] + ";" + text2[4] + ";" + text2[6] + ";" + estado[0];
                
                b = true;
                
            }else{
                a += text1[i] + "\n";
                
                
            }
        }
        if(b){
            
        }else{
            JOptionPane.showMessageDialog(null, "Error al registrar al usuario");
        }
        System.out.println(text4);
        escribirEstado(text4);
        escribirReservas(a);
        //escribirHistorico(text10);
        return true;
        
        
    }
    
    // Metodo para hacer el chec Out del hotel 
    
    public boolean checkOut(String correo, int cedula){
        String ci = String.valueOf(cedula);
        String direccion = "src//file//estado.csv";
        String text = leer(direccion);
        String[] text2 = text.split("\n");
        String text3 = "";
        String direccion2 = "src//file//historico.csv";
        String text4 =leer(direccion2);
        String text5 ="";
        boolean b = false;
        int cont = 0;
        for (int i = 0; i < text2.length; i++) {
            String[] text6 = text2[i].split(";");
            
            if(text6[3].contains(correo)){
                text3 += ci +";"+ text6[1] + ";" + text6[2] +";"+text6[3] +";"+text6[4] + ";" + text6[6] + ";" + text6[0];
                b = true;
                
                JOptionPane.showMessageDialog(null, "Esperamos haya tenido una buena estadia sr/sra " +text6[1] + " "+ text6[2]);
            }else{
                text5 += text2[i] + "\n";
                cont ++;
            }      
        }
        
        if (!b){
            JOptionPane.showMessageDialog(null, "El cliente ya no se encuentra hospedado");
            return b;
            
        }
        String t = text4 + text3;
        escribirEstado(text5);
        escribirHistorico(t);
        return b;
    }
    
    //Metodo para retornar los huespedes de una habitacion en especifico
    
    public void historicoHabitacion(int habitacion,javax.swing.JList<String> Lista){
        String direccion = "src//file//historico.csv";
        String text = leer(direccion);
        String hab = String.valueOf(habitacion);
        String[] text1 = text.split("\n");
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        for (int i = 1; i < text1.length; i++){
            String[] text2 = text1[i].split(";");
            String texto = text2[6];
            if (texto.equals(hab)) {
                Cliente cliente = new Cliente("\nCedula: "+text2[0],"Nombre y Apellido: "+text2[1],text2[2],"Correo: "+text2[3],"Género: "+text2[4]+"Fecha: ",text2[5],Integer.parseInt(text2[6]));
                arbol.insertar(cliente, arbol.getRaiz());
            }
        }
        DefaultListModel<String> modelo = new DefaultListModel<String>();
        Lista.setModel(modelo);
        String string = arbol.inOrden(arbol.getRaiz());
        modelo.addElement(string);
        //JOptionPane.showMessageDialog(null,string);
    }
   
}
