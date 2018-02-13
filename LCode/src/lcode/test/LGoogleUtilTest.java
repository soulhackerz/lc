/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcode.test;

import lcode.solution.LAmzUtil;
import lcode.solution.LGoogleUtil;

/**
 *
 * @author soulhackerz
 */
public class LGoogleUtilTest {
    /**
     * 616. Add Bold Tag in String
     * https://leetcode.com/problems/add-bold-tag-in-string/description/
     */
    public static void test616() {
        LGoogleUtil lau = new LGoogleUtil();

        System.out.println(lau.addBoldTag("abcdabcd", new String[]{"abc"}));
    }
    
    /**
     * 686. Repeated String Match
     * https://leetcode.com/problems/repeated-string-match/description/
     */
    public static void test686() {
        LGoogleUtil lau = new LGoogleUtil();

        System.out.println(lau.repeatedStringMatch("abcd", "abcdabcdabcd"));
    }

    /**
     * 683. K Empty Slots
     * https://leetcode.com/problems/k-empty-slots/description/
     */    
    public static void test683() {
       LGoogleUtil gau = new LGoogleUtil();
       
       System.out.println(gau.kEmptySlots2(new int[] {1,3,2}, 1));
    }

    /**
     * 681. Next Closest Time
     * https://leetcode.com/problems/next-closest-time/description/
     */
    public static void test681() {
        
    }

    /**
     * 687. Longest Univalue Path
     * https://leetcode.com/problems/longest-univalue-path/description/
     */
    public static void test687() {
        
    }

    /**
     * 482. License Key Formatting
     * https://leetcode.com/problems/license-key-formatting/description/
     */
    public static void test482() {
        
    }
}
