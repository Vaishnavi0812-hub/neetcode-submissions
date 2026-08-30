class Solution {
    public boolean isPalindrome(String s) {
        int lp=0, rp=s.length()-1;
        while(lp<=rp){
            while(lp<=rp && !Character.isLetterOrDigit(s.charAt(lp))){
                lp++;
            }
            while(lp<=rp && !Character.isLetterOrDigit(s.charAt(rp))){
                rp--;
            }
            if (lp<=rp && Character.toLowerCase(s.charAt(lp)) != Character.toLowerCase(s.charAt(rp))) {
                 return false;
            }
            lp++;
            rp--;
        }
        return true;
    }
}
