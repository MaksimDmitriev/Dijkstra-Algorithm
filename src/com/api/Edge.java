package com.api;

final class Edge {

    private final int from;
    private final int to;
    private final int distance;

    Edge(int from, int to) {
        this(from, to, 1);
    }

    Edge(int from, int to, int distance) {
        this.from = from;
        this.to = to;
        this.distance = distance;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + from;
        result = 31 * result + to;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Edge)) {
            return false;
        }
        Edge other = (Edge) obj;
        return other.from == from && other.to == to;
    }
}
