class Nodo
    {
        protected Object dato;
        protected Nodo Izquierdo;
        protected Nodo Derecho;

        public Nodo(Object dato)
        {
            this.dato = dato;
            this.Izquierdo = null;
            this.Derecho = null;
        }
        public Nodo(Nodo Izquierdo, Object dato, Nodo Derecho)
        {
            this.dato = dato;
            Izquierdo = null;
            Derecho = null;
        }
        public Object getDato(){
            return dato;
        }
        public Nodo getIzquierdo(){
            return Izquierdo;
        }
        public Nodo getDerecho(){
            return Derecho;
        }
        public void nuevoValor(Object dato){
            this.dato = dato;
        }
        public void ramaIzdo(Nodo dato){
            this.Izquierdo = dato;
        }
        public void ramaDcho(Nodo dato){
            this.Derecho = dato;
        }
        public void  visitarNodo() {
            System.out.print(dato + " ");
        }
    }
