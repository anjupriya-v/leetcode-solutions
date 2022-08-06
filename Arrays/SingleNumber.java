class Solution {
    public int singleNumber(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    nums[i]=0;
                    nums[j]=0;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
               temp=nums[i]; 
            }
        }
        return temp;
    }
}
