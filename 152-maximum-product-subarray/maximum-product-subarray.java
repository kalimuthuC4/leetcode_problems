class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0],min=nums[0],m=max;
        for(int i=1;i<nums.length;i++)
        {
            int a = nums[i];
              if (a < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            min*=a;
            max*=a;
            max = Math.max(a,Math.max(max,min));
            min = Math.min(a,Math.min(min,max));
            
            // max = temp;
            m = Math.max(m,max);
            System.out.print(max+" "+min+" "); 
        }
        return m;
    }
}