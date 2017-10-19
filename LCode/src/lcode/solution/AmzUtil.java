/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcode.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author soulhackerz
 */
public class AmzUtil {
    
    /**
     * An sorted array n - 1 unique numbers in the range from 0 to n - 1. 
     * There is only one number in the range from 0 to n - 1 missing. 
     * Please write a function to find the missing number. 
     */
    
    
    /**
     *  *  Reads in a text file and checks to see if the paretheses, curly
    *  braces, and square brackets are balanced.
    *
    *  % java  java Parentheses
    *  [()]{}{[()()]()}
    *  true
    *
    *  % java Parentheses
    *  [(])
    *  false
     */
    
    public boolean isBalanced(String input) {
        Map<Character,Character> opendictionary = new HashMap();
        Map<Character,Character> closedictionary = new HashMap();
        opendictionary.put('{', '}');
        opendictionary.put('(', ')');
        opendictionary.put('[', ']');
        closedictionary.put('}', '{');
        closedictionary.put(')', '(');
        closedictionary.put(']', '[');        
        
        
        char[] inputArray = input.toCharArray();
        Stack stack = new Stack();
        
        for (int i = 0; i<inputArray.length;i++) {
            if (opendictionary.containsKey(inputArray[i])){
                stack.push(inputArray[i]);
            } else if (closedictionary.containsKey(inputArray[i])) {
                if (stack.isEmpty()) {
                    return false;
                }
                char temp = (Character)stack.pop();
                if (temp != closedictionary.get(inputArray[i])){
                    return false;
                }
            }
        }
        return true;
    }
}
