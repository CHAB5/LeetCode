class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> first = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        
        for (int i : nums1) {
            first.add(i);
        }
        
        for ( int i : nums2 ) {
            if(first.contains(i)) {
                intersection.add(i);
            }
        }
        
        int[] result = new int[intersection.size()];
        int j = 0;
        
        for ( Integer i : intersection) {
            result[j] = i;
            j++;
        }
        
        return result;
    }
}