class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        List<Integer>[] l = new List[nums.length + 1];

        for(int i=0 ; i<nums.length+1 ; i++){
            l[i] = new ArrayList<>(); 
        }

        for(int n : nums){
            m.put(n , m.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer,Integer> p :  m.entrySet()){
            l[p.getValue()].add(p.getKey()); 
         }

        int[] r = new int[k];
        int index =0;

        for(int i=l.length-1 ; i>=0 && index <k ; i--){
            for(int n : l[i]){
                r[index++] = n;
                if(index == k){
                    return r;
                }

            }
             
        }
        return r;

        
    }
}
