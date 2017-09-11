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
        Polinomio elPolinomio = new Polinomio();
        
        Scanner objRead = new Scanner(System.in);
        
        System.out.println("Cantidad de Terminos");
        terminos = objRead.nextInt();
        
        for(int i = 0; i < terminos; i++){
            System.out.println("Ingrese Coeficiente");
            coeficiente = objRead.nextInt();
            System.out.println("Ingrese Exponente");
            exponente = objRead.nextInt();
            elPolinomio.AlmacenarTermino(coeficiente, exponente);
        }
        
        for(int i = 0; i < terminos; i++){
        System.out.println(elPolinomio.MostrarCoeficiente()+", "+elPolinomio.MostrarExponente());
        }
        
        elPolinomio.sumarTerminosSemejantes();
        
        for(int i = 0; i < terminos; i++){
            System.out.println(elPolinomio.MostrarCoeficiente()+", "+elPolinomio.MostrarExponente());
        }
            

        
        
        
        
        
        
    }
    
}
