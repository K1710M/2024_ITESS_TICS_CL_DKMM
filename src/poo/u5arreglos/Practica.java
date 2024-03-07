
package poo.u5arreglos;

import java.util.Scanner;


public class Practica {
    private Scanner leer;
    public static void main (String []args){
        Practica pra = new Practica();
        pra.Datos();
    }
    public void Datos(){
        this.leer = new Scanner (System.in);
        System.out.println("Tamaño de filas");
        int n = leer.nextInt();
        String a;
        System.out.println("Llenado");
        String [][] tab = new String [n+1][3];
        for (int i = 1; i < tab.length; i++) { 
            tab [0][0]="Nombre";
            tab [0][1]="Edad";
            tab [0][2]="Altura";
            for (int j = 0; j < tab[i].length; j++) {
                a = leer.next();
                tab[i][j]=a;
            }
            System.out.println();
        }
        System.out.println("Impresion");
        for (int i = 0; i < tab.length; i++) { 
            System.out.println("_________________________");
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print("|"+tab[i][j]+"\t");
            }
            System.out.println("|");
        }
        System.out.println("_________________________");
    }
}
