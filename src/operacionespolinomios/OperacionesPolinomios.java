/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionespolinomios;

import java.util.Scanner;

/**
 *
 * @author Felipe
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
        
        
        System.out.println("Cantidad de Terminos polinomio 1");
        terminos = objRead.nextInt();
        
        for(int i = 0; i < terminos; i++){
            System.out.println("Ingrese Coeficiente");
            coeficiente = objRead.nextInt();
            System.out.println("Ingrese Exponente");
            exponente = objRead.nextInt();
            elPolinomio1.AlmacenarTermino(coeficiente, exponente);
        }
        
        System.out.println("Cantidad de Terminos polinomio 2");
        terminos = objRead.nextInt();
        
        for(int i = 0; i < terminos; i++){
            System.out.println("Ingrese Coeficiente");
            coeficiente = objRead.nextInt();
            System.out.println("Ingrese Exponente");
            exponente = objRead.nextInt();
            elPolinomio2.AlmacenarTermino(coeficiente, exponente);
        }    

        calculoPolinomios.Sumar(elPolinomio1, elPolinomio2);
        
        while(calculoPolinomios.getPolinomioEnListaLigada().MostrarCoeficiente() != 0){
            System.out.println(calculoPolinomios.getPolinomioEnListaLigada().MostrarCoeficiente() +
                                ", " + calculoPolinomios.getPolinomioEnListaLigada().MostrarExponente());
            
        }

        calculoPolinomios.Multiplicar(elPolinomio1, elPolinomio2);
        
        while(calculoPolinomios.getPolinomioEnListaLigada().MostrarCoeficiente() != 0){
            System.out.println(calculoPolinomios.getPolinomioEnListaLigada().MostrarCoeficiente() +
                                ", " + calculoPolinomios.getPolinomioEnListaLigada().MostrarExponente());
        }
            
        calculoPolinomios.Derivar(elPolinomio1);
        
        
    }
    
}
