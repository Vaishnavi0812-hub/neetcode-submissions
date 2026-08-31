class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int len=0, maxLen=0;
        int lp=0, rp=0;
        while(rp<s.length()){
            if(!set.contains(s.charAt(rp))){
                set.add(s.charAt(rp));
                len=rp-lp+1;
                maxLen=Math.max(len,maxLen);
                rp++;
            }else{
                set.remove(s.charAt(lp));
                lp++;
            }
        }
        return maxLen;
    }
}
