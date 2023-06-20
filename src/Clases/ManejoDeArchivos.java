/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author andrespaz
 */
public class ManejoDeArchivos {
    private BufferedReader lector;
    private String linea;
    private String[] partes;
    private String texto = "";
    private String texto1 = "";
    
    public String leerCSV(String ruta){
        try{
            lector = new BufferedReader(new FileReader(ruta));
            while((linea = lector.readLine())!= null){
                partes = linea.split(",");
                texto1 += imprimirHistorico() + "\n";
                
            }
            lector.close();
            linea = null;
            partes = null;
        
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e );
        }
        return texto1;
    }
    
    public String imprimirHistorico(){
        for (int i = 0; i < partes.length; i++) {
            //System.out.println("| " + partes[i] + " |");
            texto =partes[i];
            
        }
        return texto;
        
    }
    
    
}
