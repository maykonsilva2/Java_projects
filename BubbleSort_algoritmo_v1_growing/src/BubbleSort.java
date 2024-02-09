package BubbleSort_algoritmo_v1_growing.src;

public class BubbleSort {
    private int[] array;

    //constructor
    public BubbleSort(int[] array){ this.array = array; }
    public int[] getarray(){ return this.array; }

    //Bubble Sort
    public void sortarray(){
        // amount of array elements
        for(int n=0; n < this.array.length; n++)
        {
            // traverses the first to last position of the array
            for(int i=0; i < this.array.length - 1; i++)
            {
                if(this.array[i] > this.array[i+1])
                {
                    int aux = this.array[i];
                    this.array[i] = this.array[i+1];
                    this.array[i+1] = aux;

                }
            }
            
        }
    }


}
