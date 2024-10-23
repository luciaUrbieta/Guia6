/* 2. Crear una clase genérica llamada "Pila" que funcione como una pila de
objetos. Debe tener métodos para agregar y quitar elementos de la pila, así
como para verificar si está vacía y para obtener el número de elementos en
la pila. Haz pruebas de tu clase con diferentes tipos de objetos. */

import java.util.ArrayList;
import java.util.List;

public class Pila<T> {

    private List<T> elementos;

    public Pila(){
        elementos = new ArrayList<>();
    }

    public void agregarElemento(T t){
        elementos.add(t);
    }

    public void quitarElemento(){
        elementos.remove(elementos.size()-1);
    }

    public boolean pilaVacia(){
        boolean pilaVacia=false;
        if(elementos.isEmpty()){
            pilaVacia=true;
        }
        return pilaVacia;
    }

    public int cantidadElementos(){
        return elementos.size();
    }

    public String toString(){
        return "Elementos: " + elementos;
    }

}
