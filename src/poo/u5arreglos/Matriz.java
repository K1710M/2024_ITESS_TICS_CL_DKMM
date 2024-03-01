
package poo.u5arreglos;

import java.util.Scanner;


public class Matriz {
    private Scanner leer;
    public static void main (String [] args){
        Matriz mat = new Matriz();
        mat.Imprimir();
        mat.Impri();
        mat.Igresar();
    }
    public void Imprimir (){
        int matriz [][]= {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1} };
        for (int i = 0; i < matriz.length; i++) { 
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public void Impri (){
        int matriz [][]= {{1,0,0,1},{0,1,1,0},{0,1,1,0},{1,0,0,1} };
        for (int i = 0; i < matriz.length; i++) { 
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public void Igresar (){
        this.leer = new Scanner (System.in);
        int [][] bi = new int [4][2];
        for (int i = 0; i < bi.length; i++) { 
            for (int j = 0; j < bi[i].length; j++) {
                bi[i][j]=leer.nextInt();
            }
            System.out.println("");
        }
        for (int i = 0; i < bi.length; i++) { 
            for (int j = 0; j < bi[i].length; j++) {
                System.out.print(bi[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
