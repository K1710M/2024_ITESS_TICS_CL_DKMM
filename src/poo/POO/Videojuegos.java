package poo.POO;

public class Videojuegos {

    private String Tipo;
    private double Version;
    private String Jugadores;
    private String Plataforma;
    private int Actualizaciones;
    private String Dispositivo;

    //Constructores
    public void Videojuego() {

    }

    public Videojuegos(String Tipo, double Version, String Jugadores, String Plataforma, int Actualizaciones, String Dispositivo) {
        this.Tipo = Tipo;
        this.Version = Version;
        this.Jugadores = Jugadores;
        this.Plataforma = Plataforma;
        this.Actualizaciones = Actualizaciones;
        this.Dispositivo = Dispositivo;
    }

    //Metodos
    public String Jugar() {
        return "Listo para Jugar!!";
    }

    public String Entretener() {
        return "Juegalo para distraerte un momento";
    }
    
    //Get y Set
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getVersion() {
        return Version;
    }

    public void setVersion(double Version) {
        this.Version = Version;
    }

    public String getJugadores() {
        return Jugadores;
    }

    public void setJugadores(String Jugadores) {
        this.Jugadores = Jugadores;
    }

    public String getPlataforma() {
        return Plataforma;
    }

    public void setPlataforma(String Plataforma) {
        this.Plataforma = Plataforma;
    }

    public int getActualizaciones() {
        return Actualizaciones;
    }

    public void setActualizaciones(int Actualizaciones) {
        this.Actualizaciones = Actualizaciones;
    }

    public String getDispositivo() {
        return Dispositivo;
    }

    public void setDispositivo(String Dispositivo) {
        this.Dispositivo = Dispositivo;
    }

    @Override
    public String toString() {
        return "Videojuegos{" + "\n\tTipo=" + Tipo + ", Version=" + Version + ", Jugadores=" + Jugadores + ", Plataforma=" + Plataforma + ", Actualizaciones=" + Actualizaciones + ", Dispositivo=" + Dispositivo + "\n}";
    }
    
}
