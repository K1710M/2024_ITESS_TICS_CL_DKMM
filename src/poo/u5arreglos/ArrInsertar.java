
package poo.u5arreglos;

public class ArrInsertar {
    public static void main(String[] args) {
        ArrInsertar bidi = new ArrInsertar();
        
        String arr [][] = {{"Isaac", "Toño", "Sebas"}, {"Karen","","Pau"},{"","",""}};
        
        bidi.MostrarBiArr(arr);
        
        arr[1][1] = "Diana";
        arr[2][0] = "Manuel";
        arr[2][0] = "Omar";
        arr[2][2] = "Frank";
        
        System.out.println("_________________________");
        bidi.MostrarBiArr(arr);
        
        //bidi.TI201();
    }//fin main
    
    public void MostrarBiArr (String bidimensional[][]){
        for (int i = 0; i <bidimensional.length ; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("|"+bidimensional[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
