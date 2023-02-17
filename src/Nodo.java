public class Nodo {
    int dato;
    String nombre;
    Nodo iz;
    Nodo dr;

    public Nodo(int d, String n){
        this.dato = d;
        this.nombre = n;
        this.iz = null;
        this.dr = null;
    }

    Nodo(int d){
        this.dato = d;

        this.iz = null;
        this.dr = null;
    }

    public String toString(){
        return nombre + "dato: "+dato;
    }

}
