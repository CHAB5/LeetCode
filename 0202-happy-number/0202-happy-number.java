class Solution {
    public boolean isHappy(int n) {
//         int digit = 0;
//         int sum = 0;
//         Set<Integer> prevSums = new HashSet<>();
//         prevSums.add(n);
        
//         while (true) {
//             while ( n > 0) {
//                 digit = n % 10;
//                 sum = sum + (digit * digit);
//                 n = n / 10;
//             }
//             if(sum == 1) 
//                 return true;
//             if(prevSums.contains(sum)) 
//                 return false;
//             n = sum;
//             prevSums.add(n);
//         }
        
        
        int slowRunner = n;
        int fastRunner = getNext(n);
        
        while (fastRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        
        return fastRunner == 1;
    }
    
    public int getNext(int n) {
        int totalSum = 0;
        while ( n > 0) {
            int d = n % 10;
            totalSum += d * d;
            n = n / 10;
        }
        return totalSum;
    }
}