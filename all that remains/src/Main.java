import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            int cases = input.nextInt();

            for (int i = 0; i < cases; i++) {
                int k = input.nextInt();
                int c = input.nextInt();

                if (k == 0 || c == 0) {
                    System.out.println(c);
                    continue;
                }
                
                int[] positions = new int[k];
                for (int j = 0; j < k; j++) {
                    positions[j] = input.nextInt();
                }

                System.out.println(efficientSolution(positions, c));
            }
        }
    }

    public static int efficientSolution(int[] positions, int chickens) {
        
        while (chickens >= positions[0]) {
            int validCount = 0;
            for (int pos : positions) {
                if (pos <= chickens) {
                    validCount++;
                } else {
                    break; 
                }
            }
            

            if (validCount == positions.length && chickens >= validCount * 2) {
                int fullRounds = (chickens - positions[0] + 1) / validCount;
                chickens -= fullRounds * validCount;
            } else {
                chickens -= validCount;
            }
        }
        
        return chickens;
    }
}