/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ignis.binary.pattern.matching;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ignis
 */
public class BinaryPatternMatchingTest {
    
    private BinaryPatternMatching test = new  BinaryPatternMatching();
    
    @Test
    public void convertToBinaryTest(){
        String binary = test.convertToBinary("amazing");
        assertEquals("0101011", binary);
    }
    
    @Test
    public void binaryPatternMatchingTest(){
        int match = test.binaryPatternMatching("010","amazing");
        assertEquals(2, match);
        match = test.binaryPatternMatching("100","codesignal");
        assertEquals(0, match);
    }
}
