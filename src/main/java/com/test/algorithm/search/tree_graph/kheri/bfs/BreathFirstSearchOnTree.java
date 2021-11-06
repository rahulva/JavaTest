package com.test.algorithm.search.tree_graph.kheri.bfs;

import com.test.algorithm.search.tree_graph.kheri.Tree;

import java.util.ArrayDeque;
import java.util.Optional;
import java.util.Queue;

/**
 * https://kheri.net/breadth-first-search-bfs-algorithm-with-java-examples/
 * @param <T>
 */
public class BreathFirstSearchOnTree<T> {

    public Optional<Tree<T>> search(Tree<T> startNode, Integer searchValue) {
        // STEP 1 : create queue to maintain the next node to be explored
        final Queue<Tree<T>> queue = new ArrayDeque<>();

        // STEP 2 : add starting node to list to start the starch
        queue.add(startNode);

        // STEP 3: Iterate until queue is empty
        int counter = 0;
        while (!queue.isEmpty()) {
            System.out.println("Iteration " + (++counter) + " Queue=" + queue);

            // STEP 3.a : get the node from the Queue
            Tree<T> currentNode = queue.remove(); // Visited
            System.out.println("Get " + currentNode);

            if (currentNode.getValue().equals(searchValue)) {
                // STEP 3.b : If current node matched with the search value, return it.
                return Optional.of(currentNode);
            } else {
                // STEP 3.c : add current node's children to queue, search continues
                queue.addAll(currentNode.getChildren());
            }
        }
        // STEP 4 : Queue is empty, that means search value does not exist in the tree.
        return Optional.empty();
    }

    public static void main(String[] args) {

    }
}
