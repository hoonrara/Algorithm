
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] a = sc.nextLine().toCharArray();

        int v = 1;
        for (int i = 0; i < a.length/2; i++) {
            if (a[i] != a[a.length - 1 - i]) {
                v=0;
                break;
            }
        }
        
        System.out.println(v);
    }
}
