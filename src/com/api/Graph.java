package com.api;

import com.sun.istack.internal.NotNull;

import java.util.Collections;
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
    private final Set<Edge> edges;

    public Graph(int... keys) {
        vertices = new HashSet<>();
        edges = new HashSet<>();
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

    public void addEdge(int from, int to) {
        Edge edge = findEdge(from, to);
        if (edge != null) {
            edges.add(edge);
        }
    }

    public boolean hasEdge(int from, int to) {
        return findEdge(from, to) == null;
    }

    Edge findEdge(int from, int to) {
        Edge edge = new Edge(from, to);
        if (edges.contains(edge)) {
            return null;
        } else {
            return edge;
        }
    }

    Set<Vertex> getVertices() {
        return Collections.unmodifiableSet(vertices);
    }

    int getVertexCount() {
        return vertices.size();
    }
}
