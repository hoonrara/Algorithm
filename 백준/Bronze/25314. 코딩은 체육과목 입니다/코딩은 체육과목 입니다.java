import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        String a = "long ";
        String b = "int";
        for (int i = 1; i <= X/4; i++) {
            b = a+b;
        }
        System.out.println(b);

    }
}
