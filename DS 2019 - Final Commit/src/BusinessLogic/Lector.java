package BusinessLogic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lector {

    String linea;
    BufferedReader buf;

    public Lector() {
        try {
            String filePath = new File("").getAbsolutePath();
            System.out.println(filePath);
            FileReader entrada = new FileReader(filePath.concat("/src/main/java/Data/data_test.txt"));//ruta del arcivo a leer
            buf = new BufferedReader(entrada);
            //entrada.close();

        } catch (IOException ex) {
            System.out.println("Archivo no encontrado");
        }
    }

    public Ruta leer(Aeropuerto origen, Aeropuerto destino, Avion avion, Tiempo salida, Tiempo llegada, boolean mostrar) {
        Ruta ruta = null;
        try {
            linea = buf.readLine();
            String[] s = linea.split(" ");
            origen = new Aeropuerto(Integer.parseInt(s[0]),s[1],s[2]);
            destino = new Aeropuerto(Integer.parseInt(s[3]),s[4],s[5]);
            avion = new Avion (Integer.parseInt(s[6]),s[7], Integer.parseInt(s[8]));
            salida = new Tiempo(Integer.parseInt(s[9]));
            llegada = new Tiempo(Integer.parseInt(s[9]));
            ruta = new Ruta (origen, destino, avion, salida, llegada);
            if (mostrar) {
                System.out.println( linea);
            }
            return ruta;
            
        } catch (IOException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
