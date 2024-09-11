class Solution {
    public int maxSubArray(int[] nums) {
        int curr = 0;
        int m = nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(curr<0)
            curr= 0;
            curr+=nums[i];
            m = Math.max(m,curr);
        }
        return m;
    }
}