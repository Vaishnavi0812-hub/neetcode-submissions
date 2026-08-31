class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        return solve(n,ans,sb,0,0);
    }
    public List<String> solve(int n, List<String>ans, StringBuilder sb,int count1,int count2){
        if(count1==n && count2==n){
            ans.add(sb.toString());
            return ans;
        }
        if(count1<n){
            sb.append("(");
            solve(n,ans,sb,count1+1,count2);
            sb.deleteCharAt(sb.length()-1);
        }
        if(count2<count1){
            sb.append(")");
            solve(n,ans,sb,count1,count2+1);
            sb.deleteCharAt(sb.length()-1);
        }
        return ans;
    }
}
