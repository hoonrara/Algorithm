import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (B<45) {
            B = B+60;
            if (A == 0) A=23;
            else A = A-1;
        }
        B = B-45;
        System.out.println(A + " " + B);
    }
}