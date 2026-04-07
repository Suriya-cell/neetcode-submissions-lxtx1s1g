class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] n = new int[26];

        for(int i=0 ; i<s.length() ; i++){
            n[s.charAt(i) - 'a'] += 1;
            n[t.charAt(i) - 'a'] -= 1;
        }

        for(int i=0 ;i<26 ; i++){
            if(n[i] != 0){
                return false;
            }
        }
        return true;
    }
}
