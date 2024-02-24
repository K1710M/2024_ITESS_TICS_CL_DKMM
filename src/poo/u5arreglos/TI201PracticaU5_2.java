
package poo.u5arreglos;

import java.util.Scanner;

public class TI201PracticaU5_2 {
    private Scanner leer;
    public static void main(String []args){
        
        
    }
    
    public void Promedio(){
        int suma=0;
        this.leer = new Scanner(System.in);
        System.out.println("Ingresa la candidad de parciales");
        int p = leer.nextInt();
        int [] cal = new int [p];
        for (int i= 0; i< cal.length; i++){
            System.out.println("Parcial (" + (i+1)+") : ");
            cal [i] = leer.nextInt();
        }
    }
}
