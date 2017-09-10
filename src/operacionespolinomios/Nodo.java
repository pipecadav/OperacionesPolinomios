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
public class Nodo {
    
    private Monomio p;
    private Nodo liga;
    
    public Nodo(Monomio p){
        p.setCoef(10);
        p.setExp(20);
        liga = null;
    }

    public Monomio getP() {
        return p;
    }

    public void setP(Monomio p) {
        this.p = p;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }
    
    
    
}
