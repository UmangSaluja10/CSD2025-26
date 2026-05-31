package q27805;

import java.util.*;

public class CTJ27805 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] start = new int[N];
        int[] end = new int[N];

        for (int i = 0; i < N; i++) {
            start[i] = in.nextInt();
        }

        for (int i = 0; i < N; i++) {
            end[i] = in.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (end[i] > end[j]) {
                    int temp = end[i];
                    end[i] = end[j];
                    end[j] = temp;

                    temp = start[i];
                    start[i] = start[j];
                    start[j] = temp;
                }
            }
        }

        int count = 0;
        int lastEnd = -1;

        for (int i = 0; i < N; i++) {
            if (start[i] > lastEnd) {
                count++;
                lastEnd = end[i];
            }
        }

        System.out.println(count);
    }
}
