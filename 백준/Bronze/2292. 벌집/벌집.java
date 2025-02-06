import java.util.Scanner;

public class Main {

    // 1
    // 2~7 (6개)
    // 8~19 (12개)
    // 20~37 (18개)
    // 38~61 (24개)
    // n이 2보다 작으면 1
    // 8보다 작으면 2
    // 20보다 작으면 3

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = 2;
        long v = 1;
        int a = 1;

        while (n >= k) {
            k += 6*v;
            v++;


        }
        System.out.println(v);


    }



}
