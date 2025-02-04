import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] guk = new int[9][9];
        Scanner sc = new Scanner(System.in);
        int record = 0;
        int column = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                guk[i][j] = sc.nextInt();
                if (guk[i][j] > max) {
                    max = guk[i][j];
                    record = i;
                    column = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((record+1) + " " + (column+1));
    }


}
