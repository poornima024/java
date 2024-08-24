import java.util.Scanner;

public class Fibbonacci_series {

    public static void main(String[] args) {
        
         
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter how many fibbonacci values you want : ");
        int num = sc.nextInt();
        int flag = 0;

         int a = -1;
         int b =1;

         for(int i=0; i<num; i++)
         {
                flag = a + b;
                System.out.print(flag+" ");
                a = b;
                b = flag;
         }


    }
    
}
