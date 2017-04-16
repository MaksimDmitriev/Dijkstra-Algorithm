package com.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VertexTest {

    @Test
    void assertCorrectKeyReturned() {
        int key = 12;
        Vertex vertex = new Vertex(key);
        assertEquals(key, vertex.getKey());
    }

    @Test
    void assertVertexEqualToItself() {
        int key = 90;
        Vertex vertex1 = new Vertex(key);
        Vertex vertex2 = vertex1;
        assertEquals(vertex1, vertex2);
    }

    @Test
    void assertEqualsSymmetric() {
        int key = 90;
        Vertex vertex1 = new Vertex(key);
        Vertex vertex2 = new Vertex(key);
        Vertex vertex3 = new Vertex(key);
        assertTrue(vertex1.equals(vertex2));
        assertTrue(vertex2.equals(vertex3));
        assertTrue(vertex1.equals(vertex3));
    }

    @Test
    void assertEqualsTransitive() {
        int key = 90;
        Vertex vertex1 = new Vertex(key);
        Vertex vertex2 = new Vertex(key);
        assertEquals(vertex1, vertex2);
        assertEquals(vertex2, vertex1);
    }

    @Test
    void assertVerticesWithEqualKeysAreEqual() {
        int key = 90;
        Vertex vertex1 = new Vertex(key);
        Vertex vertex2 = new Vertex(key);
        assertEquals(vertex1, vertex2);
    }

    @Test
    void assertVerticesWithNonEqualKeysAreNotEqual() {
        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        assertNotEquals(vertex1, vertex2);
    }

    @Test
    void assertVertexNotEqualToInstanceOfAnotherClass() {
        Object vertex = new Vertex(12);
        Object object = new Object();
        assertNotEquals(vertex, object);
    }
}