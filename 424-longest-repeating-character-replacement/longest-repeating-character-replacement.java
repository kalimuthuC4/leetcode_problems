class Solution {
    public int characterReplacement(String s, int k) {
        int[] occ = new int[26];
        int r,l=0,sum=0;
        int maxocc = 0;
        for( r=0;r<s.length();r++){
            maxocc = Math.max(maxocc,++occ[s.charAt(r)-'A']);
            if(r-l+1-maxocc>k)
            {
                
                occ[s.charAt(l)-'A']--;l++;
            }
            sum = Math.max(sum,r-l+1);
        }
        return sum;
    }
}