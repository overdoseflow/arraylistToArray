/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayExample;

import java.util.Random;
import java.util.*;

public class arrayExample {

    public static void main(String[] args) {
        
        Random r = new Random();
        //first, define a random
        int [] random_array = new int[10];
        int [] sorted = new int[10];
        //and two array which includes 10 value
        ArrayList<Integer> al = new ArrayList<Integer>();
        //adding and arraylist
        System.out.printf("Array numbers:\t");
        //a title
         for (int i = 0; i < random_array.length; i++) {
         //loop over array length
            random_array[i]=r.nextInt(100)+1;
            //adding my basic array some random numbers between 0 - 100
            al.add(random_array[i]);
            //adding same numbers in arraylist
            System.out.print(random_array[i]+ " ");
            //shows them
            Collections.sort(al);
            //sorting in arraylist
        }
         System.out.println();
         System.out.println("Sorted:"+al);
         for (int i = 0; i < sorted.length; i++) {
            sorted[i]=al.get(i);
            //gets sortedd arraylist values and puts them into sorted array
            int third = sorted.length - 3;
            //the last thirth
            int seventh = sorted.length -7;
            //the last seventh
            if(i ==third){ 
                int largest = i;
                System.out.println("Third Largest: "+sorted[i]);}
                //if my loop comes to my third value write them 
            if(i ==seventh){
                int seventh_largest=i;
                System.out.println("Seventh Largest: "+sorted[i]);
                //if my loop comes to my seventh value write them 
            }
        }
        
    }
    
}
