class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        return solve(nums,target,0,ans,curr);
    }
    public List<List<Integer>> solve(int[] nums, int target,int i,List<List<Integer>>ans,List<Integer>curr){
        if(i==nums.length){
            if(target==0){
                ans.add(new ArrayList<>(curr));
                return ans;
            }else{
                return ans;
            }
        } 
        if(nums[i]<=target){
            curr.add(nums[i]);
            solve(nums,target-nums[i],i,ans,curr);
            curr.remove(curr.size()-1);
        }
        solve(nums,target,i+1,ans,curr);
        return ans;
    }
}
