import java.util.Arrays;

class MergeArrays
{

       public static void mergeArrays(int[] nums1, int m,int[] nums2,int n)
       {
               for(int j=0, i = m; j<n; j++) 
               {
                       nums1[i] = nums2[j];
                        i++;
               }

               Arrays.sort(nums1);
               for(int i=0; i<nums1.length; i++)
               {
                    System.out.print(nums1[i]+" ");
               }
       }
        public static void main(String[] args) {
            
               int []arr1 = {1,2,3,0,0,0};
               int []arr2 = {2,5,6};

               int m = 3;
               int n = 3;


                mergeArrays(arr1,m,arr2,n);

        }
}