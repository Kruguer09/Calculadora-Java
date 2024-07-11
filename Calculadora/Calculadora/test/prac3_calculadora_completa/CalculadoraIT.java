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
public class CalculadoraIT {
    
    public CalculadoraIT() {
    }

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        Calculadora instance = null;
        int expResult = 0;
        int result = instance.sumar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        Calculadora instance = null;
        int expResult = 0;
        int result = instance.restar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restar2 method, of class Calculadora.
     */
    @Test
    public void testRestar2() {
        System.out.println("restar2");
        Calculadora instance = null;
        boolean expResult = false;
        boolean result = instance.restar2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        Calculadora instance = null;
        int expResult = 0;
        int result = instance.multiplicar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        Calculadora instance = null;
        int expResult = 0;
        int result = instance.dividir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dividir1 method, of class Calculadora.
     */

    public void testDividir1() {
        System.out.println("dividir1");
        Calculadora instance = null;
        int expResult = 0;
        int result = instance.dividir1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
