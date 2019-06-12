/*
    Using the starter code provided, refactor the following array activities to use an ArrayList instead: WordList
 */

package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class WordList {

    public static void main(String[] args) {
         /* Original Code to be refactored:

        String[] wordList = {"byte", "case", "catch", "class", "const", "continue", "do", "double", "else", "extends"};

        for(String element : wordList) {
            System.out.println(element);
        }

          */

         // Create a list of words using the List interface and the ArrayList class
        List<String> wordsList = new ArrayList<>();

        // Add these words to the array list to produce the original given array
        wordsList.add("byte");
        wordsList.add("case");
        wordsList.add("catch");
        wordsList.add("class");
        wordsList.add("const");
        wordsList.add("continue");
        wordsList.add("do");
        wordsList.add("double");
        wordsList.add("else");
        wordsList.add("extends");

        // This will display the array
        System.out.println("This is the wordList array = " + wordsList + "\n");

        // Create an object which implements the Iterator interface
        Iterator<String> iter = wordsList.iterator();

        // As long as there is a next element in the array list, display the word in the list
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
