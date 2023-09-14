class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> output= new ArrayList<>();
        int i=1;
        while(i<=n)
        {
            if(i%3==0 && i%5==0)
                output.add("FizzBuzz");
            else if(i%3==0)
                output.add("Fizz");
            else if(i%5==0)
                output.add("Buzz");
            else
                output.add(i+"");
            i++;
        }
        return output;
    }
}