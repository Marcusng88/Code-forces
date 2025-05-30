import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            // cases
            int t = input.nextInt();
 
            // result;
            int[] res = new int[t];
 
            // loop every case
            for (int i = 0; i < t; i++) {
                // number of bubbles
                int n = input.nextInt();
                ArrayList<Long> array = new ArrayList<>();
                Map<Long, Integer> freq = new HashMap<>();
                
                long sum = 0;
                int counts = 0;
                for (int j = 0; j < n; j++) {
                    long e = input.nextLong();
                    array.add(e);
                    sum += e;
                    freq.put(e, freq.getOrDefault(e, 0) + 1);
 
                    if (sum == 0 && freq.getOrDefault(0L, 0) >= 1) {
                        counts++;
                    } else if (sum % 2 == 0) {
                        long half = sum / 2;
                        if (freq.getOrDefault(half, 0) >= 1) {
                            counts++;
                        }
                    }
                }
                res[i] = counts;
            }
 
            for (int element : res) {
                System.out.println(element);
            }
 
        }
 
    }
}