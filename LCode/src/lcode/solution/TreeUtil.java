/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcode.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import lcode.lib.TreeNode;

/**
 *
 * @author soulhackerz
 */
public class TreeUtil {
    
    /**
     * 235. Lowest Common Ancestor of a Binary Search Tree
     * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/
     * 
     * @param node 
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root) {
            return root;
        }
        TreeNode leftA = lowestCommonAncestor(root.left, p, q);
        TreeNode leftB = lowestCommonAncestor(root.right, p, q);
        
        if (leftA != null && leftB != null)
            return root;
        
        if (leftA == null) {
            return leftB;
        }
        return leftA;
    }
    
    /**
     * 111. Minimum Depth of Binary Tree
     * https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
     * 
     * @param node 
     */
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.min(minDepth(root.right), minDepth(root.left))+1;
    } 
    
    /**
     * 102. Binary Tree Level Order Traversal
     * https://leetcode.com/problems/binary-tree-level-order-traversal/description/
     * 
     * @param node 
     */    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        int count = 0;
        int level = 1;
        List<Integer> tempResult = new ArrayList();
        while(!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            level --;
            if (temp.left != null) {
                queue.add(temp.left);
                count++;
            }
            if (temp.right != null) {
                queue.add(temp.right);
                count++;
            }
            tempResult.add(temp.val);
            if (level == 0) {
                level = count;
                count = 0;
                result.add(tempResult);
                tempResult = new ArrayList();
            }
        }
        
        return result;
    }
}
