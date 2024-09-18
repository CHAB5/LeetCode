class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = {0,0};
        
        // Store diff between target and current element
        int temp;
        
        
        for(int i=0; i < nums.length; i++) {
            temp = target - nums[i];
            
            //Compare difference with the remaining entries to find solution
            for(int j=i+1; j < nums.length; j++) {
                //Entry is equal to the difference
                if(temp == nums[j]) {
                    twoSum[0] = i;
                    twoSum[1] = j;
                    return twoSum;
                }
            }
        }
        return twoSum;
    }
}