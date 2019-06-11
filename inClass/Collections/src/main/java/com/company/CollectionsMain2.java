package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsMain2 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<String>();

        // check size of myList
        System.out.println("Size of myList = " + myList.size());

        // add elements
        myList.add("Usman");
        myList.add("Sal");
        myList.add("Ofe");
        myList.add("Sal");
        myList.add("Sal");

        // Example: counts number of times Sal is in the array list
      /*
        List<String> newList = new ArrayList<String>();

        while (myList.contains("Sal")) {
            newList.add("Sal");
            myList.remove("Sal");
        }
       */

      //____________________________________________________________another example_______
      /*
        //List<Integer> index = new ArrayList<Integer>();

        // This will print out the indices where "Sal" is in the array list
        for (int i = 0; i < myList.size(); i++) {
            if(myList.get(i).equals("Sal")) {
                //index.add(i);

                System.out.println("index Sat at - " + i);
            }
        }

       */

      /*
        //____________________________________________________________another example_______
        System.out.println("Size before remove = " + myList.size());

        // will remove first instance of "Sal"
        myList.remove("Sal");
        System.out.println("Size after remove = " + myList.size());
        System.out.println(myList);

        // will clear entire array list
        myList.clear();
        System.out.println("Size after clearing arrayList = " + myList.size());

       */

        //____________________________________________________________another example_______
        // another way to loop or iterate through the elements of the array
        Iterator<String> iter = myList.iterator();

        while(iter.hasNext()) {
            System.out.println("List " + iter.next());
        }
    }
}
