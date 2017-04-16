package com.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    void assertAddedVertexFound() {
        Graph graph = new Graph();
        int key = 12;
        graph.addVertex(key);
        assertNull(graph.findVertex(key));
    }

    @Test
    void assertNotAddedVertexNotFound() {
        Graph graph = new Graph();
        int key = 12;
        graph.addVertex(key);
        assertNotNull(graph.findVertex(13));
    }

    @Test
    void assertVertexAdded() {
        Graph graph = new Graph();
        int key = 12;
        graph.addVertex(key);
        assertTrue(graph.hasVertex(key));
    }

    @Test
    void assertVertexFound() {

    }

    @Test
    void assertVertexNotFound() {

    }
}