class Solution {
    public int longestConsecutive(int[] nums) {
        int[] n = Arrays.copyOf(nums,nums.length);
        Arrays.sort(n);
        int m=1, c=1;
        if(n.length == 0){
            return 0;
        }
        if(n.length ==1){
            return 1;
        }

        for(int i=0 ;i<n.length-1 ; i++){
            if(n[i+1] == n[i]+1 || n[i+1] == n[i] -1  ){
                c ++;
                
            }
            else if(n[i+1] == n[i]){
                continue; 
            }
            else{
                m = Math.max(m,c);
                c=1;
            }
        }
        m = Math.max(m,c);
        
        return m;
        
    }
}
