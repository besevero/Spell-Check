package com.mycompany.spellchecker.Teclados;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bernardo
 */
public class LeitorTecladosTest {
    
    public LeitorTecladosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of LeitorTeclados method, of class LeitorTeclados.
     */
    @Test
    public void testLeitorTeclados() {
        LeitorTeclados instance = new LeitorTeclados();
        ArrayList<Teclado> expResult = new ArrayList<>();
        expResult.add(new Teclado("QWERTY", "QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM", 0.5, 0.5));
        expResult.add(new Teclado("QWERTZ", "QWERTZUIOP", "ASDFGHJKL", "YXCVBNM", 0.5, 0.5));
        expResult.add(new Teclado("AZERTY", "AZERTYUIOP", "QSDFGHJKLM", "WXCVBN", 0, 0));
        expResult.add(new Teclado("DVORAK", "PYFGCRL", "AOEUIDHTNS", "QJKXBMWVZ", -3, 1));
        expResult.add(new Teclado("COLEMAN", "QWFPGJLUY", "ARSTDHNEIO", "ZXCVBKM", 0, 0));
        expResult.add(new Teclado("WORKMAN", "QDRWBJFUP", "ASHTGYNEOI", "ZXMCVKL", 0.5, 0.5));
    
        ArrayList<Teclado> result = instance.leitorTeclados();
        
        System.out.println(expResult.get(0).getModelo() + " " + result.get(0).getModelo());
        System.out.println(expResult.get(0).getLinha() + " " + result.get(0).getLinha());
        System.out.println(expResult.get(0).getLinha2() + " " + result.get(0).getLinha2());
        System.out.println(expResult.get(0).getLinha3() + " " + result.get(0).getLinha3());
        System.out.println(expResult.get(0).getOffset() + " " + result.get(0).getOffset());
        System.out.println(expResult.get(0).getOffset2() + " " + result.get(0).getOffset2());
        
//QUERTY
        assertEquals(expResult.get(0).getModelo(), result.get(0).getModelo());
        assertEquals(expResult.get(0).getLinha(), result.get(0).getLinha());
        assertEquals(expResult.get(0).getLinha2(), result.get(0).getLinha2());
        assertEquals(expResult.get(0).getLinha3(), result.get(0).getLinha3());
        assertEquals(expResult.get(0).getOffset(), result.get(0).getOffset(), 0.1);
        assertEquals(expResult.get(0).getOffset2(), result.get(0).getOffset2(), 0.1);
        
//QWERTZ
        assertEquals(expResult.get(1).getModelo(), result.get(1).getModelo());
        assertEquals(expResult.get(1).getLinha(), result.get(1).getLinha());
        assertEquals(expResult.get(1).getLinha2(), result.get(1).getLinha2());
        assertEquals(expResult.get(1).getLinha3(), result.get(1).getLinha3());
        assertEquals(expResult.get(1).getOffset(), result.get(1).getOffset(), 0.1);
        assertEquals(expResult.get(1).getOffset2(), result.get(1).getOffset2(), 0.1);

//AZERTY
        assertEquals(expResult.get(2).getModelo(), result.get(2).getModelo());
        assertEquals(expResult.get(2).getLinha(), result.get(2).getLinha());
        assertEquals(expResult.get(2).getLinha2(), result.get(2).getLinha2());
        assertEquals(expResult.get(2).getLinha3(), result.get(2).getLinha3());
        assertEquals(expResult.get(2).getOffset(), result.get(2).getOffset(), 0.1);
        assertEquals(expResult.get(2).getOffset2(), result.get(2).getOffset2(), 0.1);

//DVORAK
        assertEquals(expResult.get(3).getModelo(), result.get(3).getModelo());
        assertEquals(expResult.get(3).getLinha(), result.get(3).getLinha());
        assertEquals(expResult.get(3).getLinha2(), result.get(3).getLinha2());
        assertEquals(expResult.get(3).getLinha3(), result.get(3).getLinha3());
        assertEquals(expResult.get(3).getOffset(), result.get(3).getOffset(), 0.1);
        assertEquals(expResult.get(3).getOffset2(), result.get(3).getOffset2(), 0.1);
//COLEMAN
        assertEquals(expResult.get(4).getModelo(), result.get(4).getModelo());
        assertEquals(expResult.get(4).getLinha(), result.get(4).getLinha());
        assertEquals(expResult.get(4).getLinha2(), result.get(4).getLinha2());
        assertEquals(expResult.get(4).getLinha3(), result.get(4).getLinha3());
        assertEquals(expResult.get(4).getOffset(), result.get(4).getOffset(), 0.1);
        assertEquals(expResult.get(4).getOffset2(), result.get(4).getOffset2(), 0.1);

//WORKMAN
        assertEquals(expResult.get(5).getModelo(), result.get(5).getModelo());
        assertEquals(expResult.get(5).getLinha(), result.get(5).getLinha());
        assertEquals(expResult.get(5).getLinha2(), result.get(5).getLinha2());
        assertEquals(expResult.get(5).getLinha3(), result.get(5).getLinha3());
        assertEquals(expResult.get(5).getOffset(), result.get(5).getOffset(), 0.1);
        assertEquals(expResult.get(5).getOffset2(), result.get(5).getOffset2(), 0.1);

    }
    
}
