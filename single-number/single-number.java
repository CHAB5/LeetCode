class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        
        for (Integer i : nums) {
            if(numsSet.contains(i)) {
                numsSet.remove(i);
            } else {
                numsSet.add(i);
            }
        }
        
        int unique = 0;
        
        for (Integer i : numsSet) {
            unique = i;
        }
        
        return unique;
    }
}