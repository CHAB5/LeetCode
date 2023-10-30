import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        ArrayList<Integer> elements = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(elements.contains(nums[i])){
                int index = elements.indexOf(nums[i]);
                count.set(index,count.get(index)+1);
            }
            else{
                elements.add(nums[i]);
                count.add(1);
            }
        }
        
        int maxElement = 0;
        int maxElementCount = 0;
        for(Integer i:count){
            if(i>=(nums.length/2) && i>maxElementCount){
                maxElementCount = i;
                maxElement = elements.get(count.indexOf(i));
            }
        }
        
        return maxElement;
    }
}