package com.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GraphTest {

    @Test
    void assertHasAddedVertex() {
        Graph graph = new Graph();
        int key = 12;
        graph.addVertex(key);
        assertFalse(graph.hasVertex(key + 1));
    }

    @Test
    void assertHasNot_NotAddedVertex() {
        Graph graph = new Graph();
        int key = 12;
        graph.addVertex(key);
        assertFalse(graph.hasVertex(key + 1));
    }

    @Test
    void assertHasAllAddedVertices() {
        Graph graph = new Graph();
        int[] keys = {
                1, 2, 3
        };
        for (int key : keys) {
            graph.addVertex(key);
        }
        for (int key : keys) {
            assertTrue(graph.hasVertex(key));
        }
    }

    @Test
    void assertHasAddedEdge() {
        Graph graph = new Graph();
        int from = 1;
        int to = 2;
        graph.addAllVertices(from, to);
        graph.addEdge(from, to);
        assertTrue(graph.hasEdge(from, to));
    }

    @Test
    void assertHasNot_NotAddedEdge() {
        Graph graph = new Graph();
        int from = 1;
        int to = 2;
        graph.addAllVertices(from, to);
        graph.addEdge(to, from);
        assertFalse(graph.hasEdge(from, to));
    }
}