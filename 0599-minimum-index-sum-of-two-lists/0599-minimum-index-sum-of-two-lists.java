/**
Can the lists be empty - yes

**/
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if(list1.length == 0  || list2.length == 0 ) return new String[] {};
        Map<String, Integer> matchingStrings = new HashMap<>();
        int minIndexSum = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();
        
        for(int i = 0; i < list1.length; i++) {
            for ( int j = 0; j < list2.length; j++) {
                if(list1[i].equals(list2[j])) {
                    matchingStrings.put(list1[i], i+j);
                    if((i+j) < minIndexSum) 
                        minIndexSum = i + j;
                }
            } 
        }
        
        for(Map.Entry<String, Integer> entry : matchingStrings.entrySet()) {
            if(entry.getValue().equals(minIndexSum)) {
                result.add(entry.getKey());
            }
        }
        
        String[] output = new String[result.size()];
        
        int j = 0;
        for (String i : result) {
            output[j++] = i;
        }
        
        return output;
    }
}