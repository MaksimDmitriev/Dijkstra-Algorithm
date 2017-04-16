package com.api;

import java.util.HashSet;
import java.util.Set;

final class Vertex {

    private int key;
    private Set<Vertex> adjacentVertices;

    Vertex(int key) {
        this.key = key;
        this.adjacentVertices = new HashSet<>();
    }

    int getKey() {
        return key;
    }

    // TODO: When testing equals, should I make sure that it implements an equivalence relation (reflexive, transitive,
    // and symmetric)?
    // TODO: Also try http://jqno.nl/equalsverifier/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vertex)) {
            return false;
        }
        Vertex other = (Vertex) obj;
        return other.key == key;
    }

    @Override
    public int hashCode() {
        return key;
    }
}
