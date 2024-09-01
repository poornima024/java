import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        int temp = 0;
        int result = 0;

        while(num!=0)
        {
              temp = num%10;
             result += temp*temp*temp;
              num = num/10;

        }

        System.out.println("Armstrong number is : "+result);

    }

}
