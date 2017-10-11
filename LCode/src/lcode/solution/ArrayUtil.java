/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcode.solution;

/**
 *
 * @author soulhackerz
 */
public class ArrayUtil {
    
    /**
     * 695. Max Area of Island
     * 
     * https://leetcode.com/problems/max-area-of-island/description/
     */
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null)
            return 0;
        boolean[][] gridVisited = new boolean[grid.length][grid[0].length];
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int temp = 0;
                if (!gridVisited[i][j] && (temp = maxAreaOfIslandHelper(grid, gridVisited,i,j,temp))>maxArea) {
                    maxArea = temp;
                }
            }
        }
        return maxArea;
    }
    
    private int maxAreaOfIslandHelper(int[][] grid, boolean[][] visited, int i, int j, int size) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visited[i][j] || grid[i][j] != 1)
            return size;
        if (grid[i][j] == 1) {
            size++;
            visited[i][j] = true;
        } 
        size = maxAreaOfIslandHelper(grid, visited, i+1, j, size);
        size = maxAreaOfIslandHelper(grid, visited, i-1, j, size);
        size = maxAreaOfIslandHelper(grid, visited, i, j+1, size);
        size = maxAreaOfIslandHelper(grid, visited, i, j-1, size);
        
        return size;
    }
}
