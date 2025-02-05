

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int Q = 25;
        int D = 10;
        int N = 5;
        int P = 1;


        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        for (int i = 0; i < K; i++) {

            int money = sc.nextInt();

            System.out.println((money/Q)+" " + (money%Q/D)+" "+(money%Q%D/N)+" "+(money%Q%D%N/P));
        }
    }
}
