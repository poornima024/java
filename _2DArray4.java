class _2DArray4
{
      public static void main(String[] args) {
        
            int [][]a = {{1,2},{3,4}};
            // int [][]b = {{6,7},{9,0}};

            int [][] transpose = new int[2][2];

            for(int i=0; i<a.length; i++)
            {
                for(int j=0; j<a.length; j++)
                {
                       transpose[i][j] = a[j][i];
                }
            }

             System.out.println("The Transpose of matrix is : ");

            for(int i=0; i<a.length; i++)
            {
                for(int j=0; j<transpose.length; j++)
                {
                        System.out.print(transpose[i][j]+" ");
                }
                System.out.println();
            }


      }
}