class Solution {
    public String addBinary(String a, String b) {
        
        int n = a.length(), m = b.length();
        if( n < m ) return addBinary(b,a);
        
        StringBuilder sb = new StringBuilder();
        
        int carry = 0, j = m - 1;
        
        for(int i = n - 1; i > -1; i--) {
            if(a.charAt(i) == '1') ++carry;
            if(j > -1 && b.charAt(j--) == '1') ++carry;
            
            if(carry % 2 == 1) sb.append('1');
            else sb.append('0');
            
            carry /= 2;
        }
        
        if (carry == 1) sb.append('1');
        sb.reverse();
        
        return sb.toString();
        
        
    }
}