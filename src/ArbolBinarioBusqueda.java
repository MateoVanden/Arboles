import java.util.Comparator;
public class ArbolBinarioBusqueda extends ArbolBinario{

    public final Comparator prueba;

    public ArbolBinarioBusqueda(){
        super();
        prueba = new ComparaEnteros();
    }

    public Nodo buscar(Object buscado) {

        if (raiz == null) {
            return null;
        } else {
            return localizar(raiz, buscado);
        }
    }

    protected Nodo localizar(Nodo raizSub, Object buscado) {
        if (raizSub == null) {
            return null;
        } else if (prueba.compare(buscado, raizSub.getDato()) < 0) {
            return localizar(raizSub.getIzquierdo(), buscado);
        } else if (prueba.compare(buscado, raizSub.getDato()) > 0) {
            return localizar(raizSub.getDerecho(), buscado);
        } else {
            System.out.println("El valor se encuentra en el arbol binario");
        }
        return raizSub;
    }

    class ComparaEnteros implements Comparator {
        public int compare(Object o1, Object o2) {
            return ((Integer) o1).intValue() - ((Integer) o2).intValue();
        }
    }

    public void insertar(Object valor) throws Exception {
        raiz = insertar(raiz, valor);
    }

    protected Nodo insertar(Nodo raizSub, Object dato) throws Exception {
        if (raizSub == null) {
            raizSub = new Nodo(dato);
        } else if (prueba.compare(dato, raizSub.getDato()) < 0) {
            Nodo iz;
            iz = insertar(raizSub.getIzquierdo(), dato);
            raizSub.ramaIzdo(iz);
        } else if (prueba.compare(dato, raizSub.getDato()) > 0) {
            Nodo dr;
            dr = insertar(raizSub.getDerecho(), dato);
            raizSub.ramaDcho(dr);
        } else
            throw new Exception("Nodo duplicado");
        return raizSub;
    }

    public void eliminar(Object valor) throws Exception {

        raiz = eliminar(raiz, valor);
    }

    // método interno para realizar la operación
    protected Nodo eliminar(Nodo raizSub, Object dato) throws Exception {
        if(raizSub == null){
            throw new Exception("Nodo no encontrado");
        }
        else if(prueba.compare(dato,raizSub.dato) < 0){
            Nodo iz;
            iz = eliminar(raizSub.Izquierdo,dato);
            raizSub.ramaIzdo(iz);
        }
        else if(prueba.compare(dato, raizSub.dato) > 0){
            Nodo iz;
            iz = eliminar(raizSub.Derecho,dato);
            raizSub.ramaDcho(iz);
        }
        else{
            Nodo q;
            q = raizSub;
            if(q.getIzquierdo() == null){
                raizSub = q.getDerecho();
            }
            else if(q.getDerecho() == null){
                raizSub= q.getIzquierdo();
            }
            else{
                q = reemplazar(q);
            }
            q = null;
        }
        return raizSub;
    }
    private Nodo reemplazar(Nodo act) {
        Nodo a, p;
        p = act;
        a = act.getIzquierdo(); // rama de nodos menores
        while (a.getIzquierdo()!= null) {
            p = a;
            a = a.getDerecho();
        }
        act.nuevoValor(a.getDato());
        if (p == act)
            p.ramaIzdo(a.getIzquierdo());
        else
            p.ramaDcho(a.getDerecho());
        return a;
    }

}



