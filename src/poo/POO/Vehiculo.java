package poo.POO;

public class Vehiculo {
    private String Marca;
    private String Modelo;
    private String Color;
    private int Cilindros;
    private String Tipo;
    private String Motor;
    private String Uso;
    private double Costo;
    private int Combustible;

    public Vehiculo (){
        
    }
    
    public Vehiculo(String Marca, String Modelo, String Color, int Cilindros, String Tipo, String Motor, String Uso, double Costo, int Combustible) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;
        this.Cilindros = Cilindros;
        this.Tipo = Tipo;
        this.Motor = Motor;
        this.Uso = Uso;
        this.Costo = Costo;
        this.Combustible = Combustible;
    }
    
    public String Transporta (){
        return "Personas";
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getCilindros() {
        return Cilindros;
    }

    public void setCilindros(int Cilindros) {
        this.Cilindros = Cilindros;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String Motor) {
        this.Motor = Motor;
    }

    public String getUso() {
        return Uso;
    }

    public void setUso(String Uso) {
        this.Uso = Uso;
    }

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }

    public int getCombustible() {
        return Combustible;
    }

    public void setCombustible(int Combustible) {
        this.Combustible = Combustible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "\n\tMarca=" + Marca + ", Modelo=" + Modelo + ", Color=" + Color + ", Cilindros=" + Cilindros + ", Tipo=" + Tipo + ", Motor=" + Motor + ", Uso=" + Uso + ", Costo=" + Costo + ", Combustible=" + Combustible + "\n}";
    }
    
    
    
}
