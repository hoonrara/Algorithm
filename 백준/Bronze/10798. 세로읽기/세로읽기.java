import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] board = new char[5][15];

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                board[j][i] = '?';
            }
        }


        for (int i = 0; i < 5; i++) {
            char[] line = sc.nextLine().toCharArray();
            for (int j = 0; j < line.length; j++) {
                board[i][j] = line[j];
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (board[j][i]!='?'){
                    System.out.print(board[j][i]);
                }
            }
        }

    }


}
