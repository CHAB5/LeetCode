class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int minLen = 0;
        int startIndex = 0;
        int endIndex = 0;
        int counter = 0;

        while( endIndex < n && startIndex <= endIndex) {
            
            sum += nums[endIndex];
            
            
            while(sum >= target) {
                if(counter == 0) {
                    minLen = Integer.MAX_VALUE;
                }
                counter = 1;
                int len = endIndex - startIndex + 1;
                minLen = Math.min(minLen, len);
                sum -= nums[startIndex];
                startIndex++;
            }
            
            
            endIndex++;
        }
        

        return minLen;
    }
}