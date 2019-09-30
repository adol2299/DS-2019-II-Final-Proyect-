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
class Tiempo implements Comparable<Tiempo>{
    int hora;

    public Tiempo(int hora) {
        this.hora = hora;
    }
    
    public int getHora(){
        return hora;
    }
    
    @Override
    public int compareTo(Tiempo t) {
        Integer x=hora;
        return x.compareTo(t.getHora());
    }

    @Override
    public String toString() {
        return "Tiempo{" + "hora=" + hora + '}';
    }
    
    
    
}
