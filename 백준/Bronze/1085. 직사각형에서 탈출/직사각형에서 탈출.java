import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //직사각형
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        // x  w-x  y  h-y

        int[] arr = {x, w - x, y, h - y};

        Arrays.sort(arr);

        System.out.println(arr[0]);





    }
}
