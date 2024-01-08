class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0,j = 0, counter = 0;
        int lenOfs = s.length(), lenOft = t.length();
        while(i<lenOfs && j<lenOft) {
            if(s.charAt(i) == t.charAt(j)) {
                counter++;
                i++;
            }
            j++;
        }
        
        boolean result = false;
        if(counter == lenOfs)
            result = true;
        else
            result = false;
        
        return result;
    }
}