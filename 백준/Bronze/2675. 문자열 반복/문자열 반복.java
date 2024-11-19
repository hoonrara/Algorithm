

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {

            int R = sc.nextInt();
            String a = sc.next();

            for (int j = 0; j < a.length(); j++) { // 4
                for (int k = 0; k < R; k++) { //a[0] 3번
                    System.out.print(a.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
