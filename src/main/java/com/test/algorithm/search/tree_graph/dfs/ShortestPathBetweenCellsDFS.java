package com.test.algorithm.search.tree_graph.dfs;

/**
 * #Global or class scope variables
 * n = number of nodes in the graph
 * g = adjacency list representing graph
 * visited = [false, ..] size n to mark the visited nodes
 * function dfs(at):
 *   if visited[at]:
 *     return
 *   visited[at] = true
 *
 *   neighbours = graph[at]
 *
 *   for next in neighbours:
 *     dfs(next)
 */
public class ShortestPathBetweenCellsDFS {

    // DFS, Time O(n^2), Space O(n^2)
    static int shortestPath(int[][] matrix, int[] start, int[] end) {
        int column = matrix.length;
        int row = matrix[0].length;

        //
        boolean[][] visited = new boolean[column][row];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                if (matrix[i][j] == 0) {
                    visited[i][j] = true;
                } else {
                    visited[i][j] = false;
                }
            }
        }
        int count = visitUntil(matrix, start, end, visited, Integer.MAX_VALUE, 0);
        return count;
    }


    static int visitUntil(int[][] matrix, int[] start, int[] end, boolean[][] visited, int shortest, int distance) {
        int start_x = start[0], start_y = start[1];
        int end_x = end[0], end_y = end[1];

        // if start or end is 0, or (x, y) pair is invalid, return
        if ((matrix[start_x][start_y] == 0 || matrix[end_x][end_y] == 0) || !isValid(matrix, start_x, start_y, visited)) {
            return Integer.MAX_VALUE;
        }

        // find destination
        if (start_x == end_x && start_y == end_y) {
            return Math.min(distance, shortest);
        }

        visited[start_x][start_y] = true;

        // move up
        if (isValid(matrix, start_x - 1, start_y, visited)) {
            shortest = visitUntil(matrix, new int[]{start_x - 1, start_y}, end, visited, shortest, distance + 1);
        }
        // move down
        if (isValid(matrix, start_x + 1, start_y, visited)) {
            shortest = visitUntil(matrix, new int[]{start_x + 1, start_y}, end, visited, shortest, distance + 1);
        }
        // move left
        if (isValid(matrix, start_x, start_y - 1, visited)) {
            shortest = visitUntil(matrix, new int[]{start_x, start_y - 1}, end, visited, shortest, distance + 1);
        }
        // move right
        if (isValid(matrix, start_x, start_y + 1, visited)) {
            shortest = visitUntil(matrix, new int[]{start_x, start_y + 1}, end, visited, shortest, distance + 1);
        }
        //backtracking
        visited[start_x][start_y] = false;
        return shortest;
    }

    static boolean isValid(int[][] matrix, int x, int y, boolean[][] visited) {
        if (x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length && matrix[x][y] == 1 && !visited[x][y]) {
            return true;
        } else {
            return false;
        }
    }
}
