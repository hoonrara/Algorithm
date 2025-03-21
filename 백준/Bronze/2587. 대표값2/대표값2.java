
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int cen = 0;


        for (int i = 0; i < 5; i++) {
            int N = sc.nextInt();
            list.add(N);
        }

        Collections.sort(list);

        for (int i = 0; i < 5; i++) {

            sum += list.get(i);
        }

        cen = list.get(2);

        System.out.println(sum / 5);
        System.out.println(cen);




    }
}
