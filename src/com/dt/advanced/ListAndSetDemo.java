package com.dt.advanced;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListAndSetDemo {

    public static void main(String[] args) {

        List<String> fruitList = new ArrayList<String>();

        Set<String> colorSet = new HashSet<String>();
/*
        fruitList.add("Mango");
        fruitList.add("Mango");
        fruitList.add("Orange");
        fruitList.add("Orange");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("PineApple");
  */
     //   System.out.println(fruitList.get(2));

    /*
        for(String fruits:fruitList){

            System.out.println(fruits);


        }
*/
        colorSet.add("black");
        colorSet.add("orange");
        colorSet.add("red");
        colorSet.add("white");
        colorSet.add("blue");
        colorSet.add("red");
        colorSet.add("white");
        colorSet.add("black");

        for(String colors:colorSet){

            System.out.println(colors);
        }




    }
}
