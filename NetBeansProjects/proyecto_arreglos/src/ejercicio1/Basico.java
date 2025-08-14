/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author MiguelC221 : Github
 */
public class Basico {

    int numeros[] = new int[4];
    
    void practicarArreglos(){
        for (int i = 0; i < numeros.length ;i++) {
            numeros[i] = i*i + 4;
            System.out.println(numeros[i]);
        }
    }
    void leerArreglos(){
        System.out.println("Mostrando datos del arreglo: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + " = " + numeros[i]);
        }
    }

    void llamarArregloOp2(){
        System.out.println("Llenando el arreglo por la opcion 2: ");
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
    }
    
    //hacer un promedio de los numeros del arreglo xd
}
