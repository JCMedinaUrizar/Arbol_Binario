import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Arbol_Binario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int dato;
        Ramas ramas = new Ramas();

        do {
            System.out.println("*****ARBOL BINARIO*****");
            System.out.println("1. Ingresar dato");
            System.out.println("2. Recorrido Inorden");
            System.out.println("0. Salir");
            System.out.println("-----------------------");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Seleccione el elemento a ingresar");
                    dato = sc.nextInt();
                    ramas.AgregarNodo(dato);
                    break;
                case 2:
                    if (!ramas.arbolVacio()){
                        ramas.recorrerInorden(ramas.raiz);
                        System.out.println("");
                    }else {
                        System.out.println("Arbol Vacio");
                    }
                    break;
                case 0:
                    System.out.println("Es poco pero trabajo humilde");
                    break;
                default:
                    System.out.println("Por favor, seleccionar una opcion valida");
            }
        }while (opcion != 0);
    }
}
