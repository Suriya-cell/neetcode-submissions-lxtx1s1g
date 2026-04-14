class Solution {

    public String encode(List<String> strs) {
        String r = "";
        for(String a : strs){
            int n = a.length();
            r = r + n + '#' + a; 
        }
        return r;

    }

    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i=0;

        while(i<s.length()){
            int j = i;
            while(s.charAt(j) != '#'){
                j++;
            }
            int l = Integer.parseInt(s.substring(i,j));
            i = j + 1;
            j = i + l;
            res.add(s.substring(i,j));
            i=j;
        }
        return res;

    }
}