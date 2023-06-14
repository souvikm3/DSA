package Strings;

public class CountWords {
    public static int CountWord(String str){
if(str.length()==0){
    return 0;
}
int space=0;
for(int i=0;i<str.length();i++){
    if(str.charAt(i)==' '){
        space++;
    }
}
return space + 1;
    }
    public static void main(String args[]){
        String str="I am Souvik";
        System.out.println(CountWord(str));
    }
}
