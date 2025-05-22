import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            input.nextLine();
            int res = 0;
            
            for(int i = 0; i<n ; i++){
                
                String operation = input.nextLine();
                if(operation.contains("+")){
                    res++;
                }
                else{
                    res--;
                }
            }
            System.out.println(res);
        }
    }
}