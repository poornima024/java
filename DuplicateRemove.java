public class DuplicateRemove {

      public static int Duplicate_remove(int[] a) {
            int j = 1;
            for (int i = 1; i < a.length; i++) {

                  if (a[i] != a[i - 1]) {
                        a[j] = a[i];
                        j++;
                  }

            }

            for (int i = 0; i < a.length; i++) {
                  System.out.println(a[i]);
            }
            return j;
      }

      public static void main(String[] args) {

            int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

            System.out.println(Duplicate_remove(nums));
      }
}
