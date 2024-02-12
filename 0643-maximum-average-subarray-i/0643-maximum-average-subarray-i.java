class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        System.out.println("n: "+n);
        double sum = 0.0;
        double max = 0.0;
        double avg = 0.0;
        ArrayList<Double> averages = new ArrayList<>();
        
        for(int i=0;i<k;i++){
            sum = sum + nums[i];
        }
        
        max = sum;
        
        for(int i=k; i<n;i++){
            sum = sum - nums[i-k] + nums[i];
            max= Math.max(max,sum);
        }
        
        return max/k;
    }
}