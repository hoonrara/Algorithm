import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i < T+1; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a+b));

        }
    }
}
