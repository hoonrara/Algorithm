

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[6];

        for (int i = 0; i < 6; i++) {
            A[i] = sc.nextInt();
        }


        int[] B = {1, 1, 2, 2, 2, 8};


        int[] C = new int[6];

        for (int i = 0; i <= 5; i++) {
            C[i] = B[i] - A[i];

        }
        for (int i = 0; i <= 5; i++) {
            System.out.print(C[i] + " ");
        }

    }
}
