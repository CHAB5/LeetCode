class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> seen = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        //Mark values occurring in nums1
        for (int x : nums1) {
            seen.put(x, 1);
        }
        
        //iterate through nums2 to check if entries are in seen but not added to the result
        for ( int x : nums2) {
            if(seen.containsKey(x) && seen.get(x) == 1) {
                result.add(x);
                seen.put(x, 0);
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}