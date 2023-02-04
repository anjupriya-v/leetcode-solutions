class Solution {
    public int[] result(int s,int m,int[] nums1, int []nums2){
                int index=0;

          for(int i=m;i<s;i++){
                      if(nums1[i]==0){
                          nums1[i]=nums2[index];
                          index++;
                      }
                  }
        int temp=0;
        for(int i=0;i<s;i++){
            for(int j=i+1;j<s;j++){
                if(nums1[i]>nums1[j]){
                   temp=nums1[i];
                nums1[i]=nums1[j];
                nums1[j]=temp;  
                }
               
            }
        }
        
        return nums1;
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
                            int[] arr;
int len=m+n;
    
            arr=result(len,m,nums1,nums2);
            System.out.println(Arrays.toString(arr));
    
  
     
        
    }
}
