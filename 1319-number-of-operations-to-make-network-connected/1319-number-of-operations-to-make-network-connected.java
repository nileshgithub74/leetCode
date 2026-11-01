class DSU {
    int[] parent;
    int[] rank;

    public DSU(int n) {
        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;

        }
    }

    public int find(int node) {
        if (parent[node] == node) {
            return node;
        }
        return parent[node] = find(parent[node]);
    }

    public void union(int u, int v) {
        int pu = find(u);
        int pv = find(v);

        if (pu == pv)
            return;

        if (rank[pu] < rank[pv]) {
            parent[pu] = pv;
        } else if (rank[pu] > rank[pv]) {
            parent[pv] = pu;
        } else {
            parent[pu] = pv;
            rank[pv]++;
        }

    }

}

class Solution {
    public int makeConnected(int n, int[][] arr) {
        DSU dsu = new DSU(n);
        int extraedges = 0;
        int component = n;

        for (int[] ed : arr) {
            int u = ed[0];
            int v = ed[1];

            if (dsu.find(u) == dsu.find(v)) {
                extraedges++;
               
            }else{
                dsu.union(u, v);
                 component--;
            }

        }

        int ans = component-1;

        if(extraedges >= ans){
            return ans ;
        }
      return -1;

    }
}