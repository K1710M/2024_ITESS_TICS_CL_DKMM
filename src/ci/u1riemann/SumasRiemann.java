/*
 * ITESS-TICS
 * SEMESTRE ENERO-JUNIO 2024
 * CALCULO INTEGRAL
 * UNIDAD 1: TEOREMA FUNDAMENTAL DE CALCULO
 * CALCULO DE SERIES DE RIEMANN
 * DIANA KAREN MANDUJANO MAGAÑA
 * 23 / FEBRERO / 2024
 */
 
package ci.u1riemann;

public class SumasRiemann {
    protected double [] x;
    protected double [] w;
    protected double [] dx;
    protected double [] fw;
    protected double  suma;

    public SumasRiemann (double a, double b, int n){
        
    }
    public SumasRiemann(){
        
    }
    
    public SumasRiemann(double[] x, double[] w) {
        this.x = x;
        this.w = w;
        
        //crear espacio de memoria
        dx = new double[w.length];
        fw = new double[w.length];
        
    }
    
    public void calcular() {
        //calcular dx, fw, suma
        suma = 0;
        for(int i = 0; i < dx.length; i++){
            dx[i] = x[i+1] - x[i];
            fw[i] = funcion(w[i]);
            suma += fw[i]*dx[i];
        }
    }
    
    public double funcion(double x) {
       // return x*x;
       // return x;
       //return Math.sin(x) ;
        //return Math.sin(x) * Math.sin(x);
        return Math.cos(x);
    }
    
    public void imprimir() {
        //System.out.println("i  |  wi  |  fw  |  fwi*dxi");
        
//        for (int i  = 0; i<w.length; i++){
//            System.out.println(i + "  |  " + w[i] + "  |  " + fw[i] + "  |  " + fw[i]*dx[i]);
//        }

        System.out.println("suma:" + suma);
    }
}
