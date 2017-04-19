package com.api;

import com.sun.istack.internal.NotNull;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class GraphAlgorithms {

    private GraphAlgorithms() {
        throw new AssertionError();
    }

    public static Set<DijkstraVertex> dijkstra(@NotNull Graph graph, int source) {
        if (!graph.hasVertex(source)) {
            return Collections.EMPTY_SET;
        }

        Set<DijkstraVertex> shortestPaths = new HashSet<>();

//        DijkstraVertex sourceDijkstraVertex = new DijkstraVertex();
//        int vertexCount = graph.getVertexCount();
//        MinPriorityQueue unsettled = new MinHeap(vertexCount, sourceDijkstraVertex);
//        while(!unsettled.isEmpty()) {
//
//        }

        return shortestPaths;
    }

}
