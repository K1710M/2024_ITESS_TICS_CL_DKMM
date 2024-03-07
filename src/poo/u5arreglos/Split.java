
package poo.u5arreglos;

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena, arrCadena[], arrBidi[][];
        String bidi [][] = new String [2][4];
        for (int i = 0; i < 10; i++) {
            cadena= leer.nextLine();
            arrCadena=cadena.split(",");
            for (int j = 0; j < 10; j++) {
                bidi[i][j]=arrCadena[j];
            }
        }
        System.out.println("Impresion");
        for (int i = 0; i < 10; i++) { 
            System.out.println("_________________________");
            for (int j = 0; j < bidi[i].length; j++) {
                System.out.print("|"+bidi[i][j]+"\t");
            }
            System.out.println("|");
        }
        System.out.println("_________________________");
        
//        cadena = "Alex, Sebastian, Tury, caperusito, jitomatito";
//        arrCadena = cadena.split(",");
//        System.out.println(arrCadena.length);
//        
//        for (int i = 0; i < arrCadena.length; i++) {
//            System.out.println(arrCadena[i]);
//        }
    }
}
