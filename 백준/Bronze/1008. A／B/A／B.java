import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        System.out.println(A/B);

        //float, double 정밀도
        // float : 소수점 6~7자리 정도?
        // double : 소수점 15~16자리 정도?

        // 코딩테스트에서는 웬만해선 double 이 float 보다 낫다
    }
}
