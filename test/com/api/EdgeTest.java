package com.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class EdgeTest {

    @Test
    void assertEqualEdgesHaveEqualHashCodes() {
        Edge edge1 = new Edge(1, 2);
        Edge edge2 = new Edge(1, 2);
        assertEquals(edge1.hashCode(), edge2.hashCode());
    }

    @Test
    void assertEdgeEqualToItself() {
        Edge edge1 = new Edge(1, 2);
        Edge edge2 = edge1;
        assertEquals(edge1, edge2);
    }

    @Test
    void assertEdgesWithSameVerticesAreEqual() {
        Edge edge1 = new Edge(1, 2);
        Edge edge2 = new Edge(1, 2);
        assertEquals(edge1, edge2);
    }

    @Test
    void assertEdgesWithDifferentSourceVertices_NotEqual() {
        Edge edge1 = new Edge(1, 2);
        Edge edge2 = new Edge(0, 2);
        assertNotEquals(edge1, edge2);
    }

    @Test
    void assertEdgesWithDifferentDestinationVertices_NotEqual() {
        Edge edge1 = new Edge(1, 2);
        Edge edge2 = new Edge(1, 34);
        assertNotEquals(edge1, edge2);
    }

    @Test
    void assertOppositeEdgesAreNotEqual() {
        Edge edge1 = new Edge(1, 2);
        Edge edge2 = new Edge(2, 1);
        assertNotEquals(edge1, edge2);
    }
}