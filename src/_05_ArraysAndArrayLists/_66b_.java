package _05_ArraysAndArrayLists;

public class _66b_ {
    public static void main(String[] args) {
        int[] arr={11,33,42,71};
        int[] brr={20,54,69,81,90,100};
        int[] crr=new int[arr.length+brr.length];

        int i=arr.length-1;  //for arr
        int j=brr.length-1;  //for brr
        int k=arr.length+brr.length-1;  //for crr
        //merging
        while( i>=0 && j>=0){
            if(arr[i]>=brr[j]){
                crr[k]=arr[i];
                // k++;
                i--;
            }
            else{// brr[j]<arr[i]
                crr[k]=brr[j];
                //k++;
                j--;
            }
            k--;
        }

        if(i<0){
            while(j>=0){
                crr[k]=brr[j];
                k--;
                j--;
            }
        }
        if(j<0){
            while(i>=0){
                crr[k]=arr[i];
                k--;
                i--;
            }
        }
        for( i=0;i<arr.length+brr.length;i++){
            System.out.print(crr[i]+" ");
        }

    }
}
