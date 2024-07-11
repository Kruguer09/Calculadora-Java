/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac3_calculadora_completa;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maria
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        Calculadora instance = new Calculadora(20,10);
        int expResult = 30;
        int result = instance.sumar();
        assertEquals(expResult, result,0);
      
        
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        Calculadora instance = new Calculadora(20,10);
        int expResult = 10;
        int result = instance.restar();
        assertEquals(expResult, result,0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * TEST DE MULTIPLICAR DE LA CALCULADORA.
     * Test of multiplicar method, of class Calculadora.
     * 
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        Calculadora instance = new Calculadora(20,10);
        int expResult = 200;
        int result = instance.multiplicar();
        assertEquals(expResult, result,0);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        Calculadora instance = new Calculadora(20,10);
        int expResult = 2;
        int result = instance.dividir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of restar2 method, of class Calculadora.
     */
    @Test
    public void testRestar2() {
        System.out.println("restar2");
        Calculadora instance = new Calculadora(20,10);
        boolean expResult = true;
        boolean result = instance.restar2();
        assertTrue(expResult==result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of dividir1 method, of class Calculadora.
     */
    
    
}
