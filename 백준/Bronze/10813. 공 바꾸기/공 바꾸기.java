import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] B = new int[N + 1];
        for (int index = 1; index <= N; index++) {
            B[index] = index;
        }

        for (int t = 1; t <= M; t++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int temp = B[j];
            B[j] = B[i];
            B[i] = temp;
        }


        for (int a = 1; a <= N; a++) {
            System.out.print(B[a] + " ");
        }
    }
}
