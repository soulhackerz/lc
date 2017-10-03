/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcode.solution;

import java.util.HashSet;
import java.util.Set;
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
    
    /**
     * 237. Delete Node in a Linked List
     * https://leetcode.com/problems/delete-node-in-a-linked-list/description/
     * 
     * @param node 
     */
    public void deleteNode(ListNode node) {
        if (node != null && node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
    
    /**
     * 83. Remove Duplicates from Sorted List
     * https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
     * 
     * @param node 
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        Set<Integer> hs = new HashSet();
        ListNode temp = head;
        ListNode prev = head;
        
        while (temp != null) {
            if (!hs.contains(temp.val)) {
                hs.add(temp.val);
                prev = temp;
            } else {
                prev.next = temp.next;
            }
            temp = temp.next;
        }
       return head;
    }
}
