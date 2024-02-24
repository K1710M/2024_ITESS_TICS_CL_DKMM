/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.u5arreglos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TI201Array {
    private Scanner leer;
    public static void main(String [] args ){
        
        TI201Array ti = new TI201Array();
        ti.pedirDatosArray();
        ti.mostrarArray();
    }
    
    public void mostrarArray(){
        String nombre[] = {"Julion", "Karen", "Esteban", "Franchesco", "Isaackynio"};
        System.out.println(Arrays.toString(nombre));
        for(int i = 0; i<nombre.length; i++){
            System.out.println(nombre[i]);
        }
    }
    
    public void pedirDatosArray(){
        this.leer = new Scanner (System.in);
        System.out.println("Tamaño de array");
        int n = leer.nextInt();
        int [] num = new int [n];
        for(int i = 0; i<num.length; i++){
            num[i]=leer.nextInt();
        }
        System.out.println(Arrays.toString(num));
    }
}
