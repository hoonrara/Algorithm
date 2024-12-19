class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double a = Math.sqrt(n);
        
        if(a%1 != 0) {
            answer = -1;
        } else answer = (long)(a+1)*(long)(a+1);
        
        
        return answer;
    }
}