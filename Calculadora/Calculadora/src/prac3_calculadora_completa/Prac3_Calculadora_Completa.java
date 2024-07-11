/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac3_calculadora_completa;

import java.util.Scanner;
/**
 *
 * @author maria
 */
public class Prac3_Calculadora_Completa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
         Scanner sc = new Scanner(System.in);
                 
         Calculadora calc;
         
         calc = new Calculadora(20,10);
    
                       
        
        System.out.println("El resultado de SUMAR los dos números es:" +  calc.sumar());
               
        System.out.println("El resultado de RESTAR los dos números es:" + calc.restar());
               
        System.out.println("El resultado de MULTIPLICAR los dos números es:" + calc.multiplicar());;
                
        System.out.println("El resultado de DIVIDIR los dos números es:" + calc.dividir());
    }
    
    
}
