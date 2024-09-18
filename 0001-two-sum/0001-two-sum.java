class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = {0,0};
        // Store diff between target and current element
        int temp;
        for(int i=0; i < nums.length; i++) {
            temp = target - nums[i];
            for(int j=i+1; j < nums.length; j++) {
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




// int[] twoSum = {-1, -1};
        // int temp;
        // for(int i=0; i<nums.length; i++) {
        //     temp = target - nums[i];
        //     for(int j=i+1; j<nums.length; j++) {
        //         if(temp == nums[j]) {
        //             twoSum[0] = i;
        //             twoSum[1] = j;
        //             return twoSum;
        //         }
        //     }
        // }
        // return twoSum;