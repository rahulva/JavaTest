package com.test.algorithm.search.tree_graph.kheri.bfs;

import com.test.algorithm.search.tree_graph.kheri.Tree;

import java.util.Optional;

/**
 * https://kheri.net/breadth-first-search-bfs-algorithm-with-java-examples/
 */
public class BreathFirstSearchOnTreeTest {
    public static void main(String[] args) {
        BreathFirstSearchOnTree<Integer> searchHelper = new BreathFirstSearchOnTree<>();
        Tree<Integer> nodeTree = createTree();
        Integer searchValue = 7;
        Optional<Tree<Integer>> results = searchHelper.search(nodeTree, searchValue);

        if (results.isPresent()) {
            System.out.println("Search completed successfully [" + results.get() + "]");
        } else {
            System.out.println("Node [" + searchValue + "] is not found");
        }
    }

    private static Tree<Integer> createTree() {
        // Create Tree
        Tree<Integer> rootNode = new Tree<Integer>(1);

        Tree<Integer> child1 = rootNode.addChild(2);
        child1.addChild(4);
        child1.addChild(5);

        Tree<Integer> child2 = rootNode.addChild(3);
        child2.addChild(6);
        child2.addChild(7);
        return rootNode;
    }
}
