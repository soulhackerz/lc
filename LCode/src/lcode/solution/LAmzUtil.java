/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcode.solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import lcode.lib.ListNode;


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
        char[] stringArray = s.toCharArray();
        for (int i = 0; i < s.length()/2; i++) {
            char temp = stringArray[i];
            stringArray[i] = stringArray[s.length()-1-i];
            stringArray[s.length()-1-i] = temp;
        }
        
        return new String(stringArray);
    }
    
    /**
     * 186. Reverse Words in a String II
     * 
     * https://leetcode.com/problems/reverse-words-in-a-string-ii/description/
     */
    public void reverseWords(char[] str) {
        if (str == null || str.length == 0)
            return ;
        int start = 0;
        int end = str.length;
        reverseWord(str, start, end);
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') {
                end = i;
                reverseWord(str,start,end);
                start = end+1;
            }
        }
        reverseWord(str,start,str.length);
        
    }
    private void reverseWord(char[] str, int start, int end) {
        for (int i = start; i < (start+end)/2; i++) {
            char temp = str[i];
            str[i] = str[end-1-(i-start)];
            str[end-1-(i-start)] = temp;
        }
    }
    
    /**
     * 1. Two Sum
     * https://leetcode.com/problems/two-sum/
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap();
        
        for (int i = 0; i < nums.length;i++) {
            map.put(nums[i],i);
        }
        
        for (int i = 0; i < nums.length;i++) {
            if (map.containsKey(target-nums[i])&& i != map.get(target-nums[i])) {
                return new int[] {i, map.get(target-nums[i])};
            }
        }
        return new int[]{};
    }
    
    /**
     * 325. Maximum Size Subarray Sum Equals k
     * https://leetcode.com/problems/maximum-size-subarray-sum-equals-k/description/
     */
    public int maxSubArrayLen(int[] nums, int k) {
        Map<Integer, Integer> sumMap = new HashMap();
        int sum=0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) {
                max = Math.max(max, i+1);
            } 
            else if (sumMap.containsKey(sum-k)){
                max = Math.max(max, i-sumMap.get(sum-k));
            }
            if (!sumMap.containsKey(sum)){
                sumMap.put(sum,i);
            }
        }
        return max;
    }
    
    /**
     * 165. Compare Version Numbers
     * https://leetcode.com/problems/compare-version-numbers/description/
     */
    public int compareVersion(String version1, String version2) {
        String[] v1Array = version1.split("\\.");
        String[] v2Array = version2.split("\\.");
        
        int i = 0, j = 0;
        while (i < v1Array.length && j < v2Array.length) {
            if (Integer.parseInt(v1Array[i]) > Integer.parseInt(v2Array[j])) {
                return 1;
            } 
            else if (Integer.parseInt(v1Array[i]) < Integer.parseInt(v2Array[j])) {
                return -1;
            }
            i++;
            j++;
        }
        while (i < v1Array.length) {
            if (Integer.parseInt(v1Array[i]) != 0)
                    return 1;
            i++;
        }
        while (j < v2Array.length) {
            if (Integer.parseInt(v2Array[j]) != 0)
                    return -1;
            j++;
        }        
        return 0;
    }

    /**
     * 5. Longest Palindromic Substring
     * https://leetcode.com/problems/longest-palindromic-substring/description/
     */    
    public String longestPalindrome(String s) {
        
        int max = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length();i++){
            int len1 = checkAroundCentre(s, i, i);
            int len2 = checkAroundCentre(s, i, i+1);
            if (len1 > len2 && len1> max) {
                max = len1;
                start = i - max/2;
                end = i+max/2+1;
            }
            else if (len1<=len2 && len2 >=max) {
                max = len2;
                start = i+1 -max/2;
                end = i+1+max/2;
            }
        }
        return s.substring(start,end);
    }
    
    private int checkAroundCentre(String s, int left, int right) {
        int currentLen = 0;
        while (left>=0 && right <= s.length()-1 && s.charAt(left) == s.charAt(right)) {
            currentLen = right -left +1;
            right++;
            left --;
        }
        
        return currentLen;
    }    
    
    /**
     * 238. Product of Array Except Self
     * https://leetcode.com/problems/product-of-array-except-self/description/
     */      
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int temp=1;
        for (int i = nums.length-1; i >=0; i--) {
            result[i] = temp;
            temp *= nums[i];
        }
        temp = 1;
        for (int i = 0; i < nums.length; i++ ) {
            result[i] *= temp;
            temp *= nums[i];
        }
        return result;
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
    public Map<Integer, String> map = new HashMap();
    public String numberToWords(int num) {
        populateMap();
        if (num == 0) {
            return map.get(num);
        }
        String result = "";
        if (num >= 1000000000) {
            int rnum = num/1000000000;
            result += convertToWords(rnum) + " Billion";
            num = num%1000000000;
        }
        if (num >= 1000000) {
            int rnum = num/1000000;
            result += " " + convertToWords(rnum) + " Million";
            num = num%1000000;
        } 
        if (num >= 1000) {
            int rnum = num/1000;
            result += " " + convertToWords(rnum) + " Thousand";
            num = num%1000;
        } 
        if (num > 0){
            result += " " + convertToWords(num);
        }           
        return result.trim();          
        
    }
    
    private String convertToWords(int num) {
        String result = "";
        if (num >= 100) {
            result += map.get(num/100) + " Hundred";
            int remainder = num%100;
            if (remainder > 0)
                result += " " +convertSmallToWords(remainder);

        } else {
            result += convertSmallToWords(num);
        }
        return result;
    }
    private String convertSmallToWords(int num) {
        String result = "";
        if (map.containsKey(num)) {
            result += map.get(num);
        } else if (num > 20) {
            int remainder = num % 10;
            int mapnum = num - remainder;
            result += map.get(mapnum)+ " " + map.get(remainder);
        }
        return result;
    }         
    
    private void populateMap() {
        map.put(0, "Zero");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");
        map.put(11, "Eleven");
        map.put(12, "Twelve");
        map.put(13, "Thirteen");
        map.put(14, "Fourteen");
        map.put(15, "Fifteen");
        map.put(16, "Sixteen");
        map.put(17, "Seventeen");
        map.put(18, "Eighteen");
        map.put(19, "Nineteen");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");
        map.put(50, "Fifty");
        map.put(60, "Sixty");
        map.put(70, "Seventy");
        map.put(80, "Eighty");
        map.put(90, "Ninety");
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
    public int findDuplicate(int[] nums) {
        int i = 0;
        int slow = nums[0];
        int fast = nums[nums[0]];
        
        while (slow != fast)
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        fast = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
    
    /**
     * 2. Add Two Numbers
     * https://leetcode.com/problems/add-two-numbers/description/
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryOver = 0, sum = 0;
        ListNode head = new ListNode(0);
        ListNode result = head;
        
        while (l1 != null || l2 != null || carryOver != 0) {
            sum = (l1!=null? l1.val:0) + (l2!=null ? l2.val:0)+carryOver;
            carryOver = sum /10;
            sum %= 10;
            result.next = new ListNode(sum);
            result = result.next;
            if (l1 != null)  {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        
        return head.next;
    }

    /**
     * 160. Intersection of Two Linked Lists
     * https://leetcode.com/problems/intersection-of-two-linked-lists/description/
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int countA = 0;
        int countB = 0;
        
        while (tempA != null) {
            tempA = tempA.next;
            countA++;
        }
        
        while (tempB != null) {
            tempB = tempB.next;
            countB++;
        }
        
        tempA = headA;
        tempB = headB;
        if (countA > countB) {
            int diff = countA - countB;
            while (diff > 0) {
                tempA = tempA.next;
                diff--;
            }
        }
        
        if (countB > countA) {
            int diff = countB - countA;
            while (diff > 0) {
                tempB = tempB.next;
                diff--;
            }
        }
        
        while (tempA != null && tempB != null) {
            if (tempA.equals(tempB)) {
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }    
    
    /**
     * 126. Word Ladder II
     * https://leetcode.com/problems/word-ladder-ii/description/
     * beginWord = "hit"
     * endWord = "cog"
     * wordList = ["hot","dot","dog","lot","log","cog"]
     * @param beginWord
     * @param endWord
     * @param wordList
     * @return 
     */
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        return null;
    }
}
