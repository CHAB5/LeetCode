class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    
        ArrayList<Character> letters = new ArrayList<>();
        boolean flag = true;
        
        for(int i=0; i < magazine.length(); i++) {
            letters.add(magazine.charAt(i));
        }
        
        for(int j=0; j < ransomNote.length(); j++) {
            if(letters.contains(ransomNote.charAt(j))) {
                int index = letters.indexOf(ransomNote.charAt(j));
                letters.remove(index);
            }
            else {
                flag = false;
                break;
            }
        }
        
        return flag;
    }
}