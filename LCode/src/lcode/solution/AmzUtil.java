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
    
    
    // This is the text editor interface. 
    // Anything you type or change here will be seen by the other person in real time.


    // (1) (2) (3) (4) (5) 6

    // number of players
    // intial player who has the gun

    // last player when game terminates


    // 1
    // return 1

    // 1 2 (start at 2) (2,1)
    // return 1

    // 1 2 3 (start at 2) (3,1)
    // return 1

    // 1 2 3 4
    // return 2

    // 1 2 3 4 5
    // return 2
    //2-->4-->1--4


    /*public int survivor (int numberOfPlayer, int initialPlayer) {

        // input is invalid, what to return?
        if (initialPlayer >= numberOfPlayer) {
            return -1;
        }


        if (numberOfPlayer <= 1) {
            return initialPlayer;
        }

        int currentShooter = initialPlayer;
        List<Integer> survivors = new ArrayList();

        boolean[] survivors = new boolean[numberOfPlayer];
        // for (int i = 0; i<numberOfPlayer;i++) {
        //     survivors.add(i);
        // }

        for (int i = 0; i<numberOfPlayer;i++) {
            survivors = true;
        }
        int numberOfS = numberOfPlayer;

        //
        while (numberOfS >1) {
            if (currentShooter.next ) {
                survivor.remove(currentShooter+1);
                currentShooter.next = currentShooter.next.next;    
                if (currentShooter+1 < survivors.size()) {
                    currentShooter = currentShooter+1;
                } 
                else {
                    currenshotter = survivor.get(0); 
                }

            } else {
                survivor.remove(0);
                currentShooter = survivor.get(0);
            }
            numberOfS--;
        }

        return currentShooter;
    }   */ 
}
