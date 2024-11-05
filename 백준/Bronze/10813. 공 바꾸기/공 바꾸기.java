
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] x = new int[N + 1];

        int M = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            x[i] = i;
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int y = x[a];
            x[a] = x[b];
            x[b] = y;

        }

        for (int i = 1; i <= N; i++) {
            System.out.print(x[i] + " ");

        }
    }
}
