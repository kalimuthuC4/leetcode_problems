class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int c = 0;

        for(int i=0;i<n-1;i++)
        {
            if(nums[i]>nums[i+1])
            c++;
        }
        
        if(nums[0]<nums[n-1])
        c++;
        
        System.out.print(c);
        return c<=1;

    }
}