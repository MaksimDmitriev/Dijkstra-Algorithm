package com.api;

import org.junit.jupiter.api.Test;

class MinHeapTest {

    @Test
    void assertExtractMin() {
        DijkstraVertex[] data = {
                new DijkstraVertex(new Vertex(10)),
                new DijkstraVertex(new Vertex(3)),
                new DijkstraVertex(new Vertex(1)),
                new DijkstraVertex(new Vertex(89)),
                new DijkstraVertex(new Vertex(8))
        };

        data[0].setDistance(3);
        data[1].setDistance(1);
        data[2].setDistance(12);
        data[3].setDistance(8);
        data[4].setDistance(2);

//        MinHeap minPriorityQueue = new MinHeap(data);
//        assertEquals(data[1].getVertex(), minPriorityQueue.extractMin());
    }

}