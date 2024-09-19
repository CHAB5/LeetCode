class Solution {
    public boolean isValid(String word) {
        boolean isVowelPresent = false;
        boolean isConsonantPresent = false;
        
        if (word.length() < 3) return false;
        
        
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) { 
                if("aeiouAEIOU".indexOf(c) != -1) {
                    isVowelPresent = true;
                } else {
                    isConsonantPresent = true;
                }
            }
            else if(!Character.isDigit(c)) {
                return false;
            }
        }
        
        if(isVowelPresent && isConsonantPresent) 
            return true;
        else
            return false;
    }
}