package BubbleSort_algoritmo_v2_descending;

import java.util.*;

import BubbleSort_algoritmo_v2_descending.src.BubbleSort;

public class App {
    public static void main(String[] args){
        int[] array = new int[10];
        Scanner inputValue = new Scanner(System.in);

        //get the values into the array.
        for(int i=0; i<array.length; i++)
        {
            System.out.println("Write the"+(i)+"º position in array:");
            array[i]=inputValue.nextInt();
        }

        //call BubbleSort class
        BubbleSort bubbleSort = new BubbleSort(array);
        bubbleSort.sortArray();
        array = bubbleSort.getArray();

        //Show sorted array
        for(int i=0; i<array.length; i++)
        {
            System.out.println((i)+"º position in array: "+array[i]);
        }
        
    }    
}
