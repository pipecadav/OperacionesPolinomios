/**
 * Están almacenados los miembro de clase para ejecutar
 * las operaciones con los polinomios
 */
package operacionespolinomios;

/**
 * @author Felipe Cadavid
 * @author Carolina Diaz
 * @author Luis Angel Vanegas
 * @version 14-09-2017
 */
public class Calculadora{
    
    private Polinomio polinomioEnListaLigada;

    public Calculadora() {
    }
    
    /**
    * Este método recibe 2 objetos  de la clase polinomio como parámetro.     
    * Ambos polinomios son simplificados
    */
    public String Sumar(Polinomio a, Polinomio b){
        polinomioEnListaLigada = new Polinomio();
        Nodo p = a.getCabeza().getLiga();
        Nodo q = b.getCabeza().getLiga();
        int auxCoef;
        while(p != null && q != null){
            if(p.getTermino().getExp() == q.getTermino().getExp()){
                    auxCoef = p.getTermino().getCoef() + q.getTermino().getCoef();
                    if(auxCoef != 0){
                      polinomioEnListaLigada.AlmacenarTermino(auxCoef, p.getTermino().getExp());
                    }
                    p = p.getLiga();
                    q = q.getLiga();
            }else if(p.getTermino().getExp() < q.getTermino().getExp()){
                polinomioEnListaLigada.AlmacenarTermino(q.getTermino().getCoef(),q.getTermino().getExp());
                q = q.getLiga();
            }else if(p.getTermino().getExp() > q.getTermino().getExp()){
                polinomioEnListaLigada.AlmacenarTermino(p.getTermino().getCoef(),p.getTermino().getExp());
                p = p.getLiga();
            }
        }
        while(p != null){
            polinomioEnListaLigada.AlmacenarTermino(p.getTermino().getCoef(), p.getTermino().getExp());
            p = p.getLiga();
        }
        while(q != null){
            polinomioEnListaLigada.AlmacenarTermino(q.getTermino().getCoef(), q.getTermino().getExp());
            q = q.getLiga();
        }
        Nodo r = polinomioEnListaLigada.getCabeza().getLiga();
        String resultado = " ";
        while(r != null){
        resultado = resultado+"+"+polinomioEnListaLigada.MostrarTermino();
        r = r.getLiga();     
        }
        return resultado;
    }    
    
    /*  
    * Esta función permite multiplicar polinomios previamente ingresados
    * El resultado de la multiplicación almacena sus términos en 
    * un polinomio (lista ligada nueva). Los datos no son organizados por grado
    */
    public String Multiplicar(Polinomio a, Polinomio b){
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
       polinomioEnListaLigada.sumarTerminosSemejantes();   
       Nodo r = polinomioEnListaLigada.getCabeza().getLiga();
       String resultado = " ";
       while(r != null){
            resultado = resultado+"+"+polinomioEnListaLigada.MostrarTermino();
            r = r.getLiga();
             
        }
        
        return resultado;
    }
    
    /*  
    * Dado un polinomio, esta función realiza la derivada de sus términos
    */
    public String Derivar(Polinomio c){
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
        Nodo r = c.getCabeza().getLiga();
       String resultado = " ";
       while(r != null){
            resultado = resultado+"+"+c.MostrarTermino();
            r = r.getLiga();
             
        }
       return resultado;
    }

    public Polinomio getPolinomioEnListaLigada() {
        return polinomioEnListaLigada;
    }
    
    
}
