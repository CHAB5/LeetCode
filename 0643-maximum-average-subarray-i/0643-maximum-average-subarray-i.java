class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int windowSum = 0;
        int windowStart = 0;
        double average = 0.0;
        int max = Integer.MIN_VALUE;
        
        for(int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd];
            
            if(windowEnd >= k-1) {
                max = Math.max(max, windowSum);
                average = (double)max/k;
                windowSum -= nums[windowStart];
                windowStart++;
            }
        }
        
        return average;
    }
}