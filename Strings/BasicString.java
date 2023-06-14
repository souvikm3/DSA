package Strings;

public class BasicString {
    public static void print(String s){
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
    public static void main(String args[]){
        char ch='c';
        
        String str="abcdef";
        
        System.out.println(str.charAt(4));
        System.out.println(str.length());
        System.out.println(str.substring(2, 6));
        System.out.println(str.substring(2));
        System.out.println(str);
        System.out.println(str.contains("abc"));
        print(str);
        
    }
}
