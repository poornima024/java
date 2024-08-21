//package _concept.Array_StringPractice;
//Reverse String program>>..
public class String_Reverse {
    public static void main(String[] args) {
        String s="Hello mansi";
        System.out.println("Original Strin is:"+s);
        String s1="";
        for(int i=0;i<s.length();i++){
            s1=s.charAt(i)+s1;
        }
        System.out.println("Reverse String is:"+s1);
    }
}
