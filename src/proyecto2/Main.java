/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2;

import Clases.Funciones;
import Clases.ManejoDeArchivos;



/**
 *
 * @author andresrivas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funciones f = new Funciones();
        //f.iniciar();
        f.conseguirHabitacion("Kay", "McPherson");
        f.buscarReservas(19504241);
        f.asignarHabitacion("a");
        f.historicoHabitacion(76);
        }
         
    }
    

