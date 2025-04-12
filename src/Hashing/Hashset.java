package Hashing;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        //creating
        HashSet<Integer> set=new HashSet<>();
        //insert
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(7);

       // System.out.println(set.size()); //returns 3 as there are 3 unique numbers

        Iterator<Integer> it=set.iterator();
        System.out.println(it.next());
        for(int e: set){   //can also use enhanced for loop to print them
            System.out.println(e);
        }

        while(it.hasNext()){   //printing the hashset
            System.out.println(it.next());
        }
        //Search- contains
        System.out.println(set.contains(1)); //returns true
        System.out.println(set.contains(5)); //returns false
         
        set.remove(1);
        System.out.println(set.contains(1));

        System.out.println(set);
    }
}
