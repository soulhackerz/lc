/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcode.solution;

import lcode.lib.ListNode;

/**
 *
 * @author soulhackerz
 */
public class ListUtil {
    
    /**
     * 206. Reverse Linked List
     * 
     * https://leetcode.com/problems/reverse-linked-list/description/
     * 
     * @param head
     * @return 
     */
    public ListNode reverseList(ListNode head) {
        ListNode first = head;
        ListNode reverse = null;
        while (first != null) {
            ListNode temp = first.next;
            first.next = reverse;
            reverse = first;
            first = temp;
        }
        return reverse;
    }
    
    /**
     * 141. Linked List Cycle
     * 
     * https://leetcode.com/problems/linked-list-cycle/description/
     * 
     * @param head
     * @return 
     */
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        
        while (slow != null) {
            slow = slow.next;
            if (fast != null && fast.next != null) {
                fast = fast.next.next;
            } else {
                return false;
            }
            if (slow == fast)
                return true;
        }
        return false;
    }
}
