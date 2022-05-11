class Solution {
    public int findTargetSumWays(int[] nums, int target) {      
        return helper(nums,0,target);
    }
    public int helper(int[] nums, int idx, int target){
        int count = 0;
        if( idx == nums.length && target != 0){
            return count;
        }
        if( idx == nums.length && target == 0 ){
            return 1;
        }
        count += helper(nums,idx+1, target - nums[idx]);
        count += helper(nums,idx+1, target + nums[idx]);
        return count;
        
    }
}