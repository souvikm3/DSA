package Strings;

public class StringReverse {
    public static String Reverse(String s){
       String result=" ";
       int i=s.length()-1;
       int end=s.length();
       while(i>=0){
        if(s.charAt(i)==' '){
            result= result+ s.substring(i+1, end)+" ";
            end=i;
        }
        i--;
       
       }
        result =result+s.substring(0, end);
       return result;
    }
    public static void main(String args[]){
        String s="I am Souvik Maiti";
        System.out.println("The reversed string is :-"+Reverse(s));
    }
}
