import pilaVector.PilaVector ;

public class Main {
    public static void main(String[] args) throws Exception {
        ArbolBinarioBusqueda arbolBinarioBusqueda = new ArbolBinarioBusqueda();

        arbolBinarioBusqueda.insertar(24);
        arbolBinarioBusqueda.insertar(13);
        arbolBinarioBusqueda.insertar(45);
        arbolBinarioBusqueda.buscar(24);
        arbolBinarioBusqueda.eliminar(13);

        System.out.println("RECORRIDO PRE ORDEN");
        ArbolBinario.preOrden(arbolBinarioBusqueda.raizArbol());
        System.out.println("\nRECORRIDO IN ORDEN");
        ArbolBinario.inOrden(arbolBinarioBusqueda.raizArbol());
        System.out.println("\nRECORRIDO POST ORDEN");
        ArbolBinario.postOrden(arbolBinarioBusqueda.raizArbol());
    }
}
