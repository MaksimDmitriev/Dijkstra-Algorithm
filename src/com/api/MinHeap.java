package com.api;

class MinHeap implements MinPriorityQueue {

    private final int[] data;
    private int size;

    MinHeap(int[] data) {
        this.data = data;
        this.size = data.length;
    }

    @Override
    public int extractMin() {
        int min = data[0];
        size--;

        return min;
    }

    private void sink(int index) {
        int leftIndex = getLeft(index);
        int rightIndex = getRight(index);
    }

    private int getLeft(int index) {
        return 2 * index + 1;
    }

    private int getRight(int index) {
        return 2 * index + 2;
    }
}
