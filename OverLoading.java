public class OverLoading {
    
      public void area(int r)
      {
            System.out.println("Area of circle is: "+(3.14*r*r));
      }
      public void area(float r)
      {
            System.out.println("Area of another circle is: "+(3.14*r*r));
      }

      public static void main(String[] args) {
        
           OverLoading o = new OverLoading();
             o.area(5);
             o.area(5.0f);
      }
}
