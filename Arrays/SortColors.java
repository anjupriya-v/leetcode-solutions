import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
        int zeros=0,ones=0,twos=0;
        for(int i=0;i<nums.length;i++){
            switch(nums[i]){
                case 0:
                    zeros++;
                    break;
                case 1:
                    ones++;
                    break;
                case 2:
                    twos++;
                    break;
            }
        }
        int index=0;
          while(zeros>0){
              nums[index]=0;
              zeros--;
              index++;
          }  
          while(ones>0){
              nums[index]=1;
              ones--;
              index++;
          }  
          while(twos>0){
              nums[index]=2;
              twos--;
              index++;
          }  
    }
}
