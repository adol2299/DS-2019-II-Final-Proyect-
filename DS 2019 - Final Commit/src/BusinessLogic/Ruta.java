package BusinessLogic;
import estructuras_de_datos_propias.ListaOrdenada;





public class Ruta implements Comparable<Ruta>{
    Aeropuerto origen, destino;
    Avion avion;
    Tiempo salida, llegada;

    public Ruta(Aeropuerto origen, Aeropuerto destino, Avion avion, Tiempo salida, Tiempo llegada) {
        this.origen = origen;
        this.destino = destino;
        this.avion = avion;
        this.salida = salida;
        this.llegada = llegada;
    }

    @Override
    public String toString() {
        return "Ruta{" + "origen=" + origen.toString() + ", destino=" + destino.toString() + ", avion=" + avion.toString() + ", salida=" + salida.toString() + ", llegada=" + llegada.toString() + '}';
    }

    @Override
    public int compareTo(Ruta t) {
        return this.salida.compareTo(t.getSalida());
    }

    public Aeropuerto getOrigen() {
        return origen;
    }

    public Aeropuerto getDestino() {
        return destino;
    }

    public Avion getAvion() {
        return avion;
    }

    public Tiempo getSalida() {
        return salida;
    }

    public Tiempo getLlegada() {
        return llegada;
    }

    
    
    
}
