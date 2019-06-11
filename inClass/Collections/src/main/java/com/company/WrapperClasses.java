package com.company;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {
    public static void main(String[] args) {

        // Integer is a wrapper class
        List<Integer> integerList = new ArrayList<Integer>();

        // don't need to do this (old way)
        // Integer oldInteger = new Integer(12);

        // don't need to do this (another old way)
        // myInteger = Integer.valueOf(12);


        // new feature in Java to assign a value to wrapper class object called autoboxing
        Integer myInteger = 32;

        myInteger = 12; //autoboxing: assigning a primitive type value to your wrapper class

        // assigning the wrapper class value to the primitive type value is called unboxing
        int myPrimitive = myInteger;

        integerList.add(myInteger);

        // autoboxing example
        integerList.add(myPrimitive);
    }
}
