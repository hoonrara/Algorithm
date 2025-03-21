
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        List<Integer> list = new ArrayList<>();

        while (N != 0) {

            list.add(N % 10);
            N = N / 10;

        }

        Collections.sort(list);

        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i));

        }


    }
}
