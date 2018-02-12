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
}
