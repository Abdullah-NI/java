package _09_basicSortingAlgorithms;

public class _124_PushZeroToEnd {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //Push Zero To End while maintaing the relative order of element
        int[] arr={1,0,4,0,2,-40,100,0,5};
        print(arr);
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            boolean flag =true;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if(flag==true) break;
        }
        print(arr);

    }
}
