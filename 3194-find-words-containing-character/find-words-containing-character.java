class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> li = new ArrayList();
        for(int i=0;i<words.length;i++)
        {
            String s = words[i];
            if(s.contains(String.valueOf(x)))
            li.add(i);
        }
        System.out.print(li);
        return li;
    }
}