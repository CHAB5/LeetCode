class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                if(!temp.contains(nums[i])) {
                    temp.add(nums[i]);
                }
            }
            
            int i = 0;
            for(int a:temp){
                nums[i] = a;
                i++;
            }
        
        return i;
        }
}