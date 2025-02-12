import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int xMax = Integer.MIN_VALUE;
        int xMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;


        for (int i = 0; i < N; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x > xMax) {
                xMax = x;
            }

            if (x < xMin) {
                xMin = x;
            }

            if (y > yMax) {
                yMax = y;
            }

            if (y < yMin) {
                yMin = y;
            }
        }

        System.out.println((xMax - xMin) * (yMax - yMin));



    }
}
