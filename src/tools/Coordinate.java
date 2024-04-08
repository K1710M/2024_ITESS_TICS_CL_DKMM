/*
 * ITESS-TICS
 * SEMESTRE ENERO-JUNIO 2024
 * CALCULO INTEGRAL
 * CONVERTIR UN PUNTO A CO0RDENADAS PANTALLA
 * DIANA KAREN MANDUJANO MAGAÑA
 * 15 / MARZO / 2024
 */
package tools;

public class Coordinate {
   private double xmin; 
   private double xmax; 
   private double ymin; 
   private double ymax; 
   private double width; 
   private double height; 

    public Coordinate(double xmin, double xmax, double ymin, double ymax, double whidth, double hight) {
        this.xmin = xmin;
        this.xmax = xmax;
        this.ymin = ymin;
        this.ymax = ymax;
        this.width = whidth;
        this.height = hight;
    }

    public double getXmin() {
        return xmin;
    }

    public void setXmin(double xmin) {
        this.xmin = xmin;
    }

    public double getXmax() {
        return xmax;
    }

    public void setXmax(double xmax) {
        this.xmax = xmax;
    }

    public double getYmin() {
        return ymin;
    }

    public void setYmin(double ymin) {
        this.ymin = ymin;
    }

    public double getYmax() {
        return ymax;
    }

    public void setYmax(double ymax) {
        this.ymax = ymax;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double whidth) {
        this.width = whidth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double hight) {
        this.height = hight;
    }
   
   public double toScreenX(double xr){
//       xs = (xr - xmin)* width / (xmax-xmin);
       return (xr - xmin) * width / (xmax - xmin);
   }
   public double toScreenY(double yr){
//       xs = height -(yr-ymin)*height / (ymax-ymin);
       return height - (yr - ymin) * height / (ymax - ymin);
   }
}
