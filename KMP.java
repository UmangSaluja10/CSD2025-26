package q73815;

import java.util.*;

public class CTJ73815 {

    static int[] buildLPS(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];

        int len = 0;
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String pattern = sc.nextLine();

        int n = text.length();
        int m = pattern.length();

        int[] lps = buildLPS(pattern);

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < n) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {
                ans.add(i - j);
                j = lps[j - 1];
            } else if (i < n && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        if (ans.size() == 0) {
            System.out.print("No Match");
        } else {
            for (int x : ans) {
                System.out.print(x + " ");
            }
        }
    }
}
