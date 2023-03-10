import java.util.*;
public class hashqustion {
    static void mejorty(int num[]){
        HashMap <Integer,Integer> hs=new HashMap<>();
        int n=num.length;
        for(int i=0;i<n;i++){
            if(hs.containsKey(num[i])){
                hs.put(num[i], hs.get(num[i])+1);
            }
            else{
                hs.put(num[i], 1);
            }
        }
        for(int key:hs.keySet()){
            if(hs.get(key)>n/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        int num[]={1,2,3,5,1,3,1,5,1};

      mejorty(num);
    }
}
