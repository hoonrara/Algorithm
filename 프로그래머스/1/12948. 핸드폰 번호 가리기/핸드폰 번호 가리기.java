class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        char [] a = phone_number.toCharArray();
        
        //11자리 0 1 2 3 4 5 6 7 8 9 10
        //       * * * * * * 7 8 9 10
        
        for(int i=0; i<a.length-4; i++){
            answer +="*";
        }
        
        for(int i=a.length-4; i<a.length; i++){
            answer += (a[i]-'0');
        }
        
        
        return answer;
    }
}