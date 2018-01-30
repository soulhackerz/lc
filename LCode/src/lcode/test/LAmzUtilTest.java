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
}
