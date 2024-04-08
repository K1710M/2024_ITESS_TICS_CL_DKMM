package poo.POO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main ma = new Main();
        ma.ClaseLapiz();
        ma.ClaseSerie();
        ma.ClaseVideoJuegos();
        ma.ClaseVehiculo();
    }

    public void ClaseLapiz() {
        Scanner leer = new Scanner(System.in);
        Lapiz lap = new Lapiz("Negro", "Madera", 15, "Jocar", 8);
        String nombre = leer.nextLine();
        System.out.println(lap.toString());
        System.out.println(lap.EscribeSaludo(nombre));
        lap.Borra();
        System.out.println(lap.Dibuja("un carrito"));
        System.out.println(lap.getColor());
        lap.setColor("Azul");
        System.out.println(lap.getMaterial());
        lap.setMaterial("Plastico");
        System.out.println(lap.getTamanio());
        lap.setTamanio(18);
        System.out.println(lap.getMarca());
        lap.setMarca("Mapet");
        System.out.println(lap.getPrecio());
        lap.setPrecio(12);
        System.out.println(lap.toString());
    }
    public void ClaseSerie(){
        Serie se = new Serie("El Mito del Sisifo", 45, 2, 23, "Ciencia Ficcion", "Coreana");
        System.out.println(se.toString());
        System.out.println(se.Entretenimiento());
        System.out.println(se.Informan());
        System.out.println(se.getNombre());
        se.setNombre("El Caso Hartung");
        System.out.println(se.getDauracion());
        se.setDauracion(55);
        System.out.println(se.getTemporadas());
        se.setTemporadas(3);
        System.out.println(se.getCapitulos());
        se.setCapitulos(13);
        System.out.println(se.getGenero());
        se.setGenero("Misterio");
        System.out.println(se.getNacionalidad());
        se.setNacionalidad("Estadounidense");
        System.out.println(se.toString());
    }
    
    public void ClaseVideoJuegos(){
        Videojuegos vj = new Videojuegos ("Carreras", 1.12, "2", "Play Store", 3, "Telefono");
        System.out.println(vj.toString());
        System.out.println(vj.Jugar());
        System.out.println(vj.Entretener());
        System.out.println(vj.getTipo());
        vj.setTipo("Construccion");
        System.out.println(vj.getVersion());
        vj.setVersion(2.1);
        System.out.println(vj.getJugadores());
        vj.setJugadores("5");
        System.out.println(vj.getPlataforma());
        vj.setPlataforma("Google");
        System.out.println(vj.getActualizaciones());
        vj.setActualizaciones(6);
        System.out.println(vj.getDispositivo());
        vj.setDispositivo("Tableta");
        System.out.println(vj.toString());
    }
    
    public void ClaseVehiculo(){
        Vehiculo v = new Vehiculo ("Ford", "2023", "Azul", 14, "Carreras", "Nuevo", "Competir", 1234.567, 123);
        System.out.println(v.toString());  
        System.out.println(v.getMarca());
        v.setMarca("Nissan");
        System.out.println(v.getModelo());
        v.setModelo("2322");
        System.out.println(v.getColor());
        v.setColor("Rojo");
        System.out.println(v.getCilindros());
        v.setCilindros(16);
        System.out.println(v.getTipo());
        v.setTipo("Familiar");
        System.out.println(v.getMotor());
        v.setMotor("Usado");
        System.out.println(v.getUso());
        v.setUso("Viajar");
        System.out.println(v.getCosto());
        v.setCosto(1234567.56);
        System.out.println(v.getCombustible());
        v.setCombustible(2345);
        System.out.println(v.toString());
    }

}
