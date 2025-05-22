import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = Integer.parseInt(input.nextLine());
            for (int i = 0; i < n; i++) {
                String x = input.nextLine();
                if (x.length() < 10) {
                    System.out.println(x);
                } else {
                    System.out.println(x.charAt(0) + String.valueOf(x.length() - 2) + x.charAt(x.length() - 1));
                }
            }
        }
    }
}