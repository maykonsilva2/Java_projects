package BubbleSort_algoritmo_v1_1_growing;

import java.util.Scanner;

import BubbleSort_algoritmo_v1_1_growing.src.BubbleSort;

public class App {
    public static void main(String args[]){
                
        int array[] = new int[10];
        Scanner inputValue = new Scanner(System.in);
        
        for( int  i = 0; i<array.length; i++){
            System.out.println("Write o "+(i)+"º position in array: ");
            array[i] = inputValue.nextInt();
        }

        //call BubbleSort class
        BubbleSort bubbleSort = new BubbleSort(array);
        bubbleSort.sortarray();
        array = bubbleSort.getSortedArray();

        //show ordered array
        for( int i=0; i<array.length; i++)
        {
            System.out.println((i)+"º position in array: "+array[i]);
        }
         inputValue.close();   
     }
    
}

