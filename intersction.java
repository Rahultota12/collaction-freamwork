import java.util.*;
public class intersction {
    static int intersctio(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
     int count=0;

     for(int i=0;i<arr1.length;i++){
        set.add(arr1[i]);
     }
     for(int j=0;j<arr2.length;j++){
        if(set.contains(arr2[j])){
            count++;
            set.remove(arr2[j]);
        }
     }
     return count;

    }

    public static void main(String[] args) {
        int arr1[]={7,5,9};
        int arr2[]={5,9,0,7,6,4,3};

       System.out.println( intersctio(arr1, arr2));
    }
}
