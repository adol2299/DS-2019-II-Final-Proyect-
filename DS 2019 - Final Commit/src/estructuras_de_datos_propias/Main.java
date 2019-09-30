/*
 * Un ejemplo sencillo de como usar la Lista ordenada.
 */
package estructuras_de_datos_propias;

import java.util.Random;

/**
 *
 * @author gabriel
 */
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        ListaOrdenada<Integer> lo = new ListaOrdenada<Integer>();
        int[] MAX_ARR = {10, 100, 1000, 5000,10000,50000,100000,1000000,10000000,100000000} ;
        System.out.println("n,push,encontrar,eliminar");
        for (int MAX : MAX_ARR){
            lo = new ListaOrdenada<Integer>();
            System.out.print(MAX);
            System.out.print(',');
            int [] arr = new int [MAX];
            for (int i =0;i<MAX;++i){
                arr[i]=rand.nextInt(MAX/5);
            }
            long start = System.currentTimeMillis();
            for (int i=0;i<MAX;++i){
                lo.push(arr[i]);
            }
            System.out.print(System.currentTimeMillis()-start);
            System.out.print(",");
            start = System.currentTimeMillis();
            for (int i=0;i<MAX ;++i){
                lo.elementoMayorIgual(i);
            }
            System.out.print(System.currentTimeMillis()-start);
            System.out.print(",");
            start = System.currentTimeMillis();
            for (int i=0;i<MAX ;++i){
                lo.eliminar(arr[i]);
            }
            
            System.out.print(System.currentTimeMillis()-start);
            System.out.println("");
            //lo.imprimir();
            //System.out.println(lo.elementoMayorIgual(5));
        }
    }
}
