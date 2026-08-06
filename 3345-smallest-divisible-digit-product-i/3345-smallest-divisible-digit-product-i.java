class Solution {
    public int smallestNumber(int n, int t) {
       while(true) {
        int product = 1;
        int temp = n;
        
        // Calculate the product of the digits
        while(temp > 0) {
            product *= temp%10; // find the last digit 
            temp /= 10; // remove the last digit 
        }

        if(product % t == 0) {
            return n;
        }
         
        n++;
       }
    }
}