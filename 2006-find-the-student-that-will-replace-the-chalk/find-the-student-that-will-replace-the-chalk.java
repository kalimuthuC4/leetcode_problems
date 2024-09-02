class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int i;
        while(k >= 0){
            for(i = 0; i < chalk.length; i++){
                if(chalk[i] <= k)
                    k -= chalk[i];
                else
                    return i;
            }
            // System.out.println(k);
        }
        return 0;
    }
}