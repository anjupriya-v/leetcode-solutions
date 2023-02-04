class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        List<Integer> temp=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
               temp.add(nums[i]);
            }
                
        }
        for(int i=0;i<temp.size();i++){
            nums[i]=temp.get(i);
        }
        return temp.size();
    }
}
