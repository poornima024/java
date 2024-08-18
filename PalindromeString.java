public class PalindromeString {
    public static void main(String[] args) {
        String s1="nitin";
        System.out.println("Original String is:"+s1);
        String s2="";
        for(int i=0;i<s1.length();i++)
        {
            s2=s1.charAt(i)+s2;
        }
        System.out.println("The reverse string is::"+s2);
        if(s1.equals(s2))
        {
            System.out.println("This is a palindrome string");
        }
        else{
            System.out.println("This is not a palindrome string");
        }
    
    }
    
}
