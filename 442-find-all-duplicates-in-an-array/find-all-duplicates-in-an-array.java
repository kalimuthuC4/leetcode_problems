class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                li.add(nums[i]);
            }
            else{
                m.put(nums[i],i);
            }
        }
        return li;
    }
}