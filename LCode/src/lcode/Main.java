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
        test83();
    }
    
    /**
     * 206. Reverse Linked List
     * 
     * https://leetcode.com/problems/reverse-linked-list/description/
     * 
     * @param head
     * @return 
     */
    private static void test206() {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2,a);
        ListNode c = new ListNode(3,b);
        
        ListUtil lu = new ListUtil();
        System.out.println("=== 206. Reverse Linked List ===");
        System.out.print(c);
        System.out.print(lu.reverseList(c));
    }
    
    /**
     * 141. Linked List Cycle
     * 
     * https://leetcode.com/problems/linked-list-cycle/description/
     * 
     */
    public static void test141() {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2,a);
        //ListNode c = new ListNode(3,b);
        //a.next = a;
        ListUtil lu = new ListUtil();
        System.out.println("=== 141. Linked List Cycle ===");
        //System.out.print(c);
        System.out.println(lu.hasCycle(a));
    }
    
    /**
     * 237. Delete Node in a Linked List
     * https://leetcode.com/problems/delete-node-in-a-linked-list/description/
     * 
     */
    public static void test237() {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2,a);
        ListNode c = new ListNode(3,b);
        ListNode d = new ListNode(4,c);
        ListUtil lu = new ListUtil();
        System.out.println("=== 237. Delete Node in a Linked List ===");
        System.out.print(d);
        lu.deleteNode(b);
        System.out.print(d);
    }
    
    /**
     * 83. Remove Duplicates from Sorted List
     * https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
     * 
     */
    public static void test83() {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1,a);
        ListNode c = new ListNode(1,b);
        ListNode d = new ListNode(1,c);
        ListUtil lu = new ListUtil();
        System.out.println("=== 83. Remove Duplicates from Sorted List ===");
        System.out.print(d);
        ListNode e = lu.deleteDuplicates(d);
        System.out.print(e);
    }
}
