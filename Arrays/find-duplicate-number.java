class Solution {
    public int findDuplicate(int[] nums) {
        int value=0;
        int freq[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]-1]==0){
                    freq[nums[i]-1]=1;

            }
            else{
                value=nums[i];
            }
        }
        return value;
    }
}
