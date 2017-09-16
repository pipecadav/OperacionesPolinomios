/*
 * Esta clase crea un polinomio y lo almacena
 * en una lista ligada
 */
package operacionespolinomios;

/**
 *
 * @author Felipe Cadavid
 * @author Carolina Diaz
 * @author Luis Angel Vanegas
 * @version 14-09-2017
 * 
 */
public class Polinomio {
    
    private Nodo cabeza;
    private Nodo ultimo;
    private Nodo x;
    private Termino m = new Termino(0,0); 
    
    /*Constructor
    * Crea un nuevo nodo con almacenando un obejto de la clase polinomio
    */
    public Polinomio(){
        cabeza = new Nodo(m);
        ultimo = x = cabeza;
        
    }
    
    /*Este método crea un nuevo nodo que almacena
    * los términos que se vayan ingresando al polinomio
    */  
    public void AlmacenarTermino(int coef, int exp){
        Termino t = new Termino(coef, exp);
        Nodo p = new Nodo (t);
        ultimo.setLiga(p);
        ultimo = p;
    }
    
    /*Método que recorre la lista para mostrar el Coeficiente
    * de cada nodo
    */
    
    public String MostrarTermino(){
        x = x.getLiga();
        if(x == null){
            x = cabeza;
        }
        return(x.getTermino().getCoef()+"X"+x.getTermino().getExp());
    }
    
    
    /*Este método agrupa los términos semejantes de un polinomio
    * Es decir, si 2 o más términos tienen el mismo exponente
    * estos términos se suman (o restan, dependiento del caso)
    * Se permite sumar términos semejantes si estan uno seguido del 
    *  
    */
    public void sumarTerminosSemejantes(){
        Nodo o = cabeza;
        Nodo p = cabeza.getLiga();
        Nodo q = p;
        Nodo r = q.getLiga();
        int aux;
        while(p != null){
            while(r != null){
                if(p.getTermino().getExp() == p.getLiga().getTermino().getExp()){
                    aux = p.getTermino().getCoef() + p.getLiga().getTermino().getCoef();
                    if(aux==0){
                        o.setLiga(p.getLiga().getLiga());
                        p = o.getLiga();
                        q = p;

                        if(p != null){
                            r = q.getLiga();
                        }
                    }
                }
                if((p != null) &&  (p.getTermino().getExp() == r.getTermino().getExp())){
                    aux = p.getTermino().getCoef() + r.getTermino().getCoef();
                    if(aux == 0){
                        o.setLiga(p.getLiga());
                        p = o.getLiga();
                        q.setLiga(r.getLiga());
                        r = q.getLiga();
                    }else{
                        p.getTermino().setCoef(aux);
                        q.setLiga(r.getLiga());
                        r = q.getLiga();    
                    }
                       
                }else{
                    q = r;
                    r = r.getLiga();
                }
            }
            if(p != null){
                o = p;
                p = p.getLiga();
                q = p;
                if(p != null){
                  r = q.getLiga();
                }
            }
        }
    }
   /*  
    * Este método permite multiplicar un termino independiente por un monomio
    *  o Polinomio
    */
    public void MultiplicarPorCoef(int x){
        Nodo p = cabeza.getLiga();
        int aux;
        while (p != null){
            aux = p.getTermino().getCoef()*x;
            p.getTermino().setCoef(aux);
        }
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

}
    

