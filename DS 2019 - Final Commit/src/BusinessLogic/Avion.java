/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

/**
 *
 * @author gabriel
 */
public class Avion {
    String marca;
    int id, capacidad;

    public Avion(int id, String marca, int capacidad) {
        this.marca = marca;
        this.id = id;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Avion{" + "marca=" + marca + ", id=" + id + ", capacidad=" + capacidad + '}';
    }
    
    
}
