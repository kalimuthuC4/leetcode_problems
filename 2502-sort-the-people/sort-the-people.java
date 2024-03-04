class Solution {
    public String[] sortPeople(String[] names, int[] h) {
        HashMap<Integer,String> m = new HashMap<>();
        for(int i=0;i<names.length;i++)
        {
            m.put(h[i],names[i]);
            System.out.print(m.get(h[i]));
        }
        // heights.sort();
        // for(int i=1;i<h.length;i++)
        // {
        //     if(h[i]>h[i-1])
        //     {
        //         int t = h[i-1];
        //         h[i-1] = h[i];
        //         h[i] = t;
        //     }
        // }
        Arrays.sort(h);
        int c=0;
        String[] s = new String[names.length];
        for(int i=h.length-1;i>=0;i--)
        {
             s[c] = m.get(h[i]).toString();
             c++;
        }
        return s;
    }
}