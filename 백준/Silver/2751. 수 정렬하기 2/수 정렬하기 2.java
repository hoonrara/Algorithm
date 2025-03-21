
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(br.readLine());
            list.add(k);
        }

        Collections.sort(list);

        for (int i = 0; i < N; i++) {
            bw.write(String.valueOf(list.get(i) + "\n"));

        }

        bw.flush();
        bw.close();
        
    }
}
