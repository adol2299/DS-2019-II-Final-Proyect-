/*
 *Esta es la lista ordenada basada en referencias
 *Solo permite una ocurrencia de cada elemento
 */
package estructuras_de_datos_propias;

/**
 *
 * @author gabriel
 */
public class ListaOrdenada <T extends Comparable<T>>{
    class Nodo{
        T data;
        Nodo next;
        Nodo ( Nodo next, T data){
            this.next = next;
            this.data = data;
        }
    }
    Nodo alfa=null;

    /**
     *
     * @param nuevo
     * El nuevo dato a ingresar a la lista ordenada
     * @return
     * true si el nuevo dato fue añadido con exito, en otro caso false
     * pues encontro el dato repetido.
     */
    public boolean push (T nuevo){
        if (alfa == null){
            alfa = new Nodo (null, nuevo);
            return true;
        }
        if (alfa.data.compareTo(nuevo)>0){
            alfa = new Nodo(alfa, nuevo);
            return true;
        }
        Nodo nodo=alfa;
        while ( nodo.next != null && nodo.next.data.compareTo(nuevo)<0 ){
            nodo = nodo.next;
        }
        //Este es el comparador que no permite repetidos.
        if (nodo.data.compareTo(nuevo)==0 || ( nodo.next!= null && nodo.next.data.compareTo(nuevo) == 0)){
            return false;
        }
        nodo.next = new Nodo (nodo.next, nuevo);        
        return true;
    }   
    
    public void imprimir (){
        imprimirRecursivo(alfa);
    }
    private void imprimirRecursivo(Nodo nodo) {
        if (nodo == null)return;
        System.out.println(nodo.data);
        imprimirRecursivo(nodo.next);
    }

    @Override
    public String toString() {
        return toStringRecursivo(alfa);
    }
    private String toStringRecursivo(Nodo nodo) {
        if (nodo == null)return "";
        String s = nodo.data.toString()+'\n';
        s+= toStringRecursivo(nodo.next);
        return s;
    }
    public void eliminar (T elemento){
        if (alfa== null){
            return;
        }
        if (alfa.data.compareTo(elemento)==0){
            alfa=alfa.next;
            return;
        }
        Nodo nodo = alfa.next, previus=alfa;
        while (nodo != null){
            if(nodo.data.compareTo(elemento)==0){
                previus.next=nodo.next;
                return;
            }
            previus = nodo;
            nodo = nodo.next;
        }
    }
    public T elementoMayorIgual(T elemento){
        Nodo nodo = alfa;
        while (nodo!=null && nodo.data.compareTo(elemento)<0){
            nodo = nodo.next;
        }
        if (nodo!= null && nodo.data.compareTo(elemento)>=0){
            return nodo.data;
        }
        return null;
    }
    public void actualizar (T viejo, T nuevo){
        this.eliminar(viejo);
        this.push(nuevo);
    }
}
