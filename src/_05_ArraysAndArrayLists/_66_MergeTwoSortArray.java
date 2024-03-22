package _05_ArraysAndArrayLists;

public class _66_MergeTwoSortArray {
    public static void main(String[] args) {
        int[] arr={11,33,42,71};
        int[] brr={20,54,69,81,90,100};
        int[] crr=new int[arr.length+brr.length];

        int i=0;  //for arr
        int j=0;  //for brr
        int k=0;  //for crr
         //merging
        while( i<arr.length && j<brr.length){
            if(arr[i]<=brr[j]){
                crr[k]=arr[i];
               // k++;
                i++;
            }
            else{// brr[j]<arr[i]
                crr[k]=brr[j];
                //k++;
                j++;
            }
            k++;
        }

        if(i==arr.length){
            while(j<brr.length){
                crr[k]=brr[j];
                k++;
                j++;
            }
        }
        if(j== brr.length){
            while(i<arr.length){
                crr[k]=arr[i];
                k++;
                i++;
            }
        }
        for( i=0;i<arr.length+brr.length;i++){
            System.out.print(crr[i]+" ");
        }

    }
}
