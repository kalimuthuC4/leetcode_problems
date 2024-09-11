class Solution {
    public int maxSubArray(int[] nums) {
        int c=0;
        int m = nums[0];
        for(int i=0;i<nums.length;i++){
            if(c<0)
            {
                c=0;
            }
            c = c +nums[i];
            m = Math.max(m,c);

        }
        return m;
    }
}