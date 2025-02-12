import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); int b = sc.nextInt();
        int c = sc.nextInt(); int d = sc.nextInt();
        int e = sc.nextInt(); int f = sc.nextInt();

        if (a - c == 0) {
            System.out.print(e+ " ");
        } else if (a - e == 0) {
            System.out.print(c+ " ");
        } else System.out.print(a+ " ");

        if (b - d == 0) {
            System.out.print(f);
        } else if (b - f == 0) {
            System.out.print(d);
        } else System.out.print(b);




    }
}
