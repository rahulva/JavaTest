package com.test.algorithm.search.tree_graph.dfs;

public class ShortestPathBetweenCellsBFSPrintPath {
    private static class Cell {
        int x;
        int y;
        int distance;
        Cell prev; //parent cell in the path

        public Cell(int x, int y, int distance, Cell prev) {
            this.x = x;
            this.y = y;
            this.distance = distance;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "Cell{" +
                    "x=" + x +
                    ", y=" + y +
                    ", distance=" + distance +
                    ", prev=" + prev +
                    '}';
        }
    }

    public static void shortestPath(int[][] matrix, int[] start, int[] end){
        int startX = start[0], startY= start[1];
        int endX = end[0], endY= start[1];
    }
}
