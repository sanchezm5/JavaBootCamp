/*
Modulus Animation:
    Add several if statements in ModulusAnimation.java so that it draws a little animation of your choosing.
    You must have a minimum of eight (8) different frames of animation, and it must loop smoothly.
*/

package com.trilogyed;

public class ModulusAnimation {
    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 115; i++) {
            if (i % 23 == 0)
                System.out.print(" *Programming is cool* \r");
            if (i % 23 == 1)
                System.out.print(" **Programming is cool \r");
            if (i % 23 == 2)
                System.out.print(" l**Programming is coo \r");
            if (i % 23 == 3)
                System.out.print(" ol**Programming is co \r");
            if (i % 23 == 4)
                System.out.print(" ool**Programming is c \r");
            if (i % 23 == 5)
                System.out.print(" cool**Programming is  \r");
            if (i % 23 == 6)
                System.out.print("  cool**Programming is \r");
            if (i % 23 == 7)
                System.out.print(" s cool**Programming i  \r");
            if (i % 23 == 8)
                System.out.print(" is cool**Programming   \r");
            if (i % 23 == 9)
                System.out.print("  is cool**Programming   \r");
            if (i % 23 == 10)
                System.out.print("  is cool**Programming   \r");
            if (i % 23 == 11)
                System.out.print(" g is cool**Programmin   \r");
            if (i % 23 == 12)
                System.out.print(" ng is cool**Programmi   \r");
            if (i % 23 == 13)
                System.out.print(" ing is cool**Programm   \r");
            if (i % 23 == 14)
                System.out.print(" ming is cool**Program   \r");
            if (i % 23 == 15)
                System.out.print(" mming is cool**Progra   \r");
            if (i % 23 == 16)
                System.out.print(" amming is cool**Progr   \r");
            if (i % 23 == 17)
                System.out.print(" ramming is cool**Prog   \r");
            if (i % 23 == 18)
                System.out.print(" gramming is cool**Pro   \r");
            if (i % 23 == 19)
                System.out.print(" ogramming is cool**Pr   \r");
            if (i % 23 == 20)
                System.out.print(" rogramming is cool**P   \r");
            if (i % 23 == 21)
                System.out.print(" Programming is cool**   \r");
            if (i % 23 == 22)
                System.out.print(" *Programming is cool*   \r");

            Thread.sleep(1000 / 10);
        }
    }
}
