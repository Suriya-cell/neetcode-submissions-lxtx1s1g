class Solution {
    public int[] twoSum(int[] n, int t) {

        int i=0,j = 0;
        int l = n.length;

        while(i<l){
            if(n[i] + n[j] == t && i!=j){
                return new int[] {i+1 , j+1};
            }
            j++;

            if(j==l){
                i++;
                j=0;
            }


        }
        return new int[]{};

        
    }
}
