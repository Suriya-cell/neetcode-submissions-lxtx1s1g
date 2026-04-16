class Solution {
    public boolean isPalindrome(String w) {
        char[] s1 = new char[w.length()];
        int n=0;

        for(int i=0 ; i<w.length() ; i++){
            if(Character.isLetterOrDigit(w.charAt(i))){
                s1[n++] = w.charAt(i);
            }
        }

        String s = new String(s1,0,n).toLowerCase();
        int l = 0;
        int r = n-1;

        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
        
    }
}
