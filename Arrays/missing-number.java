class Solution {
    public boolean contains(int[]arr,int val){
        for(int ele:arr){
            if(val==ele){
                return true;
            }
        }
        return false;
    }
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(!contains(nums,i)){
                return i;
            }
        }
        return nums[nums.length-1]+1;
    }
}
