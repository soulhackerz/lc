/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcode;

import java.util.List;
import lcode.lib.ListNode;
import lcode.lib.TreeNode;
import lcode.solution.AmzUtil;
import lcode.solution.ArrayUtil;
import lcode.solution.ListUtil;
import lcode.solution.TreeUtil;

/**
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testAmz02();
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
    
    /**
     * 235. Lowest Common Ancestor of a Binary Search Tree
     * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/
     * 
     * @param node 
     */
    public static void test235() {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        a.left = b;
        a.right = c;
        
        TreeUtil tu = new TreeUtil();
        System.out.println(tu.lowestCommonAncestor(a, b, c));
    }
    
    
    /**
     * 111. Minimum Depth of Binary Tree
     * https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
     * 
     * @param node 
     */
    public static void test111() {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);        
        a.left = b;
        a.right = c;
        b.right = d;
        b.left = e;
        c.right = f;
        c.left = g;   
        
        TreeUtil tu = new TreeUtil();
        System.out.println(tu.minDepth(a));
    }
    
    /**
     * 102. Binary Tree Level Order Traversal
     * https://leetcode.com/problems/binary-tree-level-order-traversal/description/
     * 
     * @param node 
     */    
    public static void test102() {
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(15);
        TreeNode e = new TreeNode(7);
        TreeNode f = new TreeNode(22);
        TreeNode g = new TreeNode(33);        
        a.left = b;
        a.right = c;
        c.left = d;
        c.right = e;
        b.left = f;
        b.right = g;      
        TreeUtil tu = new TreeUtil();
        List<List<Integer>> result = tu.levelOrder(a);
        
        System.out.println(result);
    }
    
    /**
     * 695. Max Area of Island
     * 
     * https://leetcode.com/problems/max-area-of-island/description/
     */  
    public static void test695() {
        int[][] input = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
 {0,0,0,0,0,0,0,1,1,1,0,0,0},
 {0,1,1,0,1,0,0,0,0,0,0,0,0},
 {0,1,0,0,1,1,0,0,1,0,1,0,0},
 {0,1,0,0,1,1,0,0,1,1,1,0,0},
 {0,0,0,0,0,0,0,0,0,0,1,0,0},
 {0,0,0,0,0,0,0,1,1,1,0,0,0},
 {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        ArrayUtil au = new ArrayUtil();
        System.out.println(au.maxAreaOfIsland(input));
    }     
    
    /**
     * Amz 02
     * Reads in a text file and checks to see if the paretheses, curly
     * braces, and square brackets are balanced.
     */  
    public static void testAmz02() {
        String abc = "aerer([bbb)]e";
        AmzUtil az = new AmzUtil();
        System.out.println(az.isBalanced((abc)));
    }        
}
