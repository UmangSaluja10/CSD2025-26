package q14746;

import java.util.*;

public class CTJ14746 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] tasks = new int[n];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            tasks[i] = in.nextInt();
            map.put(tasks[i], map.getOrDefault(tasks[i], 0) + 1);
        }

        int rounds = 0;

        for (int freq : map.values()) {
            if (freq == 1) {
                System.out.println(-1);
                return;
            }

            rounds += (freq + 2) / 3;
        }

        System.out.println(rounds);
    }
}
