public class Pro12 {
     public static void main(String[] args) {

           String str = "Great responsibility";
           int count;
           char []s = str.toCharArray();

           for(int i=0; i<s.length; i++)
           {
                 count = 1;
                for(int  j=i+1; j<s.length; j++)
                {
                    if(s[i] == s[j] && s[i]  != ' ')
                    {
                           count++;

                           s[j] = '0';
                    }
                }

                if(count > 1 && s[i] != '0')
                {
                     System.out.print(s[i]+" ");
                }
           }


         
     }
 }
 