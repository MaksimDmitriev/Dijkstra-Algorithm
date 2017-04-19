package com.api;

import com.sun.istack.internal.NotNull;

class MinHeap implements MinPriorityQueue {

    private final DijkstraVertex[] dijkstraVertices;
    private final int maxSize;
    private int size;

    MinHeap(int maxSize, @NotNull DijkstraVertex... dijkstraVertices) {
        this.dijkstraVertices = dijkstraVertices;
        this.size = dijkstraVertices.length;
        this.maxSize = maxSize;
        buildMinHeap();
    }

    private void buildMinHeap() {
        for (int i = getParent(maxSize - 1); i >= 0; i--) {
            sink(i);
        }
    }

    @Override
    public Vertex extractMin() {
        Vertex min = dijkstraVertices[0].getVertex();
        swap(0, maxSize - 1);
        size--;
        sink(0);
        return min;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void insert(Vertex vertex) {

    }

    private void sink(int index) {
        int leftIndex = getLeft(index);
        int rightIndex = getRight(index);
        int minIndex = index;
        if (leftIndex < maxSize && dijkstraVertices[leftIndex].compareTo(dijkstraVertices[minIndex]) < 0) {
            minIndex = leftIndex;
        }
        if (rightIndex < maxSize && dijkstraVertices[rightIndex].compareTo(dijkstraVertices[minIndex]) < 0) {
            minIndex = rightIndex;
        }
        if (minIndex != index) {
            swap(index, minIndex);
            sink(minIndex);
        }
    }

    private void swap(int i, int j) {
        DijkstraVertex temp = dijkstraVertices[i];
        dijkstraVertices[i] = dijkstraVertices[j];
        dijkstraVertices[j] = temp;
    }

    private int getLeft(int index) {
        return 2 * index + 1;
    }

    private int getRight(int index) {
        return 2 * index + 2;
    }

    private int getParent(int index) {
        return (index - 1) / 2;
    }

}
