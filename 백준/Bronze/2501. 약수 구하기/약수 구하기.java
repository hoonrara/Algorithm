import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //두 자연수 N과 K 가 주어졌을때 N의 약수들 중 K 번쨰로 작은수를 구하라
        //K번째 약수가 존재하지 않을 경우에는 0 출력

        //List 에 약수를 다 넣고 List 사이즈와 K를 비교하여 K보다 작으면 0출력

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //약수를 구할 수
        int K = sc.nextInt(); //리스트에 K-1값을 넣어서 추출해야함

        List<Integer> list = new ArrayList<>();


        for (int i = N; i >= 1; i--) {
            if (N % i == 0) {
                list.add(N / i);
            }
        }

        if (list.size() < K) {
            System.out.println(0);
        } else {
            System.out.println(list.get(K - 1));
        }
    }
}
