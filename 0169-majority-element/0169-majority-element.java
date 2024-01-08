import java.lang.Math;
class Solution {
    public int majorityElement(int[] nums) {
        ArrayList<Integer> elements = new ArrayList<>();
        ArrayList<Integer> occurances = new ArrayList<>();
        int majority = (int)Math.floor(nums.length/2);
        
        for(int i=0; i < nums.length; i++) {
            if(elements.contains(nums[i])) {
                int index = elements.indexOf(nums[i]);
                int current = occurances.get(index);
                current++;
                occurances.set(index, current);
                
                if(current > majority) {
                    return nums[i];
                }
            }
            else {
                elements.add(nums[i]);
                occurances.add(1);
                
                if(1 > majority) {
                    return nums[i];
                }
            }
        }
        return 0;
    }
}