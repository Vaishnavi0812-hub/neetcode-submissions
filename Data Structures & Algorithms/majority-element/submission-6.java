class Solution {
    public int majorityElement(int[] nums) {
        /*HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(Integer k:map.keySet()){
            if(map.get(k)>n/2){
                return k;
            }
        }
        return -1;*/
        int cand=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0) cand=nums[i];
            if(nums[i]==cand){
                count++;
            }else if(nums[i]!=cand){
                count--;
            }
           
        }
        return cand;
    }
}