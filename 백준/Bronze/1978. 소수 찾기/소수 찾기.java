
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i=0; i<N; i++){
            int temp = sc.nextInt();

            boolean IsPrime = true;
            if(temp == 1) IsPrime = false;
            else{
                // 1보다 크고 약수가 나 외에 없는 수가 소수다.
                for(int j=2; j<temp; j++){
                    if(temp%j==0){
                        IsPrime = false;
                        break;
                    }
                }
            }
            if(IsPrime) count++;
        }
        System.out.println(count);
    }
}