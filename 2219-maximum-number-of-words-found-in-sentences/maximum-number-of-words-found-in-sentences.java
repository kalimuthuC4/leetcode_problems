class Solution {
    public int mostWordsFound(String[] sen) {
        int s=0,m=0;
        for(int i=0;i<sen.length;i++)
        {
            s=0;
            String str = sen[i];
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(j) == ' ')
                s++;
            }
            if(s>m)
            m=s;
        }
        
        return m+1;
    }
}