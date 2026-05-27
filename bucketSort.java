package q91282;

import java.util.*;

public class CTJ91282 {

    static void bucketSort(double[] arr) {

        int n = arr.length;

        ArrayList<Double>[] bucket = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            int index = (int)(arr[i] * n);
            bucket[index].add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(bucket[i]);
        }

        int k = 0;

        for (int i = 0; i < n; i++) {
            for (double num : bucket[i]) {
                arr[k++] = num;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        bucketSort(arr);

        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f", arr[i]);

            if (i < n - 1) {
                System.out.print(" ");
            }
        }
    }
}
