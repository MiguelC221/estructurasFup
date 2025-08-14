/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author 1086298570
 */
public class Teclado {
    Scanner in = new Scanner(System.in);
    String ciudades[] = new String[4];
    
    void llenarArreglo(){
        System.out.println("Llenando Ciudades...");
        String dato;
        
        dato = in.next();
        ciudades[1] = dato;
    }
    void leerArreglo(){
        System.out.print("Leyendo el arreglo... ");
        for(int i = 0; i < ciudades.length; i++){
            System.out.println(ciudades[i]);
        }
        
    }
}
