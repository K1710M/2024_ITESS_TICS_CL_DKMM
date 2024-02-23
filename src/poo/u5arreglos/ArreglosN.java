
package poo.u5arreglos;

import java.util.Arrays;
import java.util.Scanner;

//Diana Karen Mandujano Magaña

public class ArreglosN {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Ingresa el tamaño del arreglo: ");
        int a=leer.nextInt();
        int p=0;
        int num[] = new int [a];
        
         for(int i = 0; i<num.length; i++){
            num[i]=leer.nextInt();
        }
         System.out.println(Arrays.toString(num));
    }
}
