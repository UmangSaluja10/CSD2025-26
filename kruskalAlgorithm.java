package q6481;

import java.util.*;

public class CTP6481 {

    static int find(int[] parent, int x) {
        if (parent[x] == x) {
            return x;
        }
        return find(parent, parent[x]);
    }

    static void union(int[] parent, int x, int y) {
        int px = find(parent, x);
        int py = find(parent, y);
        parent[px] = py;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        int[][] edges = new int[E][3];

        for (int i = 0; i < E; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
            edges[i][2] = sc.nextInt();
        }

        Arrays.sort(edges, (a, b) -> a[2] - b[2]);

        int[] parent = new int[V];

        for (int i = 0; i < V; i++) {
            parent[i] = i;
        }

        int cost = 0;
        int count = 0;

        for (int i = 0; i < E; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];

            if (find(parent, u) != find(parent, v)) {
                union(parent, u, v);
                System.out.println(u + " " + v + " " + w);
                cost += w;
                count++;
            }

            if (count == V - 1) {
                break;
            }
        }

        System.out.println(cost);
    }
}
