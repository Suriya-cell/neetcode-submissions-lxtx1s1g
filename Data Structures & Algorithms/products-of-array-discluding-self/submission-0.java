class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n  = nums.length;
        int[] r = new int[n];
        int[] p = new int[n];
        int[] s = new int[n];

        int i;
        p[0] = 1;
        s[n-1] = 1;

        for(i=1 ; i<n ; i++ ){
            p[i] = nums[i-1] * p[i-1];
        }

        for(i=n-2 ; i>=0 ;i--){
            s[i] = nums[i+1] * s[i+1];
        }

        for(i=0 ; i<n ;i++){
            r[i] = p[i] * s[i]; 
        }
        return r;

         
    }
}  
