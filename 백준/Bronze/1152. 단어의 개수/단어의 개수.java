
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine().trim();
        char[] x= a.toCharArray();

        int k = 1;
        for (int i = 0; i < a.length(); i++) {
            if (x[i] == ' ') {
                k++;
            }
        }

        if (a.isEmpty()) {
            k=0;
        }



        System.out.println(k);

    }
}
