import java.util.Scanner;

public class Palindrome {
    
     public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter any number : ");
         int num = sc.nextInt();
         int x = num;
         int temp = 0;
         int rev  = 0;

         while(num!=0)

         {
               temp = num%10;
               rev =  temp + rev*10;
               num = num/10;
         }

        if(rev == x)
        {
             System.out.println("This is a Palindrome Number");
        }
        else 
        {
            System.out.println("This is not Palindrome Number");

        }
     }
}
