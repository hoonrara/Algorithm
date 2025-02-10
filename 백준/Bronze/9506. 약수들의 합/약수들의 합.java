
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (true) {
            int n = sc.nextInt();

            if (n==-1 ) break;



            List<Integer> list = new ArrayList<>();

            for (int i = n; i >1 ; i--) {
                if (n % i == 0) {
                    list.add(n / i);
                }
            }

            int sum = 0;

            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }

            if (sum != n) {
                System.out.println(n + " is NOT perfect.");
            } else {
                System.out.print(n + " = ");
                for (int i = 0; i < list.size()-1; i++) {
                    System.out.print(list.get(i) + " + ");
                }
                System.out.println(list.get(list.size()-1));
            }
        }
    }
}
