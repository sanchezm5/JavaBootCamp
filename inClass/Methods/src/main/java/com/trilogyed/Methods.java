package com.trilogyed;

public class Methods {

    public static int calcArea(int height, int width) {
        int area = height * width;
        return area;
    }

    public static void main(String[] args) {

        int area = 0;

        calcArea(12,15);

        System.out.println(area);
    }
}
