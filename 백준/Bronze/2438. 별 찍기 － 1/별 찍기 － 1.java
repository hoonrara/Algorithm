import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String s = "*";

        for (int i = 1; i < N + 1; i++) {
            System.out.println(s);
            s = s + "*";
        }
    }
}
