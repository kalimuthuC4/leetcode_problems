class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h = new HashSet<>();
        int m = 0,l=0,r=0;
        while(r<s.length())
        {
            if(!h.contains(s.charAt(r))){
                h.add(s.charAt(r));
                r++;
                m = Math.max(m,r-l);
                            // System.out.print(" "+ l+"->"+r);

            }
            else{
                h.remove(s.charAt(l));
                l++;
            }
            
            System.out.print(" "+ m);
            System.out.print(h);
        }
    return m;
    }
}