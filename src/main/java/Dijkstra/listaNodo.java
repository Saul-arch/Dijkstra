package Dijkstra;

public class listaNodo {
    Nodo inicio;
    Nodo fin;
    int limite = 19;

    public void agregar(String nombre, int identificador){
        if (inicio == null){
            inicio = new Nodo(nombre, identificador);
            fin = inicio;
            //System.out.println("aver si jala 1");
        }else {
            fin.siguiente = new Nodo(nombre,identificador);
            fin = fin.siguiente;
        }

    }
    public Nodo buscar(String nombre){
        Nodo aux;
        aux = inicio;
        while (aux != null){
            if(aux.nombre.equals(nombre)){
                return aux;

            }else{
                aux = aux.siguiente;
            }
        }
        return null;
    }
    public void buscarId(int id){
        Nodo aux;
        aux = inicio;
        while (aux != null){
            if(aux.identificador == id){
                System.out.print("por ->" + aux.nombre+ " ");
                break;
            }else{
                aux = aux.siguiente;
            }
        }
    }
    public void mostrar(){
        Nodo aux;
        aux = inicio;
        while (aux != null){
            System.out.println("Datos: "+ "Nombre de calle "+aux.nombre + " Identificador "+ aux.identificador);
            aux = aux.siguiente;
        }
    }

}
