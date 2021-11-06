package com.test.algorithm.search.tree_graph.kheri.bfs;

import com.test.algorithm.search.tree_graph.kheri.Graph;

import java.util.*;

/**
 * https://kheri.net/breadth-first-search-bfs-algorithm-with-java-examples/
 * @param <T>
 */
public class BreathFirstSearchOnGraph<T> {

    public Optional<Graph<T>> search(Graph<T> startNode, Integer searchValue) {
        // STEP 1 : create queue to maintain the next node to be explored.
        Queue<Graph<T>> queue = new ArrayDeque<>();

        // STEP 2: add starting node to list to start the search.
        queue.add(startNode);
        // STEP 3: create a set for already visited nodes
        Set<Graph<T>> alreadyVisitedNodes = new HashSet<>();
        // STEP 4: Iterate until queue is empty
        int counter = 0;
        while (!queue.isEmpty()) {
            System.out.println("Iteration " + (++counter) + " Queue=" + queue);
            // STEP 4.a: get the node from the Queue
            Graph<T> currentNode = queue.remove();
            System.out.println("Get " + currentNode);

            // STEP 4.b : add current node to already visited set
            alreadyVisitedNodes.add(currentNode);

            if (currentNode.getValue().equals(searchValue)) {
                // STEP 4.c: if current node matched with search value, return it.
                return Optional.of(currentNode);
            } else {
                // STEP 4.d: add current node's children to queue, search continues...
                for (Graph<T> neighbor : currentNode.getNeighbors()) {
                    if (!queue.contains(neighbor) && !alreadyVisitedNodes.contains(neighbor)) {
                        queue.add(neighbor);
                    }
                }
            }
        }
        //STEP 5: Queue is empty that means searchValue doesn't exist in the tree.
        return Optional.empty();
    }
}
