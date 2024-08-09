import java.util.Scanner;

public class _35 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First value : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the First value : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operator that you want to perform your values- addition(+), Substraction(-) -,Multiplication(*) ,Division(/),Modulus(%) ");
        char op = sc.next().charAt(0);

        calculator(num1, num2, op);

    }

    public  static void calculator(int num1, int num2, char op) {
        if (op == '+') {
            System.out.println("addition is : " + (num1 + num2));
        }

        else {
            if (op == '-') {
                System.out.println("substraction is : " + (num1 - num2));
            }

            else {
                if (op == '*') {
                    System.out.println("multiplication is : " + (num1 * num2));
                } else {
                    if (op == '/') {
                        System.out.println("Division is : " + (num1 / num2));
                    }

                    else {
                        System.out.println("modulus is : " + (num1 % num2));

                    }
                }
            }
        }
    }
}
