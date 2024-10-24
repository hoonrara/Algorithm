

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int a = arr[0];
        int b = arr[0];
//최소
        for (int i = 0; i < N; i++) {
            if (arr[i] < a){
                a = arr[i];
            }
        }
//최대
        for (int i = 0; i < N; i++) {
            if (b<arr[i]) {
                b = arr[i];
            }
        }

        System.out.println(a+ " " + b);


    }
}
