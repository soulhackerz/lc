/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcode.test;

import java.util.ArrayList;
import java.util.Arrays;
import lcode.lib.ListNode;
import lcode.lib.TreeNode;
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
    
    /**
     * 287. Find the Duplicate Number
     * https://leetcode.com/problems/find-the-duplicate-number/description/
     * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

        Note:
        You must not modify the array (assume the array is read only).
        You must use only constant, O(1) extra space.
        Your runtime complexity should be less than O(n2).
        There is only one duplicate number in the array, but it could be repeated more than once.
     * @param nums
     * @return 
     */
    
    public static void test287() {
        LAmzUtil lau = new LAmzUtil();
        System.out.println(lau.findDuplicate(new int[] {1,3,4,2,2,}));
    }
    
    /**
     * 2. Add Two Numbers
     * https://leetcode.com/problems/add-two-numbers/description/
     */
    public static void test2() {
        LAmzUtil lau = new LAmzUtil();
        ListNode a = new ListNode(2);
        a.next = new ListNode(4);
        a.next.next = new ListNode(3);
        ListNode b = new ListNode(5);
        b.next = new ListNode(6);
        b.next.next = new ListNode(4);
        System.out.println(lau.addTwoNumbers(a,b));
    }
    
    /**
     * 160. Intersection of Two Linked Lists
     * https://leetcode.com/problems/intersection-of-two-linked-lists/description/
     */    
    public static void test160() {
        LAmzUtil lau = new LAmzUtil();
        ListNode a = new ListNode(2);
        a.next = new ListNode(4);
        a.next.next = new ListNode(3);
        ListNode b = new ListNode(5);
        b.next = new ListNode(6);
        b.next.next = new ListNode(4);
        b.next.next.next = a.next.next;
        System.out.println(lau.getIntersectionNode(a, b));
    }
    
    /**
     * 21. Merge Two Sorted Lists
     * https://leetcode.com/problems/merge-two-sorted-lists/description/
     */
    public static void test21() {
        LAmzUtil lau = new LAmzUtil();
        ListNode a = new ListNode(2);
        a.next = new ListNode(3);
        a.next.next = new ListNode(4);
        ListNode b = new ListNode(5);
        b.next = new ListNode(6);
        b.next.next = new ListNode(7);
        System.out.println(lau.mergeTwoLists(a, b));
    } 
    
    /**
     * 23. Merge k Sorted Lists
     * https://leetcode.com/problems/merge-k-sorted-lists/description/
     */    
    public static void test23() {
        LAmzUtil lau = new LAmzUtil();
        ListNode a = new ListNode(2);
        a.next = new ListNode(3);
        a.next.next = new ListNode(4);
        ListNode b = new ListNode(5);
        b.next = new ListNode(6);
        b.next.next = new ListNode(7);
        ListNode c = new ListNode(1);
        c.next = new ListNode(3);
        c.next.next = new ListNode(4);      
        c.next.next.next = new ListNode(9);  
        ListNode[] input = {a,b,c};
        System.out.println(lau.mergeKLists(input));
    }
    
    /**
     * 200. Number of Islands
     * https://leetcode.com/problems/number-of-islands/description/
     */    
    public static void test200() {
        LAmzUtil lau = new LAmzUtil();
        System.out.println(lau.numIslands(new char[][] {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}}));
    }
    
    /**
     * 136. Single Number
     * https://leetcode.com/problems/single-number/description/
     */
    public static void test136() {
        LAmzUtil lau = new LAmzUtil();
        System.out.println(lau.singleNumber(new int[] {1,1,2,2,5}));
    }
    
    /**
     * 127. Word Ladder
     * https://leetcode.com/submissions/detail/151770640/
     */    
    public static void test127() {
        LAmzUtil lau = new LAmzUtil();
        System.out.println(lau.ladderLength("hit", "cog", Arrays.asList(new String[]{"hot","dot","dog","lot","log","cog"})));
    }
    
    /**
     * 102. Binary Tree Level Order Traversal
     * https://leetcode.com/problems/binary-tree-level-order-traversal/description/
     */    
    public static void test102() {
        LAmzUtil lau = new LAmzUtil();
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(9);
        tree.right = new TreeNode(20);
        tree.right.left = new TreeNode(15);
        tree.right.right = new TreeNode(7);
        System.out.println(lau.levelOrder(tree));
    }
}
