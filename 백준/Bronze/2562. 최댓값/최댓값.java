import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int B = 1;

        for (int i = 1; i <= 9; i++) {
            int A = sc.nextInt();
            if (max < A){
                max = A;
                B = i;
            }
        }
        System.out.println(max);
        System.out.println(B);
    }
}
