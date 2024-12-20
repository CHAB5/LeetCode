class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        
        for(Integer i:nums) {
            if(numsSet.contains(i)) {
                return true;
            }
            numsSet.add(i);
        }
        
        return false;
    }
}