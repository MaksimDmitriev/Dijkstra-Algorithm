package com.api;

import com.sun.istack.internal.NotNull;

import java.util.HashSet;
import java.util.Set;

/**
 * Store graph	{\displaystyle O(|V|+|E|)}
 * Add edge	{\displaystyle O(1)}
 * Remove vertex	{\displaystyle O(|E|)}
 * Remove edge	{\displaystyle O(|V|)}
 * Query: are vertices x and y adjacent? (assuming that their storage positions are known)	{\displaystyle O(|V|)}
 */

public class Graph {

    private final Set<Vertex> vertices;

    public Graph(int... keys) {
        vertices = new HashSet<>();
        addAllVertices(keys);
    }

    public void addAllVertices(@NotNull int... keys) {
        for (int key : keys) {
            addVertex(key);
        }
    }

    public void addVertex(int vertexKey) {
        Vertex vertex = findVertex(vertexKey);
        if (vertex != null) {
            vertices.add(vertex);
        }
    }

    public boolean hasVertex(int key) {
        return findVertex(key) == null;
    }

    Vertex findVertex(int key) {
        Vertex vertex = new Vertex(key);
        if (vertices.contains(vertex)) {
            return null;
        } else {
            return vertex;
        }
    }
}
