class Solution {
    boolean pal(String s,int l,int r){
        while(l<r){
            if(s.charAt(l) != s.charAt(r))
            return false;
            l++;
            r--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int max =1,l=0,r=0;
        int n = s.length();
        // if(n==1)
        // return s;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(pal(s,i,j)==true){
                    if(max<j-i+1){
                l=i;
                r=j;
                max =j-i+1;
                    }
                }
            }
        }
        System.out.print(max+ " "+l+" "+r);
        return s.substring(l,r+1);
    }
}