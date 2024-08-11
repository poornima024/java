import java.util.Scanner;

public class Prime_No {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        int i;
        for(i=2; i<(num/2); i++)
        {
              if(num%i == 0)
              {
                     break;
              }
        }

        if(num == i)
        {
             System.out.println("Number is prime no.");
        }
        else{
            {
                System.out.println("Number is not prime no.");

            }

    }

    }
}
