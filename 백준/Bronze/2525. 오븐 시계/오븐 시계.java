import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        B = B+C;

        if (B >59) {
            A = (A+B/60)%24;
            B = B%60;
        }
        System.out.println(A + " " + B);
    }
}
