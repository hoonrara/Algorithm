class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String a = ""+x;
        
        int b = 0;
        
        for(int i=0; i<a.length(); i++){
            b += (a.charAt(i)-'0');
        }
        
        if(x%b!=0){
            answer = false;
        }
        
        
        
        
        return answer;
    }
}