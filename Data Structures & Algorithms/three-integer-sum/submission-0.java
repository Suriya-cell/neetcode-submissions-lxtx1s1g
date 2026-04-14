class Solution {
    public List<List<Integer>> threeSum(int[] n) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(n);
        int len = n.length;
        int l,r,c;

        for(int i=0 ; i<len-1 ; i++){
            int a = n[i];
            if(i>0 && a==n[i-1]){
                continue;
            }
            l=i+1;
            r=len-1;
            c=0;
            while(l<r){
                int ad = a + n[l] + n[r];
                if(ad<0){
                    l++;
                }
                else if(ad>0){
                    r--;
                }
                else{
                    res.add(Arrays.asList(a,n[l],n[r]));
                    l++;
                    r--;
                    while(l<r && n[l] == n[l-1]){
                        l++;
                    }
                }
                 
            }
        }
        return res;
    }
         
}
