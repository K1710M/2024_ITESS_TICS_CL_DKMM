
package poo.u5arreglos;
import java.util.Arrays;
import java.util.Scanner;

public class ArrBidi {
    private Scanner leer;
    public static void main (String [] args){
        ArrBidi nom = new ArrBidi();
        nom.Bidi();
        nom.Nombres();
        nom.Datos();
    }
    public void Bidi(){
        int numero [][]= new int [5][3];
        int matriz [][]= { {8,9,10,6}, {1,2,3,6}, {0,0,0,6}, {0,0,0,6}};
        //System.out.println(Arrays.toString(matriz));
        for (int i = 0; i < matriz.length; i++) { //la i es para las filas
            for (int j = 0; j < matriz[i].length; j++) {//la j es para las columnas
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public void Nombres(){
        String mat [][]= { {"Goma","\t Lapiz" ,"\t Zacapuntas"}, {"Marcadores","Memoria","\t Lapiceros" }};
        //System.out.println(Arrays.toString(matriz));
        for (int i = 0; i < mat.length; i++) { //la i es para las filas
            for (int j = 0; j < mat[i].length; j++) {//la j es para las columnas
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public void Datos(){
        this.leer = new Scanner (System.in);
        System.out.println("Tamaño de array {i}");
        int n = leer.nextInt();
        System.out.println("Tamaño de array {j}");
        int m = leer.nextInt();
        System.out.println("Llenado");
        int [][] num = new int [n][m];
        for (int i = 0; i < num.length; i++) { //la i es para las filas
            for (int j = 0; j < num[i].length; j++) {//la j es para las columnas
                num[i][j]=leer.nextInt();
            }
            System.out.println("");
        }
        System.out.println("Array");
        for (int i = 0; i < num.length; i++) { //la i es para las filas
            for (int j = 0; j < num[i].length; j++) {//la j es para las columnas
                System.out.print(num[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
