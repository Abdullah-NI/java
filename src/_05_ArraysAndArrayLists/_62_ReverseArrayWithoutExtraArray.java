package _05_ArraysAndArrayLists;

public class _62_ReverseArrayWithoutExtraArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        int i=0,j=n-1;
        while(i<j){
            int  temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
//        //by for loop
//        for(int i=0,j=n-1;i<j;i++,j--){
//          int  temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//        }
        //Or
//        for(int i=0;i<n/2;i++){
//            int j=n-1-i;
//            temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//        }
        System.out.println();
        for( i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
