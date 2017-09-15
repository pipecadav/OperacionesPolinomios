/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionespolinomios;

import java.util.Scanner;
 

/**
 *
 * @author Felipe Cadavid
 * @author Carolina Diaz
 * @author Luis Angel Vanegas
 * @version 14-09-2017
 * 
 */
public class OperacionesPolinomios {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int coeficiente = 0, exponente = 0, terminos = 0;
        Termino elMonomio;
        Polinomio elPolinomio1 = new Polinomio();
        Polinomio elPolinomio2 = new Polinomio();
        Calculadora calculoPolinomios = new Calculadora();
        Scanner objRead = new Scanner(System.in);
        
        while(terminos < 3){
            System.out.println("Ingrese Coeficiente");
            coeficiente = objRead.nextInt();
            System.out.println("Ingrese Exponente");
            exponente = objRead.nextInt();
            elPolinomio1.AlmacenarTermino(coeficiente, exponente);
            terminos++;
            
        }
        terminos = 0;
        
        while(terminos < 3){
        System.out.println(elPolinomio1.MostrarCoeficiente()+", "+
                           +elPolinomio1.MostrarExponente()) ;
        terminos++;    
        }
 
        elPolinomio1.sumarTerminosSemejantes();
        System.out.println("------------------------------");
        terminos = 0;
        
        while(terminos < 2){
        System.out.println(elPolinomio1.MostrarCoeficiente()+", "+
                           +elPolinomio1.MostrarExponente()) ;
        terminos++;    
        }
        
        calculoPolinomios.Sumar(elPolinomio1, elPolinomio2);

    }
    
}
