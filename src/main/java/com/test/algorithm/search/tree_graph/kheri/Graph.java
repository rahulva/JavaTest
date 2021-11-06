package com.test.algorithm.search.tree_graph.kheri;

import java.util.LinkedHashSet;
import java.util.Set;

public class Graph<T> {
    private T value;
    private Set<Graph<T>> neighbors;

    public Graph(T value) {
        this.value = value;
        this.neighbors = new LinkedHashSet<>();
    }
    public Graph<T> connect(Graph<T> neighbor) {
        if(this==neighbor) {
            throw new IllegalArgumentException("Can't connect to itself");
        }
        this.neighbors.add(neighbor);
        return neighbor;
    }

    public T getValue() {
        return value;
    }
    public Set<Graph<T>> getNeighbors() {
        return neighbors;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}