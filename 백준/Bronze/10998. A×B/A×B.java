import java.util.Scanner;  // java.util 패키지에서 Scanner 클래스를 가져옵니다.

public class Main {
    public static void main(String[] args) {
        // Scanner 객체 생성: 시스템의 입력(키보드)으로부터 데이터를 받기 위한 준비
        Scanner sc = new Scanner(System.in);
        
        // 입력받은 값을 정수로 저장: sc.nextInt()는 입력된 값을 정수(int)로 읽습니다.
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        // A * B: 두 정수의 곱을 출력
        System.out.println(A * B);
    }
}
