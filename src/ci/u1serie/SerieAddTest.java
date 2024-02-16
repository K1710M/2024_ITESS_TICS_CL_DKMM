/*
 * ITESS-TICS
 * SEMESTRE ENERO-JUNIO 2024
 * CALCULO INTEGRAL
 * UNIDAD 1: TEOREMA FUNDAMENTAL DE CALCULO
 * SERIES TEST
 * DIANA KAREN MANDUJANO MAGAÑA
 * 16 / FEBRERO / 2024
 */
package ci.u1serie;


public class SerieAddTest {
    public static void main (String ... args){
        SerieAdd sa = new SerieAdd(1,7);
        
        sa.compute();
        sa.print();
    }
}
