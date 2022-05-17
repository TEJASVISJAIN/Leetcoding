class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        int incl = nums[0];
        int excl = 0;
        
        for(int i = 1; i <dp.length - 1; i++){
            int newIncl = excl + nums[i];
            int newExcl = Math.max(incl,excl);
            incl = newIncl;
            excl = newExcl;
        }
        int ans1 =  Math.max(incl,excl);
        
            if(nums.length < 2){
                return ans1;
            }
            incl = nums[1];
            excl = 0;
        for(int i = 2; i <dp.length; i++){
            int newIncl = excl + nums[i];
            int newExcl = Math.max(incl,excl);
            incl = newIncl;
            excl = newExcl;
        }
        int ans2 = Math.max(incl,excl);
        return Math.max(ans1,ans2);
    }
}