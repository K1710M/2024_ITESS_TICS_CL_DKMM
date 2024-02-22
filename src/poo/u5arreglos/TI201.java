
package poo.u5arreglos;

import java.util.Arrays;
import java.util.Scanner;


public class TI201 {
    public static void main (String []args){
        int []numeros, n;
        numeros = new int [5];
        Scanner leer = new Scanner (System.in);
        int num[] = {4,3,2,1,5,4,3};
        System.out.println(Arrays.toString(num));
        num[0]=40;
        System.out.println(Arrays.toString(num));
        System.out.println(num[0]);
        System.out.println(Math.toDegrees(num[0]));
        for(int i = 0; i<num.length; i++){
            num[i]=leer.nextInt();
            System.out.println(num[i]);
        }
        String nombres[] = {"Isaac", "Frank", "Panch", "Panchini"};
        
        float [] decimales = new float[4];
        
        boolean []logica = {true, false, true}; 
    }
}
