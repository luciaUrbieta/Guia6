/* 5. Crear una clase genérica llamada "ListaOrdenada" que pueda almacenar
elementos en orden ascendente o descendente. Debe tener métodos para
agregar y eliminar elementos, y para obtener el elemento en una posición
específica. Haz pruebas de tu clase con diferentes tipos de elementos y
diferentes órdenes de clasificación. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;

public class ListaOrdenada<T extends Comparable> {

    private ArrayList<T> listaOrdenada;
    private boolean ordenAsc;

    ListaOrdenada(boolean ordenAsc){
        listaOrdenada = new ArrayList();
        this.ordenAsc=ordenAsc;
    }

    public void agregarElemento(T t){
        listaOrdenada.add(t);
        if(ordenAsc){
            ordenarAsc();
        }else{
            ordenarDesc();
        }
    }

    public void eliminarElemento(T t){
        listaOrdenada.remove(t);
    }

    public T buscarElementoPorPosicion(int i) {
        T retorno=null;
        try{
            Excepciones.verificarRangoDelIndice(i, listaOrdenada.size());
            retorno=listaOrdenada.get(i);
        }catch(IndiceFueraDeRangoException e){
            System.out.println(e.getMessage());
        }
        return retorno;
    }

    public void ordenarAsc(){
        Collections.sort(listaOrdenada);
    }

    public void ordenarDesc(){
        listaOrdenada.sort(Comparator.reverseOrder());
    }

    public String toString(){
        return "Elementos "+listaOrdenada;
    }





}
