package BubbleSort_algoritmo_v1_growing;
import java.util.*;

import BubbleSort_algoritmo_v1_growing.src.BubbleSort;

public class App {
    public static void main(String args[]){
                
        int array[] = new int[20];
        Scanner inputValue = new Scanner(System.in);
        
        for( int i = 0; i<array.length; i++){
            System.out.println("Write the "+(i)+"º position in array: ");
            array[i] = inputValue.nextInt();
        }

        //call BubbleSort class
        BubbleSort bubbleSort = new BubbleSort(array);
        bubbleSort.sortarray();
        array = bubbleSort.getarray();

        //show ordered array
        for( int i=0; i<array.length; i++)
        {
            System.out.println((i)+"º position in array: "+array[i]);
        }
           
        inputValue.close();
     }
}
