class Solution {
    public boolean isHappy(int n) {
        int digit = 0;
        int sum = 0;
        Set<Integer> prevSums = new HashSet<>();
        prevSums.add(n);
        
        while (true) {
            digit = 0;
            sum = 0;
            while ( n > 0) {
                digit = n % 10;
                sum = sum + (digit * digit);
                n = n / 10;
            }
            if(sum == 1) 
                return true;
            else if(prevSums.contains(sum)) 
                return false;
            n = sum;
            prevSums.add(n);
        }
    }
}