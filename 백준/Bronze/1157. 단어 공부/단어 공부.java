

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] A = sc.nextLine().toUpperCase().toCharArray();
        int[] B = new int[26];
        for (int i = 0; i < 26; i++) {
            B[i] = 0;
        }

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[j] - 'A' == i) {
                    B[i]++;
                }
            }
        }
        int max = 0;
        int max_count = 0;
        int max_index = 0;
        for (int i = 0; i < 26; i++) {

            if (B[i] > max) {
                max = B[i];
                max_count = 1;
                max_index = i;
            } else if (max == B[i]) {
                max_count++;
            }
        }

        if (max_count == 1) {
            System.out.println((char)('A' + max_index));
        }else {
            System.out.println("?");
        }

        


    }
}
