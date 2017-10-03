/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcode.lib;

/**
 *
 * @author soulhackerz
 */
public class ListNode {
    public int val;
    public ListNode next;
    
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    
    public ListNode(int val) {
        this.val = val;
    }
    
    public String toString() {
        ListNode temp = next;
        StringBuilder sb = new StringBuilder(val+"->");
        while (temp != null) {
            sb.append(temp.val + "->");
            temp = temp.next;
        }
        sb.append("\n");
        return new String(sb);
    }
}
