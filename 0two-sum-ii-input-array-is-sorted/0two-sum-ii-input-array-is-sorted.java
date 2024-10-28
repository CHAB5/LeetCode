class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int complement;
        int i = 0, j = numbers.length - 1;
        int sum;
        
        while( i < j) {
            sum = numbers[i] + numbers[j];
            if(sum == target) return new int[] {i+1, j+1};
            
            else if(sum > target) j--;
            
            else if(sum < target) i++;
        }
        
        return new int[] {-1, -1};
    }
}