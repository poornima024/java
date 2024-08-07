package STRING_1;
public class Program13 {

    public static void main(String[] args) {


        
        String str = "thequickbrownfoxxofnworbquickthe";

        int start = 0;
        int maxlength = 1;

        for(int i=0; i<str.length(); i++)
        {
             for(int j=i; j<str.length(); j++)
             {
                   int temp = 1;

                   for(int k=0; k<(j-i+1)/2; k++)
                     if(str.charAt(i+k) != str.charAt(j-k))

                       temp = 0;

                    if(temp!=0 && (j-i+1)>maxlength)
                    {
                         start = i;
                         maxlength = j-i+1;
                    }
             }
        }

         System.out.println("Longest Palindrome Substring is : ");
         printSubString(str,start, start + maxlength - 1);
    }

    public static void printSubString(String s, int first, int last)
    {
          
          for(int i=first; i<=last; ++i)
          {
                System.out.print(s.charAt(i));
          }
    }
    
}
