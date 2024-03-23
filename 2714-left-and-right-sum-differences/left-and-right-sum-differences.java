class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int s=0;
        int[] l = new int[n];
        int[] r = new int[n];
        int[] ans = new int[n];
        for(int i=0;i<n;i++)
        {
            l[i]=s;
            s+=nums[i];
            System.out.print(s);
        }
        s=0;
        for(int i=n-1;i>=0;i--)
        {
            r[i]=s;
            s+=nums[i];
            System.out.print(s);
        }
        for(int i=0;i<n;i++)
        {
            ans[i] = Math.abs(l[i] - r[i]);
        }
        return ans;
    }
}