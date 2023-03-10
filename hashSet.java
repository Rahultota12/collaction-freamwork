import java.util.HashSet;
import java.util.Iterator;
public class hashSet {
      public static void main(String[] args) {
        
        HashSet <Integer>hs=new HashSet<>();

        //add value

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        System.out.println(hs);

        //insert value
        hs.add(6);
        System.out.println(hs);

        //delet value
        hs.remove(6);
        System.out.println(hs);

        // size

       System.out.println( hs.size());

    //iterator
     Iterator i=hs.iterator();
     System.out.println(hs.iterator());

        // exite
      
       System.out.println( hs.contains(3));

       //index of 

    
       

      }
}
