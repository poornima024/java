public class DuplicateArrayElements {
  public static void main(String[] args) {
        int array[]={1,2,3,4,5,5,6,1};
        int count;
        for(int i=0;i<array.length;i++){
            count=1;
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j] && array[i]!=' '){
                    count++;
                    array[j]=0;
                }
            }
            
            if(count>1 &&array[i]!=0){
                System.out.print(array[i]+" ");
            }

        }
    }
 }
