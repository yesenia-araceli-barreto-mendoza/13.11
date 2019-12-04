package pkg13.pkg11;

public class Arbol {
    
 Nodo raiz=null;
    public boolean tieneraiz()
    {
        if(raiz==null) return false;
        else return true;
    }

    public Arbol alta(int dat)
    {
        if(!tieneraiz())
        {
            Nodo nuevo=new Nodo(dat);
            raiz=nuevo;
        }
        else
        {
            boolean izq;
            Nodo actual=raiz;
            while(true)
            {
                if(actual.dato<dat) izq=false;
                else izq=true;
                if(!izq)
                {
                    if(actual.der==null)
                    {
                        Nodo nuevo=new Nodo(dat);
                        actual.der=nuevo;
                        break;
                    }
                    else actual=actual.der;
                }
                else
                {
                    if(actual.izq==null)
                    {
                        Nodo nuevo=new Nodo(dat);
                        actual.izq=nuevo;
                        break;
                    }
                    else actual=actual.izq;
                }
            }
        }return this;
    }

    public void imprimir()
    {
        ayudantePreorden(raiz);
    }

    public void ayudantePreorden(Nodo dat)
    {
        if(dat==null)
                return;
        System.out.printf("%d ",dat.dato);
        ayudantePreorden(dat.der);
        ayudantePreorden(dat.izq);
    }

    public void mayor()
 {
  Nodo actual;
  actual=raiz;
  while(actual.der!=null)
  {
   actual=actual.der;
  }
                System.out.println(actual.dato);

 }

    int suma,sumader,sumaizq,aux=0;

    public void ayudantesuma(Nodo dat)
    {
        if(dat==null)
                return;
        suma=aux+dat.dato;
        aux=suma;
        ayudantesuma(dat.der);
        ayudantesuma(dat.izq);
    }
    public void sumaizquierda()
    {
        Nodo dat=raiz;
        ayudantesuma(dat.der);
        sumaizq=suma;
        System.out.println(sumaizq);

    }

    public void sumaderecha()
    {
        aux=0;
        Nodo dat=raiz;
        ayudantesuma(dat.izq);
        sumader=suma;
        System.out.println(sumader);

    }
   public int sumaMultiplosDe3( int nodo1, int nodo2){
      Nodo dat=raiz;
      int c=0;
      
      if (nodo1%nodo2==0){
          c++;
         
      }
       return c;
   }
   
   private void cantidadNodosHojaRecursivo(Nodo reco) {
       int cant=0;
        while (reco != null) {
            if (reco.izq== null && reco.der == null) {
                cant++;
            }
            cantidadNodosHojaRecursivo(reco.izq);
            cantidadNodosHojaRecursivo(reco.der);
        }
    }

    public int cantidadNodosHoja() {
        int cant=0;
        cant = 0;
        cantidadNodosHojaRecursivo(raiz);
        return cant;
    }
    
    
}


