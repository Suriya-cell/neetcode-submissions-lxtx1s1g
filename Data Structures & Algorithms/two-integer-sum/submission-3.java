
public class Solution {
    public int[] twoSum(int[] n, int t) {
         Map<Integer, Integer> m = new HashMap<>();

         for(int i =0; i<n.length ; i++){
            int dif = t - n[i];
            if(m.containsKey(dif)){
                return new int[] {m.get(dif) , i };
            }
            m.put(n[i] , i);
         }
         return new int[0];

    }
}