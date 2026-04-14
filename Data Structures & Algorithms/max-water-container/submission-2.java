class Solution {
    public int maxArea(int[] h) {
        int n = h.length;
        int l =0 ;
        int r =n-1;

        int distance =0;
        int maxArea = 0 ;
        int minheight = 0;

        while(l<r){
            distance = (r - l) ;
            minheight = Math.min(h[l],h[r]);
            maxArea = Math.max(maxArea,distance*minheight);

            if(h[l] <= h[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxArea;


        
    }
}
