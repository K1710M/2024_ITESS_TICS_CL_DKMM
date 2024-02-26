
package poo.u5arreglos;

import java.util.Scanner;
import java.util.Arrays;

public class TI201PracticaU5_2 {
    private Scanner leer;
    public static void main(String []args){
        TI201PracticaU5_2 ti = new TI201PracticaU5_2();
        ti.Promedio();
        ti.Aleatorio();
        ti.Invertida();
    }
    
    public void Promedio(){
        int suma=0;
        double promedio;
        this.leer = new Scanner(System.in);
        System.out.print("Ingresa la candidad de parciales: ");
        int p = leer.nextInt();
        int [] cal = new int [p];
        for (int i= 0; i< cal.length; i++){
            System.out.print("Parcial (" + (i+1)+") : ");
            cal [i] = leer.nextInt();
            suma = suma + cal[i];
        }
        System.out.println(Arrays.toString(cal));
        promedio = suma/cal.length;
        System.out.print("Tu promedio es: "+ promedio);
        System.out.println();
    }
    
    public void Aleatorio(){
        String nom[] = {"Esteban" , "Julian" , "Karen" , "Francisco" , "Manuel"};
        int a = 0;
        for(int i = 0; i<3; i++){
            System.out.println( nom[a]);
            a = (int)(Math.random()*nom.length);
        }  
        System.out.println();
    }
    
    public void Invertida () {
        int arr[] = { 7, 9, 17, 10, 05, 99, };
        int arr2[] = new int [arr.length];
        int cont = 0;
        for (int i =arr.length-1 ; i>=0; i--){
            arr2[cont] = arr[i];
            cont ++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
