class Solution {
    public int maxArea(int[] h) {
        int n = h.length;
        int l =0 ;
        int r=n-1;

        int dis =0;
        int maxArea = 0 ;
        int minh = 0 ,c=0;

        while(l<r){
            dis = (r - l) ;
            minh = Math.min(h[l],h[r]);
            c = dis * minh;
            maxArea = Math.max(maxArea,c);

            if(h[l] < h[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxArea;


        
    }
}
