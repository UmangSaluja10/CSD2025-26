package q79162;

import java.util.*;

public class CTJ79162 {

    static int N;
    static List<int[]> solutions = new ArrayList<>();

    static void solve(int row, int[] board) {

        if (row == N) {
            solutions.add(board.clone());
            return;
        }

        for (int col = 0; col < N; col++) {

            if (safe(board, row, col)) {

                board[row] = col;

                solve(row + 1, board);
            }
        }
    }

    static boolean safe(int[] board, int row, int col) {

        for (int i = 0; i < row; i++) {

            int c = board[i];

            if (c == col ||
                Math.abs(i - row) == Math.abs(c - col)) {

                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        int[] board = new int[N];

        solve(0, board);

        if (solutions.size() == 0) {
            System.out.println(-1);
            return;
        }

        for (int[] sol : solutions) {

            for (int i = 0; i < N; i++) {

                System.out.print(sol[i]);

                if (i != N - 1)
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
