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
    
    /**
     * 1. Two Sum
     * https://leetcode.com/problems/two-sum/
     */
    public static void test1() {
        LAmzUtil lau = new LAmzUtil();
        int[] result = lau.twoSum(new int[]{3,2,4}, 6);
        System.out.println(result[0]+":"+ result[1]);
    }
    
    /**
     * 325. Maximum Size Subarray Sum Equals k
     * https://leetcode.com/problems/maximum-size-subarray-sum-equals-k/description/
     */
    public static void test325() {
        LAmzUtil lau = new LAmzUtil();
        int[] input = {1,1,0};
        System.out.println(lau.maxSubArrayLen(input, 1));
    }

    /**
     * 165. Compare Version Numbers
     * https://leetcode.com/problems/compare-version-numbers/description/
     */
    public static void test165() {
        LAmzUtil lau = new LAmzUtil();

        System.out.println(lau.compareVersion("1.4", "13.1"));
    }
    
    /**
     * 5. Longest Palindromic Substring
     * https://leetcode.com/problems/longest-palindromic-substring/description/
     */    
    public static void test5() {
        LAmzUtil lau = new LAmzUtil();

        System.out.println(lau.longestPalindrome("cbbd"));
    }
    
    /**
     * 238. Product of Array Except Self
     * https://leetcode.com/problems/product-of-array-except-self/description/
     */      
    public static void test238() {
        LAmzUtil lau = new LAmzUtil();
        int[] result = lau.productExceptSelf(new int[] { 1, 2, 3, 4});
        for (int i : result) {
            System.out.print(i+",");
        }
        System.out.println();
    }
    
    /**
     * 273. Integer to English Words
     * https://leetcode.com/problems/integer-to-english-words/description/
     * Convert a non-negative integer to its english words representation. Given input is guaranteed to be less than 231 - 1.
        For example,
        123 -> "One Hundred Twenty Three"
        12345 -> "Twelve Thousand Three Hundred Forty Five"
        1234567 -> "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
     * @param num
     * @return 
     */
    public static void test273() {
        LAmzUtil lau = new LAmzUtil();

        System.out.println(lau.numberToWords(1001));
        System.out.println(lau.numberToWords(12345));
        System.out.println(lau.numberToWords(1234567));
    }    
}
