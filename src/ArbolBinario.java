class ArbolBinario {
    protected Nodo raiz;
    public ArbolBinario()
    {
        raiz = null;
    }
    public ArbolBinario(Nodo raiz)
    {
        this.raiz = raiz;
    }
    public Nodo raizArbol() {
        return raiz;
    }
    // Comprueba el estatus del árbol
    boolean esVacio() {
        return raiz == null;
    }
    public static Nodo nuevoArbol(Nodo ramaIzqda, Object dato, Nodo ramaDrcha){
        return new Nodo(ramaIzqda, dato, ramaDrcha);
    }
    // Recorrido preorden
    public static void preOrden(Nodo r){
        if (r != null){
            r.visitarNodo();
            preOrden (r.getIzquierdo());
            preOrden (r.getDerecho());
        }
    }

    // Recorrido inorden
    public static void inOrden(Nodo r){
        if (r != null){
            inOrden (r.getIzquierdo());
            r.visitarNodo();
            inOrden (r.getDerecho());
        }
    }

    // Recorrido de un árbol binario en postorden
    public static void postOrden(Nodo r){
        if (r != null){
            postOrden (r.getIzquierdo());
            postOrden (r.getDerecho());
            r.visitarNodo();
        }
    }

}

