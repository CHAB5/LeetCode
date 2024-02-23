class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int maxFruits = 0;
        int left = 0, right = 0;
        Set<Integer> twoFruits = new HashSet<>();
        ArrayList<Integer> maxValues = new ArrayList<>();
        int result = 0;
        
        if(n==0) return 0;
        
        if(n==1) return 1;
        
        // if(n>=2) {
        //     twoFruits.add(fruits[0]);
        //     twoFruits.add(fruits[1]);
        //     maxFruits = 2;
        //     // System.out.println("maxFruits: "+maxFruits);
        // }
        
        while(left<=right && right<n) {
            
            if(twoFruits.size() < 2 || twoFruits.contains(fruits[right])) {
                twoFruits.add(fruits[right]);
                maxFruits += 1;
            }
            else {
                twoFruits.clear();
                twoFruits.add(fruits[right]);
                twoFruits.add(fruits[right-1]);
                
                maxFruits += 1;
                
                int i=right;
                while(twoFruits.contains(fruits[i])) {
                    i--;
                }
                
                left = i+1;
                
                maxFruits = right - left + 1;
                
                
                System.out.println(maxFruits);
            }
            
            
            if(maxFruits > result)
                result = maxFruits;
                
            //maxValues.add(maxFruits);
            right++;
            
        }
        
        
        // int max = 0;
        // for(int i=0; i< maxValues.size(); i++) {
        //     if(maxValues.get(i) > max)
        //         max = maxValues.get(i);
        // }       
        
        return result;
    }
}