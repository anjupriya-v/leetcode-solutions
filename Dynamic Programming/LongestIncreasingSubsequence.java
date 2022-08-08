import java.util.*;
class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        int[]arr=new int[nums.length];
        int max=-1;
        Arrays.fill(arr,1);
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    arr[i]=Math.max(arr[i],arr[j]+1);
                }
            }
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}
