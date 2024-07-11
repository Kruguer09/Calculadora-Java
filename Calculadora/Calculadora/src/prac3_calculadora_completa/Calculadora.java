/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac3_calculadora_completa;

/**
 *
 * @author maria
 */
public class Calculadora {
    
     int num1;
        
     int num2;
    
     /**
      * CONSTRUCTOR DE LA CALCULADORA.
      * Constructor para que se inicialicen las variables,
      * privadas.
      * @param a
      * @param b 
      */
     public Calculadora(int a, int b){
         
         num1=a;
         
         num2=b;
     }
    
    
    public int sumar(){
        return (num1 + num2);
  }
     
    public int restar(){
          return (num1 - num2);
      }
    
     public boolean restar2(){
       if(num1 >= num2)
           return true;
       else
          return false;
      }
      
    public int multiplicar(){
       
            return (num1 * num2);
  }
     
    public int dividir(){
       
            return (num1/num2);
      }
    
    public int dividir1(){
       
            return (num1/num2);
      }
    
    
    
    
}
