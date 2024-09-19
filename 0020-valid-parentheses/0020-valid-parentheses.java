class Solution {
    /*
    Input: contains only characters - '(',')'
    Can be empty
    Validity:
    1. Only if open bracket closed by the same type of bracket
    2. Closed in correct order
    3. Closed bracket have corresponding open bracket of the same type
    */
    
    //Hash table takes care of the Mappings
    private HashMap<Character, Character> mappings;
    
    //Initiliaze hash map with mappings. Make code easier to read
    public Solution() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }
    
    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            //If the current character is a closing bracket
            if(this.mappings.containsKey(c)) {
                   //Get the top element of the Stack. If the Stack is empty, set a dummy
                char topElement = charStack.empty() ? '#' : charStack.pop();
                
                //If the mapping for this bracket doesn't match the stack's top element, return false
                if(topElement != this.mappings.get(c)) {
                    return false;
                } 
            } else {
                //If it was an opening bracket, push to the stack
                charStack.push(c);
            }
        }
        
        //If the stack still contains elements, then it is an invalid expression.
        
        return charStack.isEmpty();
            
        }
        
    
}