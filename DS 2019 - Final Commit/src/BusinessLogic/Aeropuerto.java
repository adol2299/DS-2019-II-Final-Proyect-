
package BusinessLogic;
import estructuras_de_datos_propias.ListaOrdenada;

public class Aeropuerto {
    String nombre, ciudad;
    int id;

    public Aeropuerto(int id, String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Aeropuerto{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", id=" + id + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getId() {
        return id;
    }
    
    
    
}
