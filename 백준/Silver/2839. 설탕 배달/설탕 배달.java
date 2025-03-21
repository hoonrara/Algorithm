
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int result = 0;

        for (int i = N/5; i >= 0; i--) {
            for (int j = N / 3; j >= 0; j--) {

                if (5 * i + 3 * j == N) {
                    result = i + j;
                    System.out.println(result);
                    break;
                }
            }
            if (result!=0) break;

        }

        if (result == 0) {
            System.out.println(-1);

        }


    }
}
