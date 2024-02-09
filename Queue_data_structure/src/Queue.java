package Queue_data_structure.src;

public class Queue<T> {
    private T[] arrayQueue;
    private int begin;
    private int end;

    @SuppressWarnings("unchecked")
    public Queue(int size)
    {
        this.begin = this.end = 0;
        this.arrayQueue = (T[]) new Object[size];
    }

    public boolean isFull(){ return ((this.end == this.arrayQueue.length-1) && (this.begin == 0) ) || (this.end == this.begin-1); }

    public boolean isEmpty(){ return this.begin == this.end;}

    public T remove()
    {
        if(isEmpty())
        {
            return null;
        }
        else
        {
            if(this.begin == this.arrayQueue.length){ this.begin = 0; }
            T element = this.arrayQueue[this.begin];
            this.begin++;
            return element;
        }
    }

    public boolean toInsert(T element)
    {
        if(this.end == this.arrayQueue.length){ this.end = 0; }
        if(!isFull())
        {
            this.arrayQueue[this.end++] = element;
            System.out.println(this.end);
            System.out.println("insert "+ this.end);
            return true;
        }
        return false;
    }

    @Override
    public  String toString()
    {
        String beginQueue = "[";
        int currentIndex = this.begin;
        while(currentIndex != this.end)
        {
            System.out.println(beginQueue);
            
            if(currentIndex == this.arrayQueue.length){ currentIndex = 0 ;}

            if(currentIndex == this.end-1)
            {
                beginQueue += this.arrayQueue[currentIndex];
            }
            else 
            {
                beginQueue += this.arrayQueue[currentIndex] + " , ";
            }

            currentIndex++;

        }

        return beginQueue + "]";
    }
}
// link: https://github.com/LuisAraujo/Estrutura-de-Dados-em-Java#3---fila
/*
* @params ArrayQueue; this an vector generic type that will be used to store the elements of the queue.
 * @params private int begin; this variable will be used to point to the first element of the queue.
 * @params private int end; this variable will be used to point to the last element of the queue.
 * 
 * @params begin = end = 0; it will be used to atribute the value 0 to the variables begin and end.
 * @params @SuppressWarnings("unchecked") this annotation will be used to avoid the warning of the compiler.
 */

