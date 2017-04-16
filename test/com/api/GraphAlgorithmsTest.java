package com.api;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GraphAlgorithmsTest {

    @Test
    void assertEmptySetOfPathsWhenNoSourceInGraph() {
        Graph graph = new Graph(1);
        Set<DijkstraVertex> shortestPaths = GraphAlgorithms.dijkstra(graph, 2);
        assertEquals(Collections.EMPTY_SET, shortestPaths);
    }

}