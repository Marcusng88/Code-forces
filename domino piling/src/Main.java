import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            int m = input.nextInt();
            int n = input.nextInt();

            int product  = m * n;
            System.out.println(product / 2);
        }

    }
}
