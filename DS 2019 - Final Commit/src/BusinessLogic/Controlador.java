/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.util.TreeMap;
import estructuras_de_datos_propias.ListaOrdenada;
import java.util.Map;

/**
 *
 * @author gabriel
 */
public class Controlador {
    TreeMap<Integer, ListaOrdenada <Ruta>> aeropuertos = new TreeMap<> () ;
    
    
    public void annadirRuta(Ruta r){
        if (!aeropuertos.containsKey(r.getOrigen().getId())){
            aeropuertos.put(r.getOrigen().getId(),new ListaOrdenada<>());
        }
        aeropuertos.get(r.getOrigen().getId()).push(r);
    }

    @Override
    public String toString() {
        String s="Controlador:{\n";
        for (Map.Entry<Integer, ListaOrdenada<Ruta > > entry : aeropuertos.entrySet()){
            s+="Key = "+entry.getKey() + "{\n";
            s+= entry.getValue().toString();
            s+="}\n";
        }
        
        return s+"}\n";
    }
    
}

