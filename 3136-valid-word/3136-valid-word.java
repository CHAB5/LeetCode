class Solution {
    public boolean isValid(String word) {
        int vowelFlag = 0;
        int consonantFlag = 0;
        
        if (word.length() < 3) return false;
        
        for (int i = 0; i < word.length(); i++) {
            // contains digits or letters
            if (word.charAt(i) >= '0' && word.charAt(i) <= '9' ||
                word.charAt(i) >= 'a' && word.charAt(i) <= 'z' ||
                word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') { 
                
                if(word.charAt(i) == 'a' || word.charAt(i) == 'A' ||
                  word.charAt(i) == 'e' || word.charAt(i) == 'E' ||
                  word.charAt(i) == 'i' || word.charAt(i) == 'I' ||
                  word.charAt(i) == 'o' || word.charAt(i) == 'O' ||
                  word.charAt(i) == 'u' || word.charAt(i) == 'U') {
                    vowelFlag = 1;
                } else if(!(word.charAt(i) >= '0' && word.charAt(i) <= '9')) {
                    consonantFlag = 1;
                }
            }
            else {
                return false;
            }
        }
        
        if(vowelFlag == 1 && consonantFlag == 1) {
            return true;
        } else {
            return false;
        }
    }
}