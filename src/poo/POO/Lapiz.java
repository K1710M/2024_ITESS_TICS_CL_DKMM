package poo.POO;

public class Lapiz {
    //Atributos o propiedades de la clase
   private String Color;
   private String Material;
   private double Tamanio;
   private String Marca;
   private double Precio;
   
   //Constructores, que inicializan el objeto cuando se crea
   
    public Lapiz(){}

    public Lapiz(String Color, String Material, double Tamanio, String Marca, double Precio) {
        this.Color = Color;
        this.Material = Material;
        this.Tamanio = Tamanio;
        this.Marca = Marca;
        this.Precio = Precio;
    }
   
    //Metodos o Funcionalidad
    public String EscribeSaludo(String nom){
        return "Hola, como estas? " + nom;
    }
    
    public void Borra(){
        System.out.println("El Lapiz esta borrando.....");
    }

    public String Dibuja(String queDibujar){
        String dibujando = "Se dibujara " + queDibujar;
        return dibujando;
    }
    
    //
    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public double getTamanio() {
        return Tamanio;
    }

    public void setTamanio(double Tamanio) {
        this.Tamanio = Tamanio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Lapiz{" + "\n\tColor=" + Color + ", Material=" + Material + ", Tamanio=" + Tamanio + ", Marca=" + Marca + ", Precio=" + Precio + "\n}";
    }

      
}
