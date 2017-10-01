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
}
