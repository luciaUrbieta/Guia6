import java.util.ArrayList;
import java.util.List;

/* 1. Crear una clase genérica llamada "Almacenamiento" que pueda almacenar
cualquier tipo de objeto. Debe tener métodos para agregar, eliminar, y buscar
objetos en el almacenamiento. Haz pruebas de tu clase con diferentes tipos
de objetos. */

public class Almacenamiento<T> {

    private List<T> elementos;

    public Almacenamiento(){
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

    public String toString(){
        return "Elementos: " + elementos;
    }
}
