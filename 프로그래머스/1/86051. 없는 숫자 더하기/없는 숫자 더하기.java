class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        int k = 0;
        
        for(int i=0; i<numbers.length; i++){
            k += numbers[i];
        }
        answer -= k; 
        
        return answer;
    }
}