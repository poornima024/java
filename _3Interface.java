interface Vehicle
{
       void changewGear(int a);
       void speedUp(int a);
       void applyBrakers(int a);
      
}

class Bicycle implements Vehicle
{
     
     int speed;
     int gear;

     public void changewGear(int a)
     {
              gear = a;
     }

     public void speedUp(int a)
     {
            speed = speed + a;
     }

     public void applyBrakers(int a)
     {
              speed = speed - a;
     }

     public void printStates()
     {
           System.out.println("speed: "+ speed + "gear: "+ gear);
     }
}

class Bike implements Vehicle
{
     
     int speed;
     int gear;

     public void changewGear(int a)
     {
              gear = a;
     }

     public void speedUp(int a)
     {
            
            speed = speed + a;
     }

     public void applyBrakers(int a)
     {
              speed = speed - a;
     }

     public void printStates()
     {
           System.out.println("speed: "+ speed + "gear: "+ gear);
     }
}

public class _3Interface
{
       public static void main(String[] args) {
            
            System.out.println("Bicycle Present State :");
            Bicycle b = new Bicycle();
              b.printStates();


              System.out.println("Bike Present State :");

              Bike bk = new Bike();

             bk.changewGear(2);
             bk.speedUp(3);
             bk.applyBrakers(1);

             bk.printStates();
       }


}