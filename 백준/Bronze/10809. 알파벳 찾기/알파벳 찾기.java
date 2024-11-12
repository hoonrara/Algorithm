import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        char[] b = a.toCharArray();   
        int N = a.length();

        String c = "abcdefghijklmnopqrstuvwxyz";
        char[] d = c.toCharArray();

        int[] e = new int[26];

        for (int i = 0; i < 26; i++) {
            e[i] =-1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 26; j++) {
                if (e[j]==-1 && b[i] == d[j]) e[j] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(e[i] + " ");
        }




    }
}
