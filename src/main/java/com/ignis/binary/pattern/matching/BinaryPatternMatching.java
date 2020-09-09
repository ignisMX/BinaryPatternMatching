/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ignis.binary.pattern.matching;

/**
 *
 * @author ignis
 */
public class BinaryPatternMatching {
    public int binaryPatternMatching(String pattern, String s) {
        String binary = convertToBinary(s);
        int match = 0;
        for (int counter = 0; counter < binary.length(); counter++) {
            if (binary.substring(counter).length() >= pattern.length()) {
                String letters = binary.substring(counter, counter + pattern.length());
                if (letters.equals(pattern)) {
                    match += 1;
                }
            }
        }

        return match;
    }
    
    public String convertToBinary(String letters){
        String binary = "";
        for(int i = 0; i < letters.length(); i++){
            binary += letters.substring(i, i+1).equals("a") || 
                    letters.substring(i, i+1).equals("e") ||
                    letters.substring(i, i+1).equals("i") ||
                    letters.substring(i, i+1).equals("o") ||
                    letters.substring(i, i+1).equals("u") ||
                    letters.substring(i, i+1).equals("y") ? "0" : "1";
        }
        
        return binary;
    }
}
