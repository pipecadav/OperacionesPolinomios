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
public class Calculadora{
    
    private Polinomio polinomioEnListaLigada;

    public Calculadora() {
    }

    public void Sumar(Polinomio a, Polinomio b){
        polinomioEnListaLigada = new Polinomio();
        polinomioEnListaLigada = a;
        Nodo p = b.getCabeza().getLiga();
        while(p != null){
            polinomioEnListaLigada.AlmacenarTermino(p.getTermino().getCoef(), p.getTermino().getExp());
            p = p.getLiga();
        }
        polinomioEnListaLigada.sumarTerminosSemejantes();
    }    
    public void Multiplicar(Polinomio a, Polinomio b){
       polinomioEnListaLigada = new Polinomio();
       Nodo p = a.getCabeza().getLiga();
       Nodo q = b.getCabeza().getLiga();
       int auxCoef;
       int auxExp;
       while(p != null){
           while(q != null){
               auxCoef = p.getTermino().getCoef() * q.getTermino().getCoef();
               auxExp = p.getTermino().getExp() + q.getTermino().getExp();
               polinomioEnListaLigada.AlmacenarTermino(auxCoef, auxExp);
               q = q.getLiga();
           }
           p = p.getLiga();
           q = b.getCabeza().getLiga();
       }
               
    }
    
    public void Derivar(Polinomio c){
        Nodo p = c.getCabeza().getLiga();
        Nodo q = c.getCabeza();
        int aux;
        while(p != null){
            if(p.getTermino().getExp() != 0){
                aux = p.getTermino().getExp()*p.getTermino().getCoef();
                p.getTermino().setCoef(aux);
                p.getTermino().setExp(p.getTermino().getExp()-1);
                p = p.getLiga();
                q = q.getLiga();
            }else{
                q.setLiga(p.getLiga());
                q = q.getLiga();
            }
        }
    }

    public Polinomio getPolinomioEnListaLigada() {
        return polinomioEnListaLigada;
    }
    
    
}
