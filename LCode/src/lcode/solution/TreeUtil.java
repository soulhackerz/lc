/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcode.solution;

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
}
