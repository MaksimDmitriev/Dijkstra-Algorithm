package com.api;

interface MinPriorityQueue {

    Vertex extractMin();

    boolean isEmpty();

    void insert(Vertex vertex);
}
