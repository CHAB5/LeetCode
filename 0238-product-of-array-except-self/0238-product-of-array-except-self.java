class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] left=new int[len];
        int[] right=new int[len];
        left[0] = 1;
        right[len-1] = 1;
        int prod = 1;
        int[] ans=new int[len];
        
        for(int i=1; i<len; i++){
            prod = prod * nums[i-1];
            left[i] = prod;
        }
        
        prod = 1;
        for(int i=len-2; i>=0; i--){
            prod = prod * nums[i+1];
            right[i] = prod;
        }
        
        for(int i=0; i<len; i++){
            ans[i] = left[i] * right[i];
        }
        
        return ans;
    }
}