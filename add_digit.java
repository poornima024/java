import java.util.Scanner;

public class add_digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int temp,add = 0;
     

      
        int num = sc.nextInt();

        while(num!=0)
        {
             temp = num%10;
             add += temp;
             num = num/10;
             
              
        }

        System.out.println("The sum Of all digit is : "+add);
          
    }
    
}
