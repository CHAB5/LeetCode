class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> result = new ArrayList<>();
        
        //for(int i=0; i < nums.length; i++) {
            
        int index = 0;
        while(index < nums.length) {
                
            int temp = index;
            while((temp < nums.length-1) && nums[temp]+1 == nums[temp+1]) {
                temp++;
            }
            if(temp == index) {
                result.add("" + nums[index]);
            }
            else {
                result.add(nums[index] + "->" + nums[temp]);
                index = temp;
            }
            
            index++;
        }
        
        return result;
    }
}