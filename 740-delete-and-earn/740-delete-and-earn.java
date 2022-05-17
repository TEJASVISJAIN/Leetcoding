class Solution {
    public int deleteAndEarn(int[] nums) {
        int incl = 0;
        int excl = 0;
        int[] count = new int[10001];
        for(int c : nums){
            count[c]++;
        }
        for(int i = 0; i < count.length; i++){
            int newIncl = excl + count[i]*i;
            int newExcl = Math.max(incl,excl);
            incl = newIncl;
            excl = newExcl;
        }
        return Math.max(incl,excl);
    }
}