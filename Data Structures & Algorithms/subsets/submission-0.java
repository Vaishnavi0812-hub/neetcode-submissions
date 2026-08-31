class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans= new ArrayList<>();
        List<Integer>curr= new ArrayList<>();
        return solve(nums,0,curr,ans);
    }
    public List<List<Integer>> solve(int nums[], int i, List<Integer>curr, List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(curr));
            return ans;
        }
        curr.add(nums[i]);
        solve(nums,i+1,curr,ans);
        curr.remove(curr.size()-1);
        solve(nums,i+1,curr,ans);
        return ans;
    }
}
