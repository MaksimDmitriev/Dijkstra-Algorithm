package com.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinHeapTest {

    @Test
    void assertExtractMin() {
        int[] data = {
                10, 3, 1, 89, 8
        };
        MinHeap minPriorityQueue = new MinHeap(data);
        assertEquals(minPriorityQueue.extractMin(), 1);
    }

}