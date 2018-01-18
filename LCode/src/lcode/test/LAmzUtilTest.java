/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcode.test;

import lcode.lib.ListNode;
import lcode.solution.LAmzUtil;
import lcode.solution.ListUtil;

/**
 *
 * @author soulhackerz
 */
public class LAmzUtilTest {
    /**
     * 387. First Unique Character in a String
     * https://leetcode.com/problems/first-unique-character-in-a-string/description/
     */
    public static void test387() {
       LAmzUtil lau = new LAmzUtil();
       System.out.println(lau.firstUniqChar("leetcode"));
       System.out.println(lau.firstUniqChar("loveleetcode"));
    }
    
    /**
     * 344. Reverse String
     * https://leetcode.com/problems/reverse-string/description/
     */    
    public static void test344() {
        LAmzUtil lau = new LAmzUtil();
        System.out.println(lau.reverseString("a"));                
        System.out.println(lau.reverseString("hello"));
    }
    
    /**
     * 186. Reverse Words in a String II
     * 
     * https://leetcode.com/problems/reverse-words-in-a-string-ii/description/
     */
    public static void test186() {
        LAmzUtil lau = new LAmzUtil();
        char[] a = "the sky is blue".toCharArray();
        lau.reverseWords(a);   
        System.out.println(a);
    }
}
