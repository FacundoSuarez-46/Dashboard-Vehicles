package com.utec.proyectodeberes;

import com.formdev.flatlaf.FlatLightLaf;
import com.utec.proyectodeberes.classes.Avion;
import com.utec.proyectodeberes.classes.Barco;
import com.utec.proyectodeberes.classes.Persona;
import com.utec.proyectodeberes.classes.Vehiculo;
import com.utec.proyectodeberes.ui.MainFrame;
import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import javax.swing.UIManager;

public class Principal {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            
            MainFrame mainframe = new MainFrame();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.err.println("Failed to initialize LaF");
        }
               
        LinkedList<Vehiculo> listaVehiculos = new LinkedList<Vehiculo>();
        
        for (Vehiculo v: listaVehiculos) {
            System.out.println(v.toString());
        }
        
        System.out.println("-- Orden inverso");
        
        for(int i = listaVehiculos.size(); i > 0; i--) {
            Vehiculo v = listaVehiculos.get(i - 1);
            System.out.println(v.toString());
        }
        
        System.out.println("-- Persona 3");
        
        Persona persona3 = new Persona("Julian", "Alvarez", "Montevideo", (byte) 5, LocalDate.of(1995, Month.JULY, 17), listaVehiculos);
        System.out.println(persona3.toString());
        
        
    }
}
