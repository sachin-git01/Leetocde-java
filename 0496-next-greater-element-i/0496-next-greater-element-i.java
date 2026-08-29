class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // code here
      
    int res[]=new int[nums1.length];
   boolean found =false;
    for(int i=0;i<nums1.length;i++){
         found =false;
        for(int j=0;j<nums2.length;j++){
             if(nums1[i]==nums2[j])
            {
                found =true;
                    for(int k=j+1;k<nums2.length;k++){
                if (found && nums2[k]>nums1[i]){
                    res[i]=nums2[k];
                    break;
                }
            }

            if(res[i]==0){
                res[i]=-1;
            }
            }
        
            
 
        }
    }
    return res;

    }
}