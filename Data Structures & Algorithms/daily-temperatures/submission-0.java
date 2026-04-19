class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<int[]> s = new Stack<>();
        int[] r = new int[t.length];

        for(int i=0 ; i<t.length ; i++){
            int temp = t[i];
            while(!s.isEmpty() && temp>s.peek()[0]){
                int[] pair = s.pop();
                r[pair[1]] = i-pair[1];
            }
            s.push(new int[] {temp,i});
        }
        return  r;

    }
}
