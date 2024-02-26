
package poo.u5arreglos;

import java.util.Scanner;
import java.util.Arrays;

public class TI201PracticaU5_2 {
    private Scanner leer;
    public static void main(String []args){
        TI201PracticaU5_2 ti = new TI201PracticaU5_2();
       // ti.Promedio();
        ti.Aleatorio();
        
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
    }
    
    public void Aleatorio(){
        String nom[] = {"Esteban" + "Julian" + "Karen" + "Francisco" + "Manuel"};
        int a = (int)(Math.random()*4);
        for(int i = 0; i<nom.length; i++){
            System.out.println( nom[a]);
        }    
    }
}
