class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        int n = s.length();
        for(int i=1;i<n;i++)
        {
            int a = s.charAt(i-1);
            int b = s.charAt(i);
            sum += Math.abs(a-b);
            // c+=sum;
            // System.out.print(sum+" "); 
        }
        return sum;
    }
}