import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String a = sc.next();
        char [] b = a.toCharArray();
        int sum = 0;

        for (int i = 0; i < a.length(); i++) {
            sum = b[i] + sum - '0';


        }
        System.out.println(sum);

    }
}
