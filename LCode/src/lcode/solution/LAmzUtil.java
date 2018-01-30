/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcode.solution;

import java.util.Arrays;
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
        String[] ver1Array = version1.split("\\.");
        String[] ver2Array = version2.split("\\.");
        
        if (Integer.parseInt(ver1Array[0]) > Integer.parseInt(ver2Array[0])) {
            return 1;
        } 
        else if (Integer.parseInt(ver1Array[0]) < Integer.parseInt(ver2Array[0])) {
            return -1;
        }
        if (ver1Array.length == 1 && ver2Array.length == 1) {
            return 0;
        } else if (ver1Array.length == 1 && ver2Array.length >= 2){
            return -1;
        }else if (ver1Array.length >= 2 && ver2Array.length == 1){
            return 1;
        }
        
        if (Integer.parseInt(ver1Array[1]) > Integer.parseInt(ver2Array[1])) {
            return 1;
        } 
        else if (Integer.parseInt(ver1Array[1]) < Integer.parseInt(ver2Array[1])) {
            return -1;
        } 
        return 0;
    }
    
}
