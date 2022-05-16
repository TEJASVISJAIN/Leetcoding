class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        int incl = nums[0];
        int excl = 0;
        
        for(int i = 1; i <dp.length; i++){
            int newIncl = excl + nums[i];
            int newExcl = Math.max(incl,excl);
            incl = newIncl;
            excl = newExcl;
        }
        return Math.max(incl,excl);
    }
}