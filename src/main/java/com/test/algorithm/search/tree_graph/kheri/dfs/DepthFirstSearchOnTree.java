package com.test.algorithm.search.tree_graph.kheri.dfs;

import com.test.algorithm.search.tree_graph.kheri.Tree;

import java.util.Optional;
import java.util.Stack;

/**
 * https://kheri.net/depth-first-search-dfs-algorithm-with-java-examples/
 */
public class DepthFirstSearchOnTree<T> {
    public Optional<Tree<T>> search(Tree<T> startNode, Integer searchValue) {
        // STEP 1 : create stack to maintain the next node to explore
        Stack<Tree<T>> stack = new Stack<>();
        // STEP 2 : Add starting node to list to start the search
        stack.add(startNode);
        // STEP 3 : Iterate until stack is empty
        int counter = 0;
        while (!stack.isEmpty()) {
            System.out.println("Iteration " + (++counter) + " Stack=" + stack);
            // STEP 3.a : get the node from the stack
            Tree<T> currentNode = stack.pop();
            System.out.println("Pop " + currentNode);
            if (currentNode.getValue().equals(searchValue)) {
                // STEP 3.b : if the current node matched with the search value, return ot
                return Optional.of(currentNode);
            } else {
                // STEP 3.c : add current node's children to stack, search continue..
                stack.addAll(currentNode.getChildren());
            }
        }
        // STEP 4 : return if sack is empty
        return Optional.empty();
    }
}
