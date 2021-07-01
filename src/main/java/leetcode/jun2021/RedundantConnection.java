package leetcode.jun2021;

import java.util.Arrays;

public class RedundantConnection {
    int MAX_EDGE_VAL = 1000;

    public int[] findRedundantConnection(int[][] edges) {
        DSU dsu = new DSU(MAX_EDGE_VAL + 1);

        for (int[] edge : edges) {
            if (!dsu.union(edge[0], edge[1])) return edge;
        }
        throw new AssertionError();

    }
}

class DSU {
    int[] parent;
    int[] rank;

    public DSU(int size) {
        parent = new int[size];
        for (int i = 0; i < size; i++) parent[i] = i;
        rank = new int[size];
    }

    public int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }

    public boolean union(int x, int y) {
        int xr = find(x), yr = find(y);
        if (xr == yr) {
            return false;
        } else if (rank[xr] < rank[yr]) {
            parent[xr] = yr;
        } else if (rank[xr] > rank[yr]) {
            parent[yr] = xr;
        } else {
            parent[yr] = xr;
            rank[xr]++;
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DSU dsu = (DSU) o;
        return Arrays.equals(parent, dsu.parent) && Arrays.equals(rank, dsu.rank);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(parent);
        result = 31 * result + Arrays.hashCode(rank);
        return result;
    }
}


