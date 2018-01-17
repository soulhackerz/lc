/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcode.solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


/**
 *
 * @author soulhackerz
 */
public class LAmzUtil {
    /**
     * 387. First Unique Character in a String
     * https://leetcode.com/problems/first-unique-character-in-a-string/description/
     */
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        Map<Character, Boolean> dupeMap = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!dupeMap.containsKey(current)) {
                dupeMap.put(current,false);
            } else {
                dupeMap.put(current, true);
            }
        }
        for (int i = 0; i < s.length(); i++) {
           char current = s.charAt(i);
            if (!dupeMap.get(current))
                return i;
        }
        return -1;
    }
    
    /**
     * 344. Reverse String
     * https://leetcode.com/problems/reverse-string/description/
     */
    public String reverseString(String s) {
        return "";
    }
    
    /**
     * 186. Reverse Words in a String II
     * 
     * https://leetcode.com/problems/reverse-words-in-a-string-ii/description/
     */
    public void reverseWords(char[] str) {

    }
    
    /**
     * 1. Two Sum
     * https://leetcode.com/problems/two-sum/
     */
    public int[] twoSum(int[] nums, int target) {
        return null;
    }
}
