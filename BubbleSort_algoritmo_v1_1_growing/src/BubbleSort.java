package BubbleSort_algoritmo_v1_1_growing.src;

public class BubbleSort {
    private int[] array;

    public BubbleSort(int[] array){ this.array = array; }
    public int[] getSortedArray(){ return this.array; }

    public void sortarray()
    {
        // 'iteration' this does not represent the size of the array, but the number of iterations thar the have already been performed
        for(int iteration=0; iteration < this.array.length; iteration++)
        {
            //traverses the last  to first position of the array
            for(int position=this.array.length-1; position > iteration; position--)
            {
                if (this.array[position] < this.array[position - 1])
                {
                    int temp = this.array[position];
                    this.array[position] = this.array[position-1];
                    this.array[position-1] = temp;

                }
            }
        }
    }
}

/*
 * para j = 0 até array.length faca passo +1
 * inicio
 *      para i = array.length  até j faca passo -1
 *          inicio
 *              se array[i] < array[i-1] entao
 *              entao 
 *                  aux = array[i]
 *                  array[i] = array[i-1]
 *                  array[i-1] = aux
 *               fimse
 *      fimpara
 * fimpara
 */