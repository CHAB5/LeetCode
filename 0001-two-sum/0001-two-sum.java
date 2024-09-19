// class Solution {
//     public int[] twoSum(int[] nums, int target) {
        
//         // Store diff between target and current element
//         int temp;
        
        
//         for(int i=0; i < nums.length; i++) {            
//             //Compare difference with the remaining entries to find solution
//             for(int j=i+1; j < nums.length; j++) {
//                 //Entry is equal to the difference
//                 if(target - nums[i] == nums[j]) {
//                     return new int[] {i,j};
//                 }
//             }
//         }
//         return new int[] {};
//     }
// }

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
        
//         Map<Integer, Integer> map = new HashMap<>();
        
//         //Add elements as key and their indices as values in a hash table
//         for(int i = 0; i < nums.length; i++) {
//             map.put(nums[i],i);
//         }
        
//         //Find the complement and return both indices
//         for(int i = 0; i < nums.length; i++) {
//             int complement = target - nums[i];
//             if(map.containsKey(complement) && map.get(complement) != i) {
//                 return new int[] {i,map.get(complement)};
//             }
//         }
        
//         //In case there is no solution, return an empty array
//         return new int[] {};
//     }
// }


class Solution{
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            } 
            map.put(nums[i], i);
        }
        
        //Return an empty array if no solution is found
        
        return new int[] {};
    }
}