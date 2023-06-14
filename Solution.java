class Solution {
    
    public static boolean isPalindrome(int x) {
        // int temp=x;
        int rem; 
        int rev=0;
        while(x>0){
            rem=x%10;
            //  rev=0;
            rev=(rev*10)+rem;
            x=x/10;
            
        }
        if(x==rev){
                return true;
            }
        return false;
    }
    public static void main(String args[]){
        int x=555;
        System.out.println(isPalindrome(x));
       
    }
}