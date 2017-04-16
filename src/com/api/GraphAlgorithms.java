package com.api;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class GraphAlgorithms {

    private GraphAlgorithms() {
        throw new AssertionError();
    }

    public static Set<DijkstraVertex> dijkstra(Graph graph, int source) {
        if (!graph.hasVertex(source)) {
            return Collections.EMPTY_SET;
        }
        Set<DijkstraVertex> shortestPaths = new HashSet<>();

        return shortestPaths;
    }

    private static void initDijkstraNodes(Graph graph) {

    }

}
