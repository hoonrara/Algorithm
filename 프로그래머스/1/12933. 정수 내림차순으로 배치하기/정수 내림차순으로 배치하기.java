import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String a = "" + n;
        String k = "";
        char [] b = a.toCharArray();
        
        Arrays.sort(b);
        
        for(int i=a.length()-1; i>=0; i-- ){
            k = k + (b[i]);                      
        }
        
        
        answer = Long.parseLong(k);
        
        
        
        return answer;
    }
}