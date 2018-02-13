/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcode.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import lcode.lib.TreeNode;

/**
 *
 * @author soulhackerz
 */
public class LGoogleUtil {

    /**
     * 616. Add Bold Tag in String
     * https://leetcode.com/problems/add-bold-tag-in-string/description/
     */
    public String addBoldTag(String s, String[] dict) {
        StringBuilder sb = new StringBuilder();
        boolean[] bold = new boolean[s.length()];
        for (int i = 0; i < dict.length; i++){
            int j = 0;
            while ((j = s.indexOf(dict[i], j))!=-1) {
                for (int k = j; k < j+dict[i].length();k++){
                    bold[k] = true;
                }
                j++;
            }
            
        }
        int i = 0;

        while (i < s.length()) {
            if (!bold[i]) {
                sb.append(s.charAt(i));
                i++;
            } else {
                int temp = i;
                while (i < s.length() && bold[i]) {
                    i++;
                }
                sb.append("<b>"+ s.substring(temp,i)+"</b>");
            }
            
        }

        return sb.toString();
    }
    
    
    /**
     * 686. Repeated String Match
     * https://leetcode.com/problems/repeated-string-match/description/
     */
    public int repeatedStringMatch(String A, String B) {
        if (A.length() > B.length()) {
            if (A.indexOf(B) > 0) {
                return 1;
            }
            else if ((A+A).indexOf(B) > 0 ) {
                return 2;
            }
            return -1;
        }
        StringBuilder sb = new StringBuilder(A);
        int count = 1;
        while (sb.indexOf(B)<0) {

            if (sb.length()-A.length() > B.length()) {
                return -1;
            }
            sb.append(A);
            count++;
        }
        return count;
    }  
    
    /**
     * 683. K Empty Slots
     * https://leetcode.com/problems/k-empty-slots/description/
     */
    public int kEmptySlots(int[] flowers, int k) {
        int[] bloomed = new int[flowers.length];
        
        for (int i = 0; i < flowers.length; i++) {
            int currentSlot = flowers[i]-1;
            bloomed[currentSlot] = 1;
            boolean failedFlag = false;
            if (currentSlot - k -1 >= 0 && bloomed[currentSlot-k-1] == 1) {
                
                for (int j = currentSlot -k ;j < currentSlot; j++) {
                    if (bloomed[j] != 0) {
                        failedFlag = true;
                        continue;
                        
                    }
                }
                if (!failedFlag)
                    return i+1;
            }
            failedFlag = false;
            if (currentSlot+k+1 <= flowers.length-1 && bloomed[currentSlot+k+1] == 1) {
                for (int j = currentSlot+1 ;j < currentSlot+k+1; j++) {
                    if (bloomed[j] != 0) {
                        failedFlag = true;                        
                        continue;
                    }
                }
                if (!failedFlag)
                    return i+1;
            }
            
        }
        return -1;
    }    

    public int kEmptySlots2(int[] flowers, int k) {
        TreeSet<Integer> bloomset = new TreeSet();
        
        for (int i = 0; i < flowers.length; i++) {
            int currentBloomed = flowers[i];
            Integer right = bloomset.ceiling(currentBloomed);
            if (right != null && right == currentBloomed+k+1)
                return i+1;
            Integer left = bloomset.floor(currentBloomed);
            if (left != null && left == currentBloomed-k-1)
                return i+1;
            bloomset.add(currentBloomed);
        }
        return -1;
    }
    
    /**
     * 681. Next Closest Time
     * https://leetcode.com/problems/next-closest-time/description/
     * Given a time represented in the format "HH:MM", form the next closest time by reusing the current digits. 
     * There is no limit on how many times a digit can be reused.
     * You may assume the given input string is always valid. For example, "01:34", "12:09" are all valid. "1:34", "12:9" are all invalid.
     * Input: "19:34"
     * Output: "19:39"
     * Explanation: The next closest time choosing from digits 1, 9, 3, 4, is 19:39, which occurs 5 minutes later.  
     * It is not 19:33, because this occurs 23 hours and 59 minutes later.
     * 
     * Input: "23:59"
     * Output: "22:22"
     * Explanation: The next closest time choosing from digits 2, 3, 5, 9, is 22:22. It may be assumed that the returned time is next day's time since it is smaller than the input time numerically.
     */
    public String nextClosestTime(String time) {
        
        return "";
    } 
    
    /**
     * 687. Longest Univalue Path
     * https://leetcode.com/problems/longest-univalue-path/description/
     * Given a binary tree, find the length of the longest path where each node in the path has the same value. 
     * This path may or may not pass through the root.
     * Note: The length of path between two nodes is represented by the number of edges between them.
     * Note: The given binary tree has not more than 10000 nodes. The height of the tree is not more than 1000.
     * Example 1:Input:

              5
             / \
            4   5
           / \   \
          1   1   5
    * Output:2
    * Example 2:
    * Input:

              1
             / \
            4   5
           / \   \
          4   4   5
     * Output:2
     */
    public int longestUnivaluePath(TreeNode root) {
     
        return -1;
    }
    
    /**
     * 482. License Key Formatting
     * https://leetcode.com/problems/license-key-formatting/description/
     * 
     * You are given a license key represented as a string S which consists only alphanumeric character and dashes. 
     * The string is separated into N+1 groups by N dashes. Given a number K, we would want to reformat the strings 
     * such that each group contains exactly K characters, except for the first group which could be shorter than K, 
     * but still must contain at least one character. Furthermore, there must be a dash inserted between two groups 
     * and all lowercase letters should be converted to uppercase.
     * Given a non-empty string S and a number K, format the string according to the rules described above.
     * 
     * Example 1:
     * Input: S = "5F3Z-2e-9-w", K = 4
     * Output: "5F3Z-2E9W"
     * Explanation: The string S has been split into two parts, each part has 4 characters.
     * Note that the two extra dashes are not needed and can be removed.
     * 
     * Example 2:
     * Input: S = "2-5g-3-J", K = 2
     * Output: "2-5G-3J"
     * Explanation: The string S has been split into three parts, each part has 2 characters except the first part as it could be shorter as mentioned above.
     * 
     * Note:
     * The length of string S will not exceed 12,000, and K is a positive integer.
     * String S consists only of alphanumerical characters (a-z and/or A-Z and/or 0-9) and dashes(-).
     * String S is non-empty.
     */
    public String licenseKeyFormatting(String S, int K) {
        
        return "";
    }
}
