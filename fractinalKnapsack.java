package q31099;

import java.util.*;

public class CTJ31099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int w = sc.nextInt();

        int[] value = new int[n];
        int[] weight = new int[n];
        double[] ratio = new double[n];

        for (int i = 0; i < n; i++) {
            value[i] = sc.nextInt();
            weight[i] = sc.nextInt();
            ratio[i] = (double) value[i] / weight[i];
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ratio[i] < ratio[j]) {
                    double tempRatio = ratio[i];
                    ratio[i] = ratio[j];
                    ratio[j] = tempRatio;

                    int tempValue = value[i];
                    value[i] = value[j];
                    value[j] = tempValue;

                    int tempWeight = weight[i];
                    weight[i] = weight[j];
                    weight[j] = tempWeight;
                }
            }
        }

        double totalValue = 0.0;
        int currentWeight = 0;

        for (int i = 0; i < n; i++) {
            if (currentWeight + weight[i] <= w) {
                totalValue += value[i];
                currentWeight += weight[i];
            } else {
                int remaining = w - currentWeight;
                totalValue += ratio[i] * remaining;
                break;
            }
        }

        System.out.printf("%.6f", totalValue);
    }
}
