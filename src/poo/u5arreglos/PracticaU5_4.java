package poo.u5arreglos;
//Diana Karen Mandujano Magaña

import java.util.Scanner;

public class PracticaU5_4 {
    
    public static void main(String[] args) {
      Scanner leer= new Scanner (System.in);
      int n;
       System.out.print("Cantidad de filas: ");
       n = leer.nextInt();
       String a, arCa[];
        String [][] arr = new String [n][4];
        leer.nextLine();
        for (int i = 0; i <arr.length; i++) {
            System.out.print("Fila ["+i+"]: ");
            a= leer.nextLine();
            arCa=(a.split(","));
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=arCa[j];
            }
        }
        System.out.println("Arreglo ");
        for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Arreglo Invertido");
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[arr.length-1-j][i]+"\t");
            }
            System.out.println();
        }
    }  
}
