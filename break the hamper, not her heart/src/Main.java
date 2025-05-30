
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int[] items = new int[n];
            int total = 0;
            for (int i = 0; i < n; i++) {
                items[i] = input.nextInt();
                total += items[i];
            }
            int max = total / 2;

            // DP array
            boolean[] dp = new boolean[max + 1];
            dp[0] = true;

            for (int item : items) {
                for (int j = max; j >= item; j--) {
                    dp[j] = dp[j] || dp[j - item];
                }
            }

            // Find the best value <= max
            for (int i = max; i >= 0; i--) {
                if (dp[i]) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

}
