import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int x = input.nextInt();
            int n = input.nextInt();
            
            long[] arr = new long[x];
            for (int i = 0; i < x; i++) {
                arr[i] = input.nextLong();
            }
            
            long totalSum = 0;
            for (int i = 0; i < x; i++) {
                totalSum += arr[i];
            }
            
            long defaultValue = 0;
            boolean hasDefault = false;
            Map<Integer, Long> overrides = new HashMap<>();
            
            for (int j = 0; j < n; j++) {
                int c = input.nextInt();
                if (c == 1) {
                    int i = input.nextInt() - 1; // convert to 0-based index
                    long a = input.nextLong();
                    
                    long oldValue;
                    if (hasDefault && !overrides.containsKey(i)) {
                        oldValue = defaultValue;
                    } else if (hasDefault && overrides.containsKey(i)) {
                        oldValue = overrides.get(i);
                    } else {
                        oldValue = arr[i];
                    }
                    
                    totalSum = totalSum - oldValue + a;
                    
                    if (hasDefault) {
                        overrides.put(i, a);
                    } else {
                        arr[i] = a;
                    }
                    
                    System.out.println(totalSum);
                } else if (c == 2) {
                    long a = input.nextLong();
                    totalSum = a * x;
                    defaultValue = a;
                    hasDefault = true;
                    overrides.clear();
                    System.out.println(totalSum);
                }
            }
        }
    }
}