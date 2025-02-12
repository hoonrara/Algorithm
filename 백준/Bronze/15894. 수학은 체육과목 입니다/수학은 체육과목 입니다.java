
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long answer = 0;


        for (long i = 0; i < n; i++) {
            answer += 4;
        }
        System.out.println(answer);


    }
}
