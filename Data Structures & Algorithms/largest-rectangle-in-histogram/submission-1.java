class Solution {
    public int largestRectangleArea(int[] h) {
        Stack<int[]> r = new Stack<>();
        int n = h.length;
        int max =0;

        for(int i=0 ; i<n ; i++){
            int s =i;
            while(!r.isEmpty() &&  r.peek()[1] > h[i]){
                int top[] = r.pop();
                int ind = top[0];
                int hg = top[1];
                max = Math.max(max , hg * (i-ind));
                s = ind;
            } 
            r.push(new int[] {s , h[i]});
        }

        for(int[] e : r){
            int ind = e[0];
            int hg = e[1];
            max = Math.max(max,hg*(n-ind));
        }
        return max;
        
    }
}
