package com.test.algorithm.search.tree_graph.kheri.bfs;

import com.test.algorithm.search.tree_graph.kheri.Graph;

import java.util.Optional;

/**
 * https://kheri.net/breadth-first-search-bfs-algorithm-with-java-examples/
 */
public class BreathFirstSearchOnGraphTest {
    public static void main(String[] args) {
        BreathFirstSearchOnGraph<Integer> searchHelper = new BreathFirstSearchOnGraph<Integer>();

        Graph<Integer> rootNode = createGraph();

        Integer searchValue = 7;
        Optional<Graph<Integer>> result = searchHelper.search(rootNode, searchValue);
        if (result.isPresent()) {
            System.out.println("Search completed successfully [" + result.get() + "]");
        } else {
            System.out.println("Node [" + searchValue + "] is not found");
        }
    }

    private static Graph<Integer> createGraph() {
        // Create Graph
        Graph<Integer> rootNode = new Graph<Integer>(1);
        Graph<Integer> node2 = new Graph<Integer>(2);
        Graph<Integer> node3 = new Graph<Integer>(3);
        Graph<Integer> node6 = new Graph<Integer>(6);

        rootNode.connect(node2);
        rootNode.connect(node6);
        rootNode.connect(node3);

        node2.connect(new Graph<Integer>(4));
        node2.connect(new Graph<Integer>(5));
        node2.connect(node6);

        node3.connect(node6);
        node3.connect(new Graph<Integer>(7));

        return rootNode;
    }
}
