package poo.POO;

public class Serie {

    private String Nombre;
    private double Dauracion;
    private int Temporadas;
    private int Capitulos;
    private String Genero;
    private String Nacionalidad;

    //Constructores
    public Serie() {
    }

    public Serie(String Nombre, double Dauracion, int Temporadas, int Capitulos, String Genero, String Nacionalidad) {
        this.Nombre = Nombre;
        this.Dauracion = Dauracion;
        this.Temporadas = Temporadas;
        this.Capitulos = Capitulos;
        this.Genero = Genero;
        this.Nacionalidad = Nacionalidad;
    }
    
    //Metodos
    public String Entretenimiento(){
        return "La serie es de entretenimiento";
    }
    public String Informan(){
        return "Serie Informativa";
    }
    
    //Get y Set
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getDauracion() {
        return Dauracion;
    }

    public void setDauracion(double Dauracion) {
        this.Dauracion = Dauracion;
    }

    public int getTemporadas() {
        return Temporadas;
    }

    public void setTemporadas(int Temporadas) {
        this.Temporadas = Temporadas;
    }

    public int getCapitulos() {
        return Capitulos;
    }

    public void setCapitulos(int Capitulos) {
        this.Capitulos = Capitulos;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }
    
    //toString

    @Override
    public String toString() {
        return "Serie{" + "\n\tNombre=" + Nombre + ", Dauracion=" + Dauracion + ", Temporadas=" + Temporadas + ", Capitulos=" + Capitulos + ", Genero=" + Genero + ", Nacionalidad=" + Nacionalidad + "\n}";
    }
    
}
