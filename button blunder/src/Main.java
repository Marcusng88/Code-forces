import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int d = input.nextInt();
            int z = input.nextInt();
            int a = input.nextInt();
 
            for (int ageA = 3; ageA <= 100; ageA++){
                int ageZ = ageA +d;
 
                int testA = sumInRange(3, ageA);
                int testZ = sumInRange(4, ageZ);
 
                int diffZ = z- testZ;
                int diffA = testA - a;
 
                if (diffZ == diffA) {
                    System.out.println(diffA);
                    break;
                }
            }
        }
    } 
 
    public static int sumInRange(int start, int end){
        int endY = end * (end+1) / 2;
        int startX = (start-1) * start/2;
        return endY-startX;
    }
}
