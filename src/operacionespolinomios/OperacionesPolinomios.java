/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionespolinomios;

import java.util.Scanner;
import java.util.regex.Pattern;
 

/**
 *
 * @author Felipe Cadavid
 * @author Carolina Diaz
 * @author Luis Angel Vanegas
 * @version 14-09-2017
 * 
 */
public class OperacionesPolinomios {

    
    public static Polinomio SepararPolinomio(String pPolinomio){ 
        Polinomio unPolinomio = new Polinomio();
        String Pol = pPolinomio;
        String partes[];
        String separar[];
        partes = Pol.split(Pattern.quote("+"));
        for(int i = 0; i<partes.length; i++){
            separar = partes[i].split(Pattern.quote("X"));
            int a = Integer.parseInt(separar[0]);
            int b = Integer.parseInt(separar[1]);
            unPolinomio.AlmacenarTermino(a, b);
        }
        return unPolinomio;
    }    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner objRead = new Scanner(System.in);
        Calculadora calcular = new Calculadora();
        String entrada1;
        String entrada2;
        Polinomio primerPol;
        Polinomio segundoPol;
        String resultadoSuma;
        
        System.out.println("Ingrese Polinomio 1");
        entrada1 = objRead.next();
        System.out.println("Ingrese Polinomio 2");
        entrada2 = objRead.next();
        
        
        primerPol = SepararPolinomio(entrada1);
        segundoPol = SepararPolinomio(entrada2);
        
        
        System.out.println(calcular.Multiplicar(primerPol, segundoPol));
        
        
        
        
        
        
        
        
    }
}

