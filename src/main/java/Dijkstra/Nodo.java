package Dijkstra;

public class Nodo {

    String nombre;
    int identificador;
    Nodo siguiente;
    public Nodo(String nombre, int identificador){
        this.nombre = nombre;
        this.identificador = identificador;
        this.siguiente = null;
    }

}
