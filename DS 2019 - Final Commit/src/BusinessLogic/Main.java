/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Main {

    public static void main(String[] args) {
        Lector lb = new Lector();
        Aeropuerto origen = null, destino = null;
        Tiempo salida = null, llegada = null;
        Avion avion = null;
        Ruta ruta = null;
        Controlador c = new Controlador();
        int menu = 0;
        menu = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido \n \n♦Ingrese 1 si desea ver todos los vuelos. \n ♦Ingrese 2 si desea ver un vuelo en especifico\n ♦Ingrese 3 Si desea añadir un nuevo vuelo. \n ♦Ingrese 4 si desea modificar alguno de los datos existentes.\n\n"));
        if (menu == 1) {
            for (int i = 0; i < 5; ++i) {
                ruta = lb.leer(origen, destino, avion, salida, llegada, false);
                c.annadirRuta(ruta);
            }
            JOptionPane.showMessageDialog(null, c.toString());
        }else if(menu==2){
            int nVuelo;
            nVuelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del vuelo que desea ver."));
             for (int j = 0; j < 5; ++j) {
                ruta = lb.leer(origen, destino, avion, salida, llegada, false);
                if(j==nVuelo){
                c.annadirRuta(ruta);}
            }
             JOptionPane.showMessageDialog(null, c.toString());
        }
        //System.out.println(c.toString());

        JOptionPane.showMessageDialog(null, "hola");

    }
}
