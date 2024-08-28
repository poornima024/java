abstract class _abstract {
    

       public abstract void calculate(double x);
      
}

class Sub1 extends _abstract
{
        public void calculate(double x)
        {
                System.out.println("Square is : "+(x*x));
        }
}
class Sub2 extends _abstract
{
         public void calculate(double x)
         {
               System.out.println("square root is : "+Math.sqrt(x));
         }
}

class Sub3 extends _abstract
{
         public void calculate(double x)
         {
               System.out.println("cube is : "+(x*x*x));
         }
}


class Different
{
       public static void main(String[] args) {
          
             Sub1 s1 = new Sub1();
             Sub2 s2 = new Sub2();

             Sub3 s3 = new Sub3();

             s1.calculate(2.0);
             s2.calculate(5.0);
             s3.calculate(2.0);


       }
}
