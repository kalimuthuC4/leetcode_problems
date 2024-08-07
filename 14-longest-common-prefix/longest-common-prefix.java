class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
        return "";

        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0)
            {
                // System.out.println(strs[i].indexOf(prefix));
                prefix = prefix.substring(0,prefix.length() -1);
                // System.out.println(prefix);
                if(prefix.length() == 0)
                return "";
            }
        }
        return prefix;
    }
}