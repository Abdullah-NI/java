package _11_recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class _170_Assigment_2_Q7 {
    public static void genrateAllArrays(int[] a, int[] b, List<Integer> current,int i,int j,boolean flag){
        boolean added = false;
        if(flag==true){  //pick element from a[]
            for(int k=i;k<a.length;k++){
                if(current.isEmpty()==true || current.get(current.size()-1)<a[k]){
                    current.add(a[k]);
                    genrateAllArrays(a,b,current,k+1,j,false);
                    current.remove(current.size()-1);
                }
            }
        }
        
        else{  //flag==false   // pick elemenet from b[]
             added=false;
            for(int k=j;k<b.length;k++){
                if(current.get(current.size()-1)<b[k]){
                    current.add(b[k]);
                    added=true;
                    genrateAllArrays(a,b,current,i,k+1,true);
                    current.remove(current.size()-1);
                }

            }

        }
        if(!added && !current.isEmpty()) {
            System.out.println(current);
        }

    }
    public static void main(String[] args) {
        int[] a={10,15,25};
        int[] b={1,5,20,30};
        ArrayList<Integer> current=new ArrayList<>();
        genrateAllArrays(a,b,current,0,0,true);
    }
}
