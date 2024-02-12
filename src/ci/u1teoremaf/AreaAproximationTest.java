
package ci.u1teoremaf;

public class AreaAproximationTest {
    
    public static void main (String args[]){
        AreaAproximation ap=new AreaAproximation(0.0,4.0,5);
        ap.computeArea();
        System.out.println(ap.getArea());
    }
}
