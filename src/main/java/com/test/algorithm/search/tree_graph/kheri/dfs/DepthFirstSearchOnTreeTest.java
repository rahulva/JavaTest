package com.test.algorithm.search.tree_graph.kheri.dfs;

import com.test.algorithm.search.tree_graph.kheri.Tree;

import java.util.Optional;

/**
 * https://kheri.net/depth-first-search-dfs-algorithm-with-java-examples/
 */
public class DepthFirstSearchOnTreeTest {

    public static void main(String[] args) {
        DepthFirstSearchOnTree<Integer> searchHelper = new DepthFirstSearchOnTree<Integer>();
        Tree<Integer> rootNode = createTree();
        Integer searchValue = 7;
        Optional<Tree<Integer>> result = searchHelper.search(rootNode, searchValue);
        if (result.isPresent()) {
            System.out.println("Search completed successfully [" + result.get() + "]");
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
