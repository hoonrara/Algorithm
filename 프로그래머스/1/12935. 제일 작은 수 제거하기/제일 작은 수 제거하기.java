

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        
        int[] answer = new int[arr.length-1];
        
        int k = Integer.MAX_VALUE;
        int index = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]<k) {k=arr[i];
            index = i;}
        }
        int newIndex=0;
        
        for(int i=0; i<arr.length; i++){
            if(i!=index){
                answer[newIndex++] = arr[i];
            }
            
        }
        
        
        
        return answer;
    }
}