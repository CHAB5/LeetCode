import java.lang.Math;
class Solution {
    public int titleToNumber(String columnTitle) {
        int len = columnTitle.length();
        int result = 0;
        for(int i=0; i<len; i++)
        {
            int ch = columnTitle.charAt(i) - 65 + 1;
            result = result * 26 + ch;
        }
        
        return result;
    }
}