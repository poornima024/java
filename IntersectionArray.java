//wp to a intersection a array...
public class IntersectionArray {
    public static void main(String[] args) {
         int a[]={4,3,7,9,2,0,6};
         int b[]={5,1,4,2,3,7,9};
         System.out.println("The intersection of array a and b is::");
         for(int  i=0;i<a.length;i++)
         {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.print(a[i]+" ");
                    
                }
                else{

                }
            }
         }
    }
}