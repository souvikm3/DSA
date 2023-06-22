package Strings;

public class FindSubstring {
    public static void SubString(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i, j));
            }
        }
    }
    public static void main(String args[]){
        String str="abcdefg";
        SubString(str);
    }
}
