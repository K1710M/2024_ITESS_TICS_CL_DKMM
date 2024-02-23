
package poo.u5arreglos;

import java.util.Arrays;

//Diana Karen Mandujano Magaña
public class ArregloNombre {
    public static void main (String [] args){
        String nombres[] = {"Gerardo", "Paulina", "Nicólas", "Giovanni", "Alexis", "Leonardo", "Esteban", "Karen",
        "Francisco", "Isaac", "Julian", "Antonio", "Gabriel", "Adrian", "Omar", "Manuel", "Alejandro"};
        System.out.println(Arrays.toString(nombres));
        
        for(int i = 0; i<nombres.length; i++){
            System.out.println(nombres[i]);
        }
    }
}
