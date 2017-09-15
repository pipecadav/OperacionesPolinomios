/*
 * Esta clase Almacena el coeficiente y el exponente de cada termino 
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
public class Termino {
    
    private int coef;
    private int exp;

    public Termino(int coef, int exp) {
        this.coef = coef;
        this.exp = exp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getCoef() {
        return coef;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }
    
    
    
    
    
}
