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

}
