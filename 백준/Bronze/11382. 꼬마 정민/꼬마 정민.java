import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        System.out.println(A+B+C);

        //int: 비교적 작은 정수 범위
        //long: 더 큰 정수 범위
        //float: 소수점 약 7자리 정확도, 작은 실수 범위
        //double: 소수점 약 15자리 정확도, 더 큰 실수 범위
        //큰 수를 다룰 때는 BigInteger, 고정밀도 계산에는 BigDecimal을 고려


    }
}