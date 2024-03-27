class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
     if(k<= 1)
     return 0;

     int l = 0,r = 0,p = 1,c = 0;
     int n = nums.length; 

     while(r<n){
        p *=nums[r];
        while(p>=k){
            p/=nums[l++];
        }
        c+= 1 +(r - l);
        r++;
     }  
     return c;
    }
}