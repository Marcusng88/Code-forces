import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int count = 0;
            int range = input.nextInt();
            int[] array = new int[3];
            for (int i = 0; i < range; i++) {
                array[0] = input.nextInt();
                array[1] = input.nextInt();
                array[2] = input.nextInt();
                
                if (Arrays.stream(array).sum() >=2){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
