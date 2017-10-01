/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcode;

import lcode.lib.ListNode;
import lcode.solution.ListUtil;

/**
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        test206();
    }

    private static void test206() {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2,a);
        ListNode c = new ListNode(3,b);
        
        ListUtil lu = new ListUtil();
        System.out.println("=== 206. Reverse Linked List ===");
        System.out.print(c);
        System.out.print(lu.reverseList(c));
    }
}
