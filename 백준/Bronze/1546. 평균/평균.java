import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] a = new double[N];
        double[] b = new double[N];
        double sum = 0;

        double max = 0;

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (a[i]> max){
                max = a[i];
            }
        }

        for (int i = 0; i < N; i++) {
            b[i] = ( a[i] / max) * 100;
            sum += b[i];
        }
        System.out.println(sum/N);


    }
}
