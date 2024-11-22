

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String  a = sc.next();
        String  b = sc.next();
        String k = " ";

        for (int i = 2; i >= 0; i--) {
            if (a.charAt(i) > b.charAt(i)) {
                 k = a;
                break;
            } else if (a.charAt(i) < b.charAt(i)) {
                 k = b;
                break;
            }

        }

        for (int i = 2; i >= 0; i--) {
            System.out.print(k.charAt(i));
        }

    }
}
