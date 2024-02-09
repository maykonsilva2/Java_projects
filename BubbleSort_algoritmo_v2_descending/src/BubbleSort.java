package BubbleSort_algoritmo_v2_descending.src;

public class BubbleSort {
    private int[] array;

    public BubbleSort(int[] array) { this.array = array; }
    public int[] getArray() { return this.array; }

    public void sortArray() {
        int iteration = 1, exchanges = 1;

        while(iteration <= this.array.length && exchanges == 1)
        {
            // traverses from the first to the penultimate position of the array
            exchanges = 0;
            for(int i=0; i<this.array.length-1; i++)
            {
                if(this.array[i] < this.array[i+1])
                {
                    int aux = this.array[i];
                    this.array[i] = this.array[i+1];
                    this.array[i+1] = aux;

                    exchanges = 1;
                }
            }
            iteration = iteration+1;
        }
    }
    
}
