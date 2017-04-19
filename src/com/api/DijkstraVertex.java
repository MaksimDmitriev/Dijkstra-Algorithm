package com.api;

final class DijkstraVertex implements Comparable<DijkstraVertex> {

    private Vertex vertex;
    private Vertex previous;
    private int distance;

    DijkstraVertex(Vertex vertex) {
        this.vertex = vertex;
    }

    Vertex getVertex() {
        return vertex;
    }

    int getDistance() {
        return distance;
    }

    void setDistance(int distance) {
        checkDistance(distance);
        this.distance = distance;
    }

    void setPrevious(Vertex previous) {
        this.previous = previous;
    }

    private void checkDistance(int distance) {
        if (distance < 0) {
            throw new IllegalArgumentException("distance must be non-negative");
        }
    }

    @Override
    public int compareTo(DijkstraVertex o) {
        if (distance < o.distance) {
            return -1;
        } else if (distance > o.distance) {
            return 1;
        } else {
            return 0;
        }
    }
}
