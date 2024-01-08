class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> charMap = new HashMap<>();
        boolean flag = true;
        
        for(int i=0; i < s.length(); i++) {
            if(charMap.containsKey(s.charAt(i))) {
                if(charMap.get(s.charAt(i)) != t.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            else {
                if(charMap.containsValue(t.charAt(i))) {
                    flag = false;
                    break;
                }
                else
                    charMap.put(s.charAt(i), t.charAt(i));
            }
        }
        
        return flag;
    }
}