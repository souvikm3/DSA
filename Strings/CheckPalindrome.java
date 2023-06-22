package Strings;

public class CheckPalindrome {
    public static boolean Check(String s){
        int i=0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }else{
                i++;

                j--;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s="Souvik";
        System.out.println("The string is palindromic or not? "+Check(s));
    }
}
