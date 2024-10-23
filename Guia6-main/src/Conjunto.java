/* 4. Crear una clase genérica llamada "Conjunto" que pueda almacenar
elementos únicos de cualquier tipo. Debe tener métodos para agregar y
eliminar elementos, y para verificar si un elemento está en el conjunto. Haz
pruebas de tu clase con diferentes tipos de elementos. */

import java.util.ArrayList;
import java.util.List;

public class Conjunto<T> {

    private List<T> elementos;

    public Conjunto(){
        elementos = new ArrayList<>();
    }

    public void agregarElemento(T t){
        elementos.add(t);
    }

    public void eliminarElemento(T t){
        elementos.remove(t);
    }

    public int buscarElemento(T t){
        return elementos.indexOf(t);
    }

    public boolean estaElemento(T t){
        boolean estaElemento=false;
        for(T x : elementos){
            if(t.equals(x)){
                estaElemento=true;
            }
        }
        return estaElemento;
    }

    public String toString(){
        return "Elementos: " + elementos;
    }

}
