import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int k = input.nextInt();

            int thresholdIndex = k-1;
            int[] scores = new int[n];
            for(int i = 0 ;i < n;i++){
                scores[i] = input.nextInt();
            }

            int threshold = scores[thresholdIndex];
            System.out.println(Arrays.stream(scores).filter(x -> x>= threshold && x>0).count());
        }
    }
}
