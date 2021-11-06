package com.test.algorithm.search.tree_graph.kheri;

import java.util.LinkedList;
import java.util.List;

public class Tree<T> {
    private T value;
    private List<Tree<T>> children;

    public Tree(T value) {
        this.value = value;
        this.children = new LinkedList<>();
    }

    public Tree<T> addChild(T child) {
        Tree tree = new Tree(child);
        this.children.add(tree);
        return tree;
    }

    public T getValue() {
        return value;
    }

    public List<Tree<T>> getChildren() {
        return children;
    }

    @Override
    public String toString() {
//        return "Tree{" +
//                "value=" + value +
//                ", children=" + children +
//                '}';
        return String.valueOf(this.value);
    }
}
