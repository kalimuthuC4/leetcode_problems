class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> al = new ArrayList();
        List<Integer> al1 = new ArrayList();
        for(int i=0;i<nums.length;i++)
        {
            int n = nums[i];
            while(n>0){
                int r = n%10;
                al1.add(r);
                n/=10;
            }
            // al.addAll(Collections.sort(al1,Collections.reverseOrder()));
            // Collections.sort(al1, Collections.reverseOrder());
            Collections.reverse(al1);
            al.addAll(al1);
            al1.removeAll(al);
        }
        System.out.print(al+" ");
        int[] arr = new int[al.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = al.get(i);
        }

        return arr;
    }
}