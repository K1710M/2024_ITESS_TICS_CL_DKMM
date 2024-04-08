/*
 * ITESS-TICS
 * SEMESTRE ENERO-JUNIO 2024
 * CALCULO INTEGRAL
 * CONVERTIR UN PUNTO A CO0RDENADAS PANTALLA
 * DIANA KAREN MANDUJANO MAGAÑA
 * 15 / MARZO / 2024
 */
package tools;

public class CoordinateTest {
    public static void main (String ... args){
        Coordinate coor = new Coordinate(-2,2,-2,2,1080,960);
        
        System.out.println("Tester Center");
        System.out.println("xr : 0 ---> xs : " + coor.toScreenX(0));
        System.out.println("yr : 0 ---> ys : " + coor.toScreenY(0)+"\n");
        
        System.out.println("Tester Left upper corner");
        System.out.println("xr : 0 ---> xs : " + coor.toScreenX(-2));
        System.out.println("yr : 0 ---> ys : " + coor.toScreenY(2)+"\n");
        
        System.out.println("Tester Right bottom corner");
        System.out.println("xr : 0 ---> xs : " + coor.toScreenX(2));
        System.out.println("yr : 0 ---> ys : " + coor.toScreenY(-2));
    }
}
