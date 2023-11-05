package Dijkstra;

public class Drijkstra {
    private int cantidad;
    private String recorrido;
    private int ini;
    private int fin;
    public Drijkstra(int n, String re, int ini, int fin) {
        this.cantidad=n;
        this.recorrido=re;
        this.ini=ini;
        this.fin=fin;
    }
    @Override
    public String toString() {
        return "minimo: "+this.cantidad+" Recorrido: "+this.ini+" "+this.recorrido+""+this.fin;
    }

    public int getIni(){
        return ini;
    }
    public int getFin(){
        return fin;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(String recorrido) {
        this.recorrido = recorrido;
    }
}
