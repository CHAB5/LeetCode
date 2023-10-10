class Solution {
    public int removeElement(int[] nums, int val) {
        
        int k=0;
        int[] newnums = new int[nums.length];
        int j=0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val){
                k++;
            }
            else{
                newnums[j]=nums[i];
                j++;
            }
        }
        
        for(int i=0;i<newnums.length; i++){
            nums[i] = newnums[i];
        }
        
        
        return j;
    }
}