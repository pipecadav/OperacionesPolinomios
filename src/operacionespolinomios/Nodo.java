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
    
    private Termino t;
    private Nodo liga;

    public Nodo(Termino m) {
        this.t = m;
        liga = null;
    }
    
    public Termino getTermino() {
        return t;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }
    
   
    }
    
