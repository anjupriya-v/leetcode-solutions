class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumbers=new ArrayList<Integer>();
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                disappearedNumbers.add(i);
            }
        }
        return disappearedNumbers;
    }
}
