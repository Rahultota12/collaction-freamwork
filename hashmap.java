import java.util.HashMap;
public class hashmap{
    public static void main(String[] args) {
        HashMap<String ,Integer> hm=new HashMap<>();
        
        
        //value input

        hm.put("india", 130);
        hm.put("china", 150);
        hm.put("uae", 160);
        hm.put("usa", 170);
        hm.put("astrulia", 180);
        hm.put("englend", 100);

        System.out.println(hm);

        //value update

        hm.put("india", 200);

        System.out.println(hm);

        //search 


        if(hm.containsKey("india")){
        System.out.println("india exite");
        }
          
        //get value
     System.out.println(  hm.get("china"));

          //deleted 

        System.out.println(hm.remove("china"));
        System.out.println(hm);

        //key change the value

        System.out.println(hm.replace("india", 200, 100));
        System.out.println(hm);
         
         // exite value

        System.out.println(hm.containsValue(100));

        //remove  key and value

        System.out.println(hm.remove("india",100));
        
        System.out.println(hm);

    }
}