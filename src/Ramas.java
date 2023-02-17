public class Ramas {
    Nodo raiz;

    public Ramas(){
        raiz = null;
    }

    public boolean arbolVacio(){
        return raiz == null;
    }

    //Metodo para insertar en el arbol
    public void AgregarNodo(int dato){
        Nodo nuevo = new Nodo(dato);

        if (raiz == null){
            raiz = nuevo;
        }else{
            Nodo Auxiliar = raiz;
            Nodo Padre;

            while (true){
                Padre = Auxiliar;
                if (dato < Auxiliar.dato){
                    Auxiliar = Auxiliar.iz;
                    if (Auxiliar == null){
                        Padre.iz = nuevo;
                        return;
                    }
                }else if (dato > Auxiliar.dato){
                    Auxiliar = Auxiliar.dr;
                    if (Auxiliar == null){
                        Padre.dr = nuevo;
                        return;
                    }
                }else{
                    System.out.println("No se aceptan numeros repetidos, numero ingresado: "+dato);
                    return;
                }

            }

        }

    }
    public void recorrerInorden(Nodo r){
        if (r != null){
            recorrerInorden(r.iz);
            System.out.print(r.dato + ", ");
            recorrerInorden(r.dr);
        }
    }
}
