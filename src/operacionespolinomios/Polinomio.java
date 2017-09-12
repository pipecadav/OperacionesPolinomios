/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionespolinomios;

/**
 *
 * @author Felipe
 */
public class Polinomio {
    
    private Nodo cabeza;
    private Nodo ultimo;
    private Nodo x;
    private Nodo y;
    private Termino m = new Termino(0,0);
    
    public Polinomio(){
        cabeza = new Nodo(m);
        ultimo = x = y = cabeza;
        
    }
    
    public void AlmacenarTermino(int coef, int exp){
        Termino t = new Termino(coef, exp);
        Nodo p = new Nodo (t);
        ultimo.setLiga(p);
        ultimo = p;
    }
    
    public int MostrarCoeficiente(){
        x = x.getLiga();
        if(x == null){
            x = cabeza;
        }
        return(x.getTermino().getCoef());
    }
    
    public int MostrarExponente(){
        y = y.getLiga();
        if(y == null){
            y = cabeza;
        }
        return(y.getTermino().getExp());
    }
    
    public void sumarTerminosSemejantes(){
        Nodo o = cabeza;
        Nodo p = cabeza.getLiga();
        Nodo q = p;
        Nodo r = q.getLiga();
        int aux;
        while(p != null){
            while(r != null){
                if(p.getTermino().getExp() == r.getTermino().getExp()){
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
            o = p;
            p = p.getLiga();
            q = p;
            r = q.getLiga();
        }
    }
   
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

    public Nodo getX() {
        return x;
    }

    public Nodo getY() {
        return y;
    }

    
    
}
    

