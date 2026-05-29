package q81158;

import java.util.*;

public class CTJ81158 {

    static int n, m, k;
    static int[][] edges;

    static boolean isVertexCover(int mask) {
        for (int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            if ((mask & (1 << u)) == 0 && (mask & (1 << v)) == 0) {
                return false;
            }
        }
        return true;
    }

    static int countVertices(int mask) {
        int count = 0;

        while (mask > 0) {
            count += mask & 1;
            mask = mask >> 1;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        edges = new int[m][2];

        for (int i = 0; i < m; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }

        int totalSubsets = 1 << n;

        for (int mask = 0; mask < totalSubsets; mask++) {
            if (countVertices(mask) <= k && isVertexCover(mask)) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
